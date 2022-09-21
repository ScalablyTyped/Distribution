package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientTlsPoliciesResponse extends StObject {
  
  /**
    * List of ClientTlsPolicy resources.
    */
  var clientTlsPolicies: js.UndefOr[js.Array[SchemaClientTlsPolicy]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListClientTlsPoliciesResponse {
  
  inline def apply(): SchemaListClientTlsPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientTlsPoliciesResponse]
  }
  
  extension [Self <: SchemaListClientTlsPoliciesResponse](x: Self) {
    
    inline def setClientTlsPolicies(value: js.Array[SchemaClientTlsPolicy]): Self = StObject.set(x, "clientTlsPolicies", value.asInstanceOf[js.Any])
    
    inline def setClientTlsPoliciesUndefined: Self = StObject.set(x, "clientTlsPolicies", js.undefined)
    
    inline def setClientTlsPoliciesVarargs(value: SchemaClientTlsPolicy*): Self = StObject.set(x, "clientTlsPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
