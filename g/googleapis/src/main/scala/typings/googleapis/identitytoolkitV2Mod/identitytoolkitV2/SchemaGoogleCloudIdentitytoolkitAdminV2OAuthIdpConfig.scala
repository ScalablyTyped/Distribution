package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig extends StObject {
  
  /**
    * The client id of an OAuth client.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The client secret of the OAuth client, to enable OIDC code flow.
    */
  var clientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The config's display name set by developers.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if allows the user to sign in with the provider.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * For OIDC Idps, the issuer identifier.
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the OAuthIdpConfig resource, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'. Ignored during create requests.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The response type to request for in the OAuth authorization flow. You can set either `id_token` or `code` to true, but not both. Setting both types to be simultaneously true (`{code: true, id_token: true\}`) is not yet supported.
    */
  var responseType: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponseType(value: SchemaGoogleCloudIdentitytoolkitAdminV2OAuthResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
