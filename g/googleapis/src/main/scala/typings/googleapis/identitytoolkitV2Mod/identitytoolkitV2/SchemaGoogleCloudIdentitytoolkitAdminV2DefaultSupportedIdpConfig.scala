package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig extends StObject {
  
  /**
    * Additional config for Apple-based projects.
    */
  var appleSignInConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig] = js.undefined
  
  /**
    * OAuth client ID.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OAuth client secret.
    */
  var clientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if allows the user to sign in with the provider.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the DefaultSupportedIdpConfig resource, for example: "projects/my-awesome-project/defaultSupportedIdpConfigs/google.com"
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig](x: Self) {
    
    inline def setAppleSignInConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig): Self = StObject.set(x, "appleSignInConfig", value.asInstanceOf[js.Any])
    
    inline def setAppleSignInConfigUndefined: Self = StObject.set(x, "appleSignInConfig", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
