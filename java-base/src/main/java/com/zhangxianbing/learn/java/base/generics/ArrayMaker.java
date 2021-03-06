package com.zhangxianbing.learn.java.base.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 对于泛型中创建数组,使用Array.newInstance()是推荐的方式
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> strArrMaker = new ArrayMaker<>(String.class);
        String[] strArr = strArrMaker.create(9);
        System.out.println(Arrays.toString(strArr));
    }
}
