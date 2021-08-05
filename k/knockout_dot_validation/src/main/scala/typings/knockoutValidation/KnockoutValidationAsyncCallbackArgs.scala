package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationAsyncCallbackArgs extends StObject {
  
  var isValid: Boolean
  
  var message: String
}
object KnockoutValidationAsyncCallbackArgs {
  
  inline def apply(isValid: Boolean, message: String): KnockoutValidationAsyncCallbackArgs = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationAsyncCallbackArgs]
  }
  
  extension [Self <: KnockoutValidationAsyncCallbackArgs](x: Self) {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
