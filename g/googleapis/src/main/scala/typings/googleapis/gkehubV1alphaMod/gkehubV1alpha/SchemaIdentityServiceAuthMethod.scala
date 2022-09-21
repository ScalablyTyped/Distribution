package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceAuthMethod extends StObject {
  
  /**
    * AzureAD specific Configuration.
    */
  var azureadConfig: js.UndefOr[SchemaIdentityServiceAzureADConfig] = js.undefined
  
  /**
    * GoogleConfig specific configuration
    */
  var googleConfig: js.UndefOr[SchemaIdentityServiceGoogleConfig] = js.undefined
  
  /**
    * Identifier for auth config.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OIDC specific configuration.
    */
  var oidcConfig: js.UndefOr[SchemaIdentityServiceOidcConfig] = js.undefined
  
  /**
    * Proxy server address to use for auth method.
    */
  var proxy: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentityServiceAuthMethod {
  
  inline def apply(): SchemaIdentityServiceAuthMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceAuthMethod]
  }
  
  extension [Self <: SchemaIdentityServiceAuthMethod](x: Self) {
    
    inline def setAzureadConfig(value: SchemaIdentityServiceAzureADConfig): Self = StObject.set(x, "azureadConfig", value.asInstanceOf[js.Any])
    
    inline def setAzureadConfigUndefined: Self = StObject.set(x, "azureadConfig", js.undefined)
    
    inline def setGoogleConfig(value: SchemaIdentityServiceGoogleConfig): Self = StObject.set(x, "googleConfig", value.asInstanceOf[js.Any])
    
    inline def setGoogleConfigUndefined: Self = StObject.set(x, "googleConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOidcConfig(value: SchemaIdentityServiceOidcConfig): Self = StObject.set(x, "oidcConfig", value.asInstanceOf[js.Any])
    
    inline def setOidcConfigUndefined: Self = StObject.set(x, "oidcConfig", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
