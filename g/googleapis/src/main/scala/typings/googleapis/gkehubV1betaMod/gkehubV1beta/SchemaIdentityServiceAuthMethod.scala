package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceAuthMethod extends StObject {
  
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
