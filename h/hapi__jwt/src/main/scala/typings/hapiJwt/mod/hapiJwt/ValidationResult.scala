package typings.hapiJwt.mod.hapiJwt

import typings.hapiHapi.libTypesResponseMod.ResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationResult extends StObject {
  
  /**
    * Object passed back to the application in request.auth.credentials.
    */
  var credentials: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Boolean that should be set to true if additional validation passed, otherwise false.
    */
  var isValid: Boolean
  
  /**
    * Will be used immediately as a takeover response. isValid and credentials are ignored if provided.
    */
  var response: js.UndefOr[ResponseObject] = js.undefined
}
object ValidationResult {
  
  inline def apply(isValid: Boolean): ValidationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: ResponseObject): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
