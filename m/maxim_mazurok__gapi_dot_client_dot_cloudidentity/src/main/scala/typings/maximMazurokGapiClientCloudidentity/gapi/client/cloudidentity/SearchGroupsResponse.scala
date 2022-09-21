package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchGroupsResponse extends StObject {
  
  /** The `Group` resources that match the search query. */
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  
  /** A continuation token to retrieve the next page of results, or empty if there are no more results available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchGroupsResponse {
  
  inline def apply(): SearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchGroupsResponse]
  }
  
  extension [Self <: SearchGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
