package typings.hapiBasic

import org.scalablytyped.runtime.Shortcut
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/basic", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
  
  trait ValidateCustomResponse extends StObject {
    
    var response: js.Any
  }
  object ValidateCustomResponse {
    
    inline def apply(response: js.Any): ValidateCustomResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateCustomResponse]
    }
    
    extension [Self <: ValidateCustomResponse](x: Self) {
      
      inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidateResponse extends StObject {
    
    var credentials: js.UndefOr[js.Any] = js.undefined
    
    var isValid: Boolean
  }
  object ValidateResponse {
    
    inline def apply(isValid: Boolean): ValidateResponse = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateResponse]
    }
    
    extension [Self <: ValidateResponse](x: Self) {
      
      inline def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
}
