package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse extends StObject {
  
  /**
    * The secret key (also known as shared secret) authorizes communication between your application backend and the reCAPTCHA Enterprise server to create an assessment. The secret key needs to be kept safe for security purposes.
    */
  var legacySecretKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse](x: Self) {
    
    inline def setLegacySecretKey(value: String): Self = StObject.set(x, "legacySecretKey", value.asInstanceOf[js.Any])
    
    inline def setLegacySecretKeyNull: Self = StObject.set(x, "legacySecretKey", null)
    
    inline def setLegacySecretKeyUndefined: Self = StObject.set(x, "legacySecretKey", js.undefined)
  }
}
