package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitiveMembershipsResponse extends StObject {
  
  /** List of transitive members satisfying the query. */
  var memberships: js.UndefOr[js.Array[MemberRelation]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchTransitiveMembershipsResponse {
  
  inline def apply(): SearchTransitiveMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitiveMembershipsResponse]
  }
  
  extension [Self <: SearchTransitiveMembershipsResponse](x: Self) {
    
    inline def setMemberships(value: js.Array[MemberRelation]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: MemberRelation*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
