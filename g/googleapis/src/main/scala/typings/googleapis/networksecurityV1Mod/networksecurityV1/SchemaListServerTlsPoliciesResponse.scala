package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListServerTlsPoliciesResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of ServerTlsPolicy resources.
    */
  var serverTlsPolicies: js.UndefOr[js.Array[SchemaServerTlsPolicy]] = js.undefined
}
object SchemaListServerTlsPoliciesResponse {
  
  inline def apply(): SchemaListServerTlsPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServerTlsPoliciesResponse]
  }
  
  extension [Self <: SchemaListServerTlsPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServerTlsPolicies(value: js.Array[SchemaServerTlsPolicy]): Self = StObject.set(x, "serverTlsPolicies", value.asInstanceOf[js.Any])
    
    inline def setServerTlsPoliciesUndefined: Self = StObject.set(x, "serverTlsPolicies", js.undefined)
    
    inline def setServerTlsPoliciesVarargs(value: SchemaServerTlsPolicy*): Self = StObject.set(x, "serverTlsPolicies", js.Array(value*))
  }
}
