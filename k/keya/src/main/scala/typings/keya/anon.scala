package typings.keya

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key[T] extends StObject {
    
    var key: String
    
    var value: T
  }
  object Key {
    
    @scala.inline
    def apply[T](key: String, value: T): Key[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[T]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[?], T] (val x: Self & Key[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T] extends StObject {
    
    var key: js.Any
    
    var value: T
  }
  object Value {
    
    @scala.inline
    def apply[T](key: js.Any, value: T): Value[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
