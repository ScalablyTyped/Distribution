package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx[TOther]
    extends StObject
       with /* x */ NumberDictionary[TOther] {
    
    var length: Double
  }
  object Dictx {
    
    inline def apply[TOther](length: Double): Dictx[TOther] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx[TOther]]
    }
    
    extension [Self <: Dictx[?], TOther](x: Self & Dictx[TOther]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictxLength[U]
    extends StObject
       with /* x */ NumberDictionary[U] {
    
    var length: Double
  }
  object DictxLength {
    
    inline def apply[U](length: Double): DictxLength[U] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxLength[U]]
    }
    
    extension [Self <: DictxLength[?], U](x: Self & DictxLength[U]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictxNumberT[T]
    extends StObject
       with /* x */ NumberDictionary[T] {
    
    var length: Double
  }
  object DictxNumberT {
    
    inline def apply[T](length: Double): DictxNumberT[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberT[T]]
    }
    
    extension [Self <: DictxNumberT[?], T](x: Self & DictxNumberT[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictxNumberTInner[TInner]
    extends StObject
       with /* x */ NumberDictionary[TInner] {
    
    var length: Double
  }
  object DictxNumberTInner {
    
    inline def apply[TInner](length: Double): DictxNumberTInner[TInner] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberTInner[TInner]]
    }
    
    extension [Self <: DictxNumberTInner[?], TInner](x: Self & DictxNumberTInner[TInner]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictxNumberTResult[TResult]
    extends StObject
       with /* x */ NumberDictionary[TResult] {
    
    var length: Double
  }
  object DictxNumberTResult {
    
    inline def apply[TResult](length: Double): DictxNumberTResult[TResult] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberTResult[TResult]]
    }
    
    extension [Self <: DictxNumberTResult[?], TResult](x: Self & DictxNumberTResult[TResult]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key[TKey, TValue] extends StObject {
    
    var key: TKey
    
    var value: TValue
  }
  object Key {
    
    inline def apply[TKey, TValue](key: TKey, value: TValue): Key[TKey, TValue] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[TKey, TValue]]
    }
    
    extension [Self <: Key[?, ?], TKey, TValue](x: Self & (Key[TKey, TValue])) {
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length[TCollection]
    extends StObject
       with /* x */ NumberDictionary[TCollection] {
    
    var length: Double
  }
  object Length {
    
    inline def apply[TCollection](length: Double): Length[TCollection] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length[TCollection]]
    }
    
    extension [Self <: Length[?], TCollection](x: Self & Length[TCollection]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T] extends StObject {
    
    var key: String
    
    var value: T
  }
  object Value {
    
    inline def apply[T](key: String, value: T): Value[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    extension [Self <: Value[?], T](x: Self & Value[T]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
