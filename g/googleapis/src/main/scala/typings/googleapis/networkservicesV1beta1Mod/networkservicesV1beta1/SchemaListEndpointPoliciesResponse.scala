package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEndpointPoliciesResponse extends StObject {
  
  /**
    * List of EndpointPolicy resources.
    */
  var endpointPolicies: js.UndefOr[js.Array[SchemaEndpointPolicy]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEndpointPoliciesResponse {
  
  inline def apply(): SchemaListEndpointPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEndpointPoliciesResponse]
  }
  
  extension [Self <: SchemaListEndpointPoliciesResponse](x: Self) {
    
    inline def setEndpointPolicies(value: js.Array[SchemaEndpointPolicy]): Self = StObject.set(x, "endpointPolicies", value.asInstanceOf[js.Any])
    
    inline def setEndpointPoliciesUndefined: Self = StObject.set(x, "endpointPolicies", js.undefined)
    
    inline def setEndpointPoliciesVarargs(value: SchemaEndpointPolicy*): Self = StObject.set(x, "endpointPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
