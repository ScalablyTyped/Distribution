package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchGroupsResponse extends StObject {
  
  /** The `Group`s that match the search query. */
  var groups: js.UndefOr[js.Array[Group]] = js.native
  
  /** A continuation token to retrieve the next page of results, or empty if there are no more results available. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SearchGroupsResponse {
  
  @scala.inline
  def apply(): SearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchGroupsResponse]
  }
  
  @scala.inline
  implicit class SearchGroupsResponseMutableBuilder[Self <: SearchGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
