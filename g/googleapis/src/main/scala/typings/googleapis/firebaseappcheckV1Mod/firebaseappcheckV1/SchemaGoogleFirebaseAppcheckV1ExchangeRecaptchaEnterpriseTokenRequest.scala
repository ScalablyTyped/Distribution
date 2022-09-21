package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest extends StObject {
  
  /**
    * Required. The reCAPTCHA token as returned by the [reCAPTCHA Enterprise JavaScript API](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages).
    */
  var recaptchaEnterpriseToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest](x: Self) {
    
    inline def setRecaptchaEnterpriseToken(value: String): Self = StObject.set(x, "recaptchaEnterpriseToken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaEnterpriseTokenNull: Self = StObject.set(x, "recaptchaEnterpriseToken", null)
    
    inline def setRecaptchaEnterpriseTokenUndefined: Self = StObject.set(x, "recaptchaEnterpriseToken", js.undefined)
  }
}
