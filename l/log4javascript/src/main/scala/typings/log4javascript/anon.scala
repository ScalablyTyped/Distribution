package typings.log4javascript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AppendResult extends StObject {
    
    var appendResult: Boolean = js.native
    
    var isError: Boolean = js.native
  }
  object AppendResult {
    
    @scala.inline
    def apply(appendResult: Boolean, isError: Boolean): AppendResult = {
      val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppendResult]
    }
    
    @scala.inline
    implicit class AppendResultMutableBuilder[Self <: AppendResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendResult(value: Boolean): Self = StObject.set(x, "appendResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
