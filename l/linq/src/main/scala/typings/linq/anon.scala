package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictx[T] extends /* x */ NumberDictionary[T] {
    
    var length: Double = js.native
  }
  object Dictx {
    
    @scala.inline
    def apply[T](length: Double): Dictx[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx[T]]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx[_], T] (val x: Self with Dictx[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DictxLength[TCollection] extends /* x */ NumberDictionary[TCollection] {
    
    var length: Double = js.native
  }
  object DictxLength {
    
    @scala.inline
    def apply[TCollection](length: Double): DictxLength[TCollection] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxLength[TCollection]]
    }
    
    @scala.inline
    implicit class DictxLengthMutableBuilder[Self <: DictxLength[_], TCollection] (val x: Self with DictxLength[TCollection]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DictxNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
    
    var length: Double = js.native
  }
  object DictxNumberTInner {
    
    @scala.inline
    def apply[TInner](length: Double): DictxNumberTInner[TInner] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberTInner[TInner]]
    }
    
    @scala.inline
    implicit class DictxNumberTInnerMutableBuilder[Self <: DictxNumberTInner[_], TInner] (val x: Self with DictxNumberTInner[TInner]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DictxNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
    
    var length: Double = js.native
  }
  object DictxNumberTResult {
    
    @scala.inline
    def apply[TResult](length: Double): DictxNumberTResult[TResult] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberTResult[TResult]]
    }
    
    @scala.inline
    implicit class DictxNumberTResultMutableBuilder[Self <: DictxNumberTResult[_], TResult] (val x: Self with DictxNumberTResult[TResult]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DictxNumberU[U] extends /* x */ NumberDictionary[U] {
    
    var length: Double = js.native
  }
  object DictxNumberU {
    
    @scala.inline
    def apply[U](length: Double): DictxNumberU[U] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictxNumberU[U]]
    }
    
    @scala.inline
    implicit class DictxNumberUMutableBuilder[Self <: DictxNumberU[_], U] (val x: Self with DictxNumberU[U]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var value: js.Any = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, value: js.Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Length[TOther] extends /* x */ NumberDictionary[TOther] {
    
    var length: Double = js.native
  }
  object Length {
    
    @scala.inline
    def apply[TOther](length: Double): Length[TOther] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length[TOther]]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length[_], TOther] (val x: Self with Length[TOther]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value[TKey, TValue] extends StObject {
    
    var key: TKey = js.native
    
    var value: TValue = js.native
  }
  object Value {
    
    @scala.inline
    def apply[TKey, TValue](key: TKey, value: TValue): Value[TKey, TValue] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TKey, TValue]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[_, _], TKey, TValue] (val x: Self with (Value[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
