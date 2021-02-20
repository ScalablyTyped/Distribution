package typings.highland

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Array[R] extends StObject {
    
    var array: js.Any = js.native
    
    var stream: js.Any = js.native
    
    var value: R = js.native
  }
  object Array {
    
    @scala.inline
    def apply[R](array: js.Any, stream: js.Any, value: R): Array[R] = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array[R]]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array[_], R] (val x: Self with Array[R]) extends AnyVal {
      
      @scala.inline
      def setArray(value: js.Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.native
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
