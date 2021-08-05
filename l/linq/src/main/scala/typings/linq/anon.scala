package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx[T]
    extends StObject
       with /* x */ NumberDictionary[T] {
    
    var length: Double
  }
  object Dictx {
    
    inline def apply[T](length: Double): Dictx[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx[T]]
    }
    
    extension [Self <: Dictx[?], T](x: Self & Dictx[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictxLength[TCollection]
    extends StObject
       with /* x */ NumberDictionary[TCollection] {
    
    var length: Double
  }
  object DictxLength {
    
    inline def apply[TCollection](length: Double): DictxLength[TCollection] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxLength[TCollection]]
    }
    
    extension [Self <: DictxLength[?], TCollection](x: Self & DictxLength[TCollection]) {
      
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
  
  trait DictxNumberU[U]
    extends StObject
       with /* x */ NumberDictionary[U] {
    
    var length: Double
  }
  object DictxNumberU {
    
    inline def apply[U](length: Double): DictxNumberU[U] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberU[U]]
    }
    
    extension [Self <: DictxNumberU[?], U](x: Self & DictxNumberU[U]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: js.Any
  }
  object Key {
    
    inline def apply(key: String, value: js.Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length[TOther]
    extends StObject
       with /* x */ NumberDictionary[TOther] {
    
    var length: Double
  }
  object Length {
    
    inline def apply[TOther](length: Double): Length[TOther] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length[TOther]]
    }
    
    extension [Self <: Length[?], TOther](x: Self & Length[TOther]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[TKey, TValue] extends StObject {
    
    var key: TKey
    
    var value: TValue
  }
  object Value {
    
    inline def apply[TKey, TValue](key: TKey, value: TValue): Value[TKey, TValue] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TKey, TValue]]
    }
    
    extension [Self <: Value[?, ?], TKey, TValue](x: Self & (Value[TKey, TValue])) {
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
