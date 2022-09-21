package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings extends StObject {
  
  /**
    * If set to true, it means allowed_domains will not be enforced.
    */
  var allowAllDomains: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
    */
  var allowAmpTraffic: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
    */
  var allowedDomains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
    */
  var challengeSecurityPreference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Describes how this key is integrated with the website.
    */
  var integrationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings](x: Self) {
    
    inline def setAllowAllDomains(value: Boolean): Self = StObject.set(x, "allowAllDomains", value.asInstanceOf[js.Any])
    
    inline def setAllowAllDomainsNull: Self = StObject.set(x, "allowAllDomains", null)
    
    inline def setAllowAllDomainsUndefined: Self = StObject.set(x, "allowAllDomains", js.undefined)
    
    inline def setAllowAmpTraffic(value: Boolean): Self = StObject.set(x, "allowAmpTraffic", value.asInstanceOf[js.Any])
    
    inline def setAllowAmpTrafficNull: Self = StObject.set(x, "allowAmpTraffic", null)
    
    inline def setAllowAmpTrafficUndefined: Self = StObject.set(x, "allowAmpTraffic", js.undefined)
    
    inline def setAllowedDomains(value: js.Array[String]): Self = StObject.set(x, "allowedDomains", value.asInstanceOf[js.Any])
    
    inline def setAllowedDomainsNull: Self = StObject.set(x, "allowedDomains", null)
    
    inline def setAllowedDomainsUndefined: Self = StObject.set(x, "allowedDomains", js.undefined)
    
    inline def setAllowedDomainsVarargs(value: String*): Self = StObject.set(x, "allowedDomains", js.Array(value*))
    
    inline def setChallengeSecurityPreference(value: String): Self = StObject.set(x, "challengeSecurityPreference", value.asInstanceOf[js.Any])
    
    inline def setChallengeSecurityPreferenceNull: Self = StObject.set(x, "challengeSecurityPreference", null)
    
    inline def setChallengeSecurityPreferenceUndefined: Self = StObject.set(x, "challengeSecurityPreference", js.undefined)
    
    inline def setIntegrationType(value: String): Self = StObject.set(x, "integrationType", value.asInstanceOf[js.Any])
    
    inline def setIntegrationTypeNull: Self = StObject.set(x, "integrationType", null)
    
    inline def setIntegrationTypeUndefined: Self = StObject.set(x, "integrationType", js.undefined)
  }
}
