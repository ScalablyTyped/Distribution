package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import typings.std.PropertyKey
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictx[?], T] (val x: Self & Dictx[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictxLength[?], TCollection] (val x: Self & DictxLength[TCollection]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictxNumberTInner[?], TInner] (val x: Self & DictxNumberTInner[TInner]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictxNumberTResult[?], TResult] (val x: Self & DictxNumberTResult[TResult]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictxNumberU[?], U] (val x: Self & DictxNumberU[U]) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key[K /* <: PropertyKey */, T] extends StObject {
    
    var key: K
    
    var value: T
  }
  object Key {
    
    inline def apply[K /* <: PropertyKey */, T](key: K, value: T): Key[K, T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[K, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key[?, ?], K /* <: PropertyKey */, T] (val x: Self & (Key[K, T])) extends AnyVal {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length[?], TOther] (val x: Self & Length[TOther]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?, ?], TKey, TValue] (val x: Self & (Value[TKey, TValue])) extends AnyVal {
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
