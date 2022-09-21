package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityAwareProxyClient extends StObject {
  
  /**
    * Human-friendly name given to the OAuth client.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique identifier of the OAuth client.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Client secret of the OAuth client.
    */
  var secret: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentityAwareProxyClient {
  
  inline def apply(): SchemaIdentityAwareProxyClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityAwareProxyClient]
  }
  
  extension [Self <: SchemaIdentityAwareProxyClient](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
