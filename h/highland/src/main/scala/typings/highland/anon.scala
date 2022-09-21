package typings.highland

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Array[R] extends StObject {
    
    var array: Flattened[Any]
    
    var stream: Flattened[Any]
    
    var value: R
  }
  object Array {
    
    inline def apply[R](array: Flattened[Any], stream: Flattened[Any], value: R): Array[R] = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array[R]]
    }
    
    extension [Self <: Array[?], R](x: Self & Array[R]) {
      
      inline def setArray(value: Flattened[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Flattened[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
