package typings.jsonParseSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): OutputSuccess | OutputError = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[OutputSuccess | OutputError]
  inline def apply(text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): OutputSuccess | OutputError = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[OutputSuccess | OutputError]
  
  @JSImport("json-parse-safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OutputError extends StObject {
    
    var error: js.Error
  }
  object OutputError {
    
    inline def apply(error: js.Error): OutputError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputError] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputSuccess extends StObject {
    
    var value: Any
  }
  object OutputSuccess {
    
    inline def apply(value: Any): OutputSuccess = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputSuccess]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputSuccess] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
