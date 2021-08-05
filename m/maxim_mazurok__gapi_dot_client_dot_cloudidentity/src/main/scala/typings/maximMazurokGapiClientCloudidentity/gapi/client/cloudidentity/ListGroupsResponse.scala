package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsResponse extends StObject {
  
  /** Groups returned in response to list request. The results are not sorted. */
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results available for listing. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGroupsResponse {
  
  inline def apply(): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsResponse]
  }
  
  extension [Self <: ListGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
