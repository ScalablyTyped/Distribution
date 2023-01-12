package typings.log4javascript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppendResult extends StObject {
    
    var appendResult: Boolean
    
    var isError: Boolean
  }
  object AppendResult {
    
    inline def apply(appendResult: Boolean, isError: Boolean): AppendResult = {
      val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppendResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppendResult] (val x: Self) extends AnyVal {
      
      inline def setAppendResult(value: Boolean): Self = StObject.set(x, "appendResult", value.asInstanceOf[js.Any])
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var value: String
  }
  object Name {
    
    inline def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
