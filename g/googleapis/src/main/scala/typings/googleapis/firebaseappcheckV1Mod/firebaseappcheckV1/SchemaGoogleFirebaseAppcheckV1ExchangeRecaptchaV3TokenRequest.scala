package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaV3TokenRequest extends StObject {
  
  /**
    * Required. The reCAPTCHA token as returned by the [reCAPTCHA v3 JavaScript API](https://developers.google.com/recaptcha/docs/v3).
    */
  var recaptchaV3Token: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaV3TokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaV3TokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaV3TokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaV3TokenRequest](x: Self) {
    
    inline def setRecaptchaV3Token(value: String): Self = StObject.set(x, "recaptchaV3Token", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaV3TokenNull: Self = StObject.set(x, "recaptchaV3Token", null)
    
    inline def setRecaptchaV3TokenUndefined: Self = StObject.set(x, "recaptchaV3Token", js.undefined)
  }
}
