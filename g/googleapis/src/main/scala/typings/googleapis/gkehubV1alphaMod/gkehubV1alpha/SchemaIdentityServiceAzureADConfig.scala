package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceAzureADConfig extends StObject {
  
  /**
    * ID for the registered client application that makes authentication requests to the Azure AD identity provider.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Unencrypted AzureAD client secret will be passed to the GKE Hub CLH.
    */
  var clientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Encrypted AzureAD client secret.
    */
  var encryptedClientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The redirect URL that kubectl uses for authorization.
    */
  var kubectlRedirectUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of Azure AD account to be authenticated. Supported values are or for accounts belonging to a specific tenant.
    */
  var tenant: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentityServiceAzureADConfig {
  
  inline def apply(): SchemaIdentityServiceAzureADConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceAzureADConfig]
  }
  
  extension [Self <: SchemaIdentityServiceAzureADConfig](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setEncryptedClientSecret(value: String): Self = StObject.set(x, "encryptedClientSecret", value.asInstanceOf[js.Any])
    
    inline def setEncryptedClientSecretNull: Self = StObject.set(x, "encryptedClientSecret", null)
    
    inline def setEncryptedClientSecretUndefined: Self = StObject.set(x, "encryptedClientSecret", js.undefined)
    
    inline def setKubectlRedirectUri(value: String): Self = StObject.set(x, "kubectlRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setKubectlRedirectUriNull: Self = StObject.set(x, "kubectlRedirectUri", null)
    
    inline def setKubectlRedirectUriUndefined: Self = StObject.set(x, "kubectlRedirectUri", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantNull: Self = StObject.set(x, "tenant", null)
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
  }
}
