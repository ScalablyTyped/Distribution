package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaTokenRequest extends StObject {
  
  /**
    * Required. The reCAPTCHA token as returned by the [reCAPTCHA v3 JavaScript API](https://developers.google.com/recaptcha/docs/v3).
    */
  var recaptchaToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaTokenRequest](x: Self) {
    
    inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaTokenNull: Self = StObject.set(x, "recaptchaToken", null)
    
    inline def setRecaptchaTokenUndefined: Self = StObject.set(x, "recaptchaToken", js.undefined)
  }
}
