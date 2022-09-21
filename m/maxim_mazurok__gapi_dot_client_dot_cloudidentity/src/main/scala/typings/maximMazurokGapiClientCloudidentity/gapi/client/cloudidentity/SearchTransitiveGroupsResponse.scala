package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitiveGroupsResponse extends StObject {
  
  /** List of transitive groups satisfying the query. */
  var memberships: js.UndefOr[js.Array[GroupRelation]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results available for listing. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchTransitiveGroupsResponse {
  
  inline def apply(): SearchTransitiveGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitiveGroupsResponse]
  }
  
  extension [Self <: SearchTransitiveGroupsResponse](x: Self) {
    
    inline def setMemberships(value: js.Array[GroupRelation]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: GroupRelation*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
