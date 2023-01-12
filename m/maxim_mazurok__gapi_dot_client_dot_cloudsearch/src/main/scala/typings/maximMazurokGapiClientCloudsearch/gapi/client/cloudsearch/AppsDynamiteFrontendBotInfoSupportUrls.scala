package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteFrontendBotInfoSupportUrls extends StObject {
  
  /** Link to the admin configuration webpage for the bot. Configured by Pantheon, may be empty. */
  var adminConfigUrl: js.UndefOr[String] = js.undefined
  
  /** Link to the deletion policy webpage for the bot. Configured by Pantheon, may be empty. */
  var deletionPolicyUrl: js.UndefOr[String] = js.undefined
  
  /** Link to the privacy policy webpage for the bot. May be empty. */
  var privacyPolicyUrl: js.UndefOr[String] = js.undefined
  
  /** Link to the setup webpage for the bot. Configured by Pantheon, may be empty. */
  var setupUrl: js.UndefOr[String] = js.undefined
  
  /** Link to the support webpage for the developer of the bot. May be empty. */
  var supportUrl: js.UndefOr[String] = js.undefined
  
  /** Link to the terms of service webpage for the bot. May be empty. */
  var tosUrl: js.UndefOr[String] = js.undefined
}
object AppsDynamiteFrontendBotInfoSupportUrls {
  
  inline def apply(): AppsDynamiteFrontendBotInfoSupportUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteFrontendBotInfoSupportUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteFrontendBotInfoSupportUrls] (val x: Self) extends AnyVal {
    
    inline def setAdminConfigUrl(value: String): Self = StObject.set(x, "adminConfigUrl", value.asInstanceOf[js.Any])
    
    inline def setAdminConfigUrlUndefined: Self = StObject.set(x, "adminConfigUrl", js.undefined)
    
    inline def setDeletionPolicyUrl(value: String): Self = StObject.set(x, "deletionPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setDeletionPolicyUrlUndefined: Self = StObject.set(x, "deletionPolicyUrl", js.undefined)
    
    inline def setPrivacyPolicyUrl(value: String): Self = StObject.set(x, "privacyPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicyUrlUndefined: Self = StObject.set(x, "privacyPolicyUrl", js.undefined)
    
    inline def setSetupUrl(value: String): Self = StObject.set(x, "setupUrl", value.asInstanceOf[js.Any])
    
    inline def setSetupUrlUndefined: Self = StObject.set(x, "setupUrl", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setTosUrl(value: String): Self = StObject.set(x, "tosUrl", value.asInstanceOf[js.Any])
    
    inline def setTosUrlUndefined: Self = StObject.set(x, "tosUrl", js.undefined)
  }
}
