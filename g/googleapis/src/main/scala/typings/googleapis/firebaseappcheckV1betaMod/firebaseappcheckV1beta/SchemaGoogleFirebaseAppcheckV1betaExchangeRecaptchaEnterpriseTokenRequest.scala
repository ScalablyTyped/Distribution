package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaEnterpriseTokenRequest extends StObject {
  
  /**
    * Required. The reCAPTCHA token as returned by the [reCAPTCHA Enterprise JavaScript API](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages).
    */
  var recaptchaEnterpriseToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaEnterpriseTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaEnterpriseTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaEnterpriseTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangeRecaptchaEnterpriseTokenRequest](x: Self) {
    
    inline def setRecaptchaEnterpriseToken(value: String): Self = StObject.set(x, "recaptchaEnterpriseToken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaEnterpriseTokenNull: Self = StObject.set(x, "recaptchaEnterpriseToken", null)
    
    inline def setRecaptchaEnterpriseTokenUndefined: Self = StObject.set(x, "recaptchaEnterpriseToken", js.undefined)
  }
}
