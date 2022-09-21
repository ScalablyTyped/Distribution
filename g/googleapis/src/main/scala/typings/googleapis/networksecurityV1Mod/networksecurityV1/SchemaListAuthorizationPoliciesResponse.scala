package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAuthorizationPoliciesResponse extends StObject {
  
  /**
    * List of AuthorizationPolicies resources.
    */
  var authorizationPolicies: js.UndefOr[js.Array[SchemaAuthorizationPolicy]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAuthorizationPoliciesResponse {
  
  inline def apply(): SchemaListAuthorizationPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizationPoliciesResponse]
  }
  
  extension [Self <: SchemaListAuthorizationPoliciesResponse](x: Self) {
    
    inline def setAuthorizationPolicies(value: js.Array[SchemaAuthorizationPolicy]): Self = StObject.set(x, "authorizationPolicies", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPoliciesUndefined: Self = StObject.set(x, "authorizationPolicies", js.undefined)
    
    inline def setAuthorizationPoliciesVarargs(value: SchemaAuthorizationPolicy*): Self = StObject.set(x, "authorizationPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
