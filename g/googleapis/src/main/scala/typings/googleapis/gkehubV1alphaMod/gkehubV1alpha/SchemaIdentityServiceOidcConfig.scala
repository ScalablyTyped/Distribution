package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceOidcConfig extends StObject {
  
  /**
    * PEM-encoded CA for OIDC provider.
    */
  var certificateAuthorityData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID for OIDC client application.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Unencrypted OIDC client secret will be passed to the GKE Hub CLH.
    */
  var clientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag to denote if reverse proxy is used to connect to auth provider. This flag should be set to true when provider is not reachable by Google Cloud Console.
    */
  var deployCloudConsoleProxy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable access token.
    */
  var enableAccessToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Encrypted OIDC Client secret
    */
  var encryptedClientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comma-separated list of key-value pairs.
    */
  var extraParams: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Prefix to prepend to group name.
    */
  var groupPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Claim in OIDC ID token that holds group information.
    */
  var groupsClaim: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI for the OIDC provider. This should point to the level below .well-known/openid-configuration.
    */
  var issuerUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Registered redirect uri to redirect users going through OAuth flow using kubectl plugin.
    */
  var kubectlRedirectUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comma-separated list of identifiers.
    */
  var scopes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Claim in OIDC ID token that holds username.
    */
  var userClaim: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Prefix to prepend to user name.
    */
  var userPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentityServiceOidcConfig {
  
  inline def apply(): SchemaIdentityServiceOidcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceOidcConfig]
  }
  
  extension [Self <: SchemaIdentityServiceOidcConfig](x: Self) {
    
    inline def setCertificateAuthorityData(value: String): Self = StObject.set(x, "certificateAuthorityData", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityDataNull: Self = StObject.set(x, "certificateAuthorityData", null)
    
    inline def setCertificateAuthorityDataUndefined: Self = StObject.set(x, "certificateAuthorityData", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setDeployCloudConsoleProxy(value: Boolean): Self = StObject.set(x, "deployCloudConsoleProxy", value.asInstanceOf[js.Any])
    
    inline def setDeployCloudConsoleProxyNull: Self = StObject.set(x, "deployCloudConsoleProxy", null)
    
    inline def setDeployCloudConsoleProxyUndefined: Self = StObject.set(x, "deployCloudConsoleProxy", js.undefined)
    
    inline def setEnableAccessToken(value: Boolean): Self = StObject.set(x, "enableAccessToken", value.asInstanceOf[js.Any])
    
    inline def setEnableAccessTokenNull: Self = StObject.set(x, "enableAccessToken", null)
    
    inline def setEnableAccessTokenUndefined: Self = StObject.set(x, "enableAccessToken", js.undefined)
    
    inline def setEncryptedClientSecret(value: String): Self = StObject.set(x, "encryptedClientSecret", value.asInstanceOf[js.Any])
    
    inline def setEncryptedClientSecretNull: Self = StObject.set(x, "encryptedClientSecret", null)
    
    inline def setEncryptedClientSecretUndefined: Self = StObject.set(x, "encryptedClientSecret", js.undefined)
    
    inline def setExtraParams(value: String): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsNull: Self = StObject.set(x, "extraParams", null)
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setGroupPrefix(value: String): Self = StObject.set(x, "groupPrefix", value.asInstanceOf[js.Any])
    
    inline def setGroupPrefixNull: Self = StObject.set(x, "groupPrefix", null)
    
    inline def setGroupPrefixUndefined: Self = StObject.set(x, "groupPrefix", js.undefined)
    
    inline def setGroupsClaim(value: String): Self = StObject.set(x, "groupsClaim", value.asInstanceOf[js.Any])
    
    inline def setGroupsClaimNull: Self = StObject.set(x, "groupsClaim", null)
    
    inline def setGroupsClaimUndefined: Self = StObject.set(x, "groupsClaim", js.undefined)
    
    inline def setIssuerUri(value: String): Self = StObject.set(x, "issuerUri", value.asInstanceOf[js.Any])
    
    inline def setIssuerUriNull: Self = StObject.set(x, "issuerUri", null)
    
    inline def setIssuerUriUndefined: Self = StObject.set(x, "issuerUri", js.undefined)
    
    inline def setKubectlRedirectUri(value: String): Self = StObject.set(x, "kubectlRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setKubectlRedirectUriNull: Self = StObject.set(x, "kubectlRedirectUri", null)
    
    inline def setKubectlRedirectUriUndefined: Self = StObject.set(x, "kubectlRedirectUri", js.undefined)
    
    inline def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesNull: Self = StObject.set(x, "scopes", null)
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setUserClaim(value: String): Self = StObject.set(x, "userClaim", value.asInstanceOf[js.Any])
    
    inline def setUserClaimNull: Self = StObject.set(x, "userClaim", null)
    
    inline def setUserClaimUndefined: Self = StObject.set(x, "userClaim", js.undefined)
    
    inline def setUserPrefix(value: String): Self = StObject.set(x, "userPrefix", value.asInstanceOf[js.Any])
    
    inline def setUserPrefixNull: Self = StObject.set(x, "userPrefix", null)
    
    inline def setUserPrefixUndefined: Self = StObject.set(x, "userPrefix", js.undefined)
  }
}
