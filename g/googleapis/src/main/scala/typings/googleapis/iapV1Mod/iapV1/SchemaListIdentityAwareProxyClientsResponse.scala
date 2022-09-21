package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListIdentityAwareProxyClientsResponse extends StObject {
  
  /**
    * Clients existing in the brand.
    */
  var identityAwareProxyClients: js.UndefOr[js.Array[SchemaIdentityAwareProxyClient]] = js.undefined
  
  /**
    * A token, which can be send as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListIdentityAwareProxyClientsResponse {
  
  inline def apply(): SchemaListIdentityAwareProxyClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIdentityAwareProxyClientsResponse]
  }
  
  extension [Self <: SchemaListIdentityAwareProxyClientsResponse](x: Self) {
    
    inline def setIdentityAwareProxyClients(value: js.Array[SchemaIdentityAwareProxyClient]): Self = StObject.set(x, "identityAwareProxyClients", value.asInstanceOf[js.Any])
    
    inline def setIdentityAwareProxyClientsUndefined: Self = StObject.set(x, "identityAwareProxyClients", js.undefined)
    
    inline def setIdentityAwareProxyClientsVarargs(value: SchemaIdentityAwareProxyClient*): Self = StObject.set(x, "identityAwareProxyClients", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
