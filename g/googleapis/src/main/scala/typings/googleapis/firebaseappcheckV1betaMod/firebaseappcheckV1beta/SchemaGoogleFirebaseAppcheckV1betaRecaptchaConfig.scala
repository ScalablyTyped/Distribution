package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig extends StObject {
  
  /**
    * Required. The relative resource name of the reCAPTCHA v3 configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ```
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. The site secret used to identify your service for reCAPTCHA v3 verification. For security reasons, this field will never be populated in any response.
    */
  var siteSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the `site_secret` field was previously set. Since we will never return the `site_secret` field, this field is the only way to find out whether it was previously set.
    */
  var siteSecretSet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the duration for which App Check tokens exchanged from reCAPTCHA tokens will be valid. If unset, a default value of 1 day is assumed. Must be between 30 minutes and 7 days, inclusive.
    */
  var tokenTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaRecaptchaConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSiteSecret(value: String): Self = StObject.set(x, "siteSecret", value.asInstanceOf[js.Any])
    
    inline def setSiteSecretNull: Self = StObject.set(x, "siteSecret", null)
    
    inline def setSiteSecretSet(value: Boolean): Self = StObject.set(x, "siteSecretSet", value.asInstanceOf[js.Any])
    
    inline def setSiteSecretSetNull: Self = StObject.set(x, "siteSecretSet", null)
    
    inline def setSiteSecretSetUndefined: Self = StObject.set(x, "siteSecretSet", js.undefined)
    
    inline def setSiteSecretUndefined: Self = StObject.set(x, "siteSecret", js.undefined)
    
    inline def setTokenTtl(value: String): Self = StObject.set(x, "tokenTtl", value.asInstanceOf[js.Any])
    
    inline def setTokenTtlNull: Self = StObject.set(x, "tokenTtl", null)
    
    inline def setTokenTtlUndefined: Self = StObject.set(x, "tokenTtl", js.undefined)
  }
}
