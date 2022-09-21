package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig extends StObject {
  
  /**
    * The config's display name set by developers.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if allows the user to sign in with the provider.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The SAML IdP (Identity Provider) configuration when the project acts as the relying party.
    */
  var idpConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig] = js.undefined
  
  /**
    * The name of the InboundSamlConfig resource, for example: 'projects/my-awesome-project/inboundSamlConfigs/my-config-id'. Ignored during create requests.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SAML SP (Service Provider) configuration when the project acts as the relying party to receive and accept an authentication assertion issued by a SAML identity provider.
    */
  var spConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2SpConfig] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdpConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    inline def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2SpConfig): Self = StObject.set(x, "spConfig", value.asInstanceOf[js.Any])
    
    inline def setSpConfigUndefined: Self = StObject.set(x, "spConfig", js.undefined)
  }
}
