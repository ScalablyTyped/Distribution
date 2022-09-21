package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig extends StObject {
  
  /**
    * Required. The relative resource name of the reCAPTCHA Enterprise configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaEnterpriseConfig ```
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The score-based site key [created in reCAPTCHA Enterprise](https://cloud.google.com/recaptcha-enterprise/docs/create-key#creating_a_site_key) used to [invoke reCAPTCHA and generate the reCAPTCHA tokens](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages) for your application. Important: This is *not* the `site_secret` (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
    */
  var siteKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise tokens will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
    */
  var tokenTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaRecaptchaEnterpriseConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
    
    inline def setSiteKeyNull: Self = StObject.set(x, "siteKey", null)
    
    inline def setSiteKeyUndefined: Self = StObject.set(x, "siteKey", js.undefined)
    
    inline def setTokenTtl(value: String): Self = StObject.set(x, "tokenTtl", value.asInstanceOf[js.Any])
    
    inline def setTokenTtlNull: Self = StObject.set(x, "tokenTtl", null)
    
    inline def setTokenTtlUndefined: Self = StObject.set(x, "tokenTtl", js.undefined)
  }
}
