package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSupportUrls extends StObject {
  
  /**
    * Link to the admin configuration webpage for the bot. Configured by Pantheon, may be empty.
    */
  var adminConfigUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the deletion policy webpage for the bot. Configured by Pantheon, may be empty.
    */
  var deletionPolicyUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the privacy policy webpage for the bot. May be empty.
    */
  var privacyPolicyUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the setup webpage for the bot. Configured by Pantheon, may be empty.
    */
  var setupUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the support webpage for the developer of the bot. May be empty.
    */
  var supportUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the terms of service webpage for the bot. May be empty.
    */
  var tosUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaSupportUrls {
  
  inline def apply(): SchemaSupportUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSupportUrls]
  }
  
  extension [Self <: SchemaSupportUrls](x: Self) {
    
    inline def setAdminConfigUrl(value: String): Self = StObject.set(x, "adminConfigUrl", value.asInstanceOf[js.Any])
    
    inline def setAdminConfigUrlNull: Self = StObject.set(x, "adminConfigUrl", null)
    
    inline def setAdminConfigUrlUndefined: Self = StObject.set(x, "adminConfigUrl", js.undefined)
    
    inline def setDeletionPolicyUrl(value: String): Self = StObject.set(x, "deletionPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setDeletionPolicyUrlNull: Self = StObject.set(x, "deletionPolicyUrl", null)
    
    inline def setDeletionPolicyUrlUndefined: Self = StObject.set(x, "deletionPolicyUrl", js.undefined)
    
    inline def setPrivacyPolicyUrl(value: String): Self = StObject.set(x, "privacyPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicyUrlNull: Self = StObject.set(x, "privacyPolicyUrl", null)
    
    inline def setPrivacyPolicyUrlUndefined: Self = StObject.set(x, "privacyPolicyUrl", js.undefined)
    
    inline def setSetupUrl(value: String): Self = StObject.set(x, "setupUrl", value.asInstanceOf[js.Any])
    
    inline def setSetupUrlNull: Self = StObject.set(x, "setupUrl", null)
    
    inline def setSetupUrlUndefined: Self = StObject.set(x, "setupUrl", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlNull: Self = StObject.set(x, "supportUrl", null)
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setTosUrl(value: String): Self = StObject.set(x, "tosUrl", value.asInstanceOf[js.Any])
    
    inline def setTosUrlNull: Self = StObject.set(x, "tosUrl", null)
    
    inline def setTosUrlUndefined: Self = StObject.set(x, "tosUrl", js.undefined)
  }
}
