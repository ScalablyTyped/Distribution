package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationAsyncCallbackArgs extends StObject {
  
  var isValid: Boolean
  
  var message: String
}
object KnockoutValidationAsyncCallbackArgs {
  
  @scala.inline
  def apply(isValid: Boolean, message: String): KnockoutValidationAsyncCallbackArgs = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationAsyncCallbackArgs]
  }
  
  @scala.inline
  implicit class KnockoutValidationAsyncCallbackArgsMutableBuilder[Self <: KnockoutValidationAsyncCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
