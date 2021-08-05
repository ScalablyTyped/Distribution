package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesResponse extends StObject {
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of policies. */
  var policies: js.UndefOr[js.Array[Policy]] = js.undefined
}
object ListPoliciesResponse {
  
  inline def apply(): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesResponse]
  }
  
  extension [Self <: ListPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[Policy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
