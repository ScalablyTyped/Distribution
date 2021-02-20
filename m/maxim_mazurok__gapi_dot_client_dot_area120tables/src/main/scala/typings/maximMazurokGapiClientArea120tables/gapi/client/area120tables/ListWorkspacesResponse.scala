package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkspacesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of workspaces. */
  var workspaces: js.UndefOr[js.Array[Workspace]] = js.native
}
object ListWorkspacesResponse {
  
  @scala.inline
  def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  @scala.inline
  implicit class ListWorkspacesResponseMutableBuilder[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWorkspaces(value: js.Array[Workspace]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    @scala.inline
    def setWorkspacesVarargs(value: Workspace*): Self = StObject.set(x, "workspaces", js.Array(value :_*))
  }
}
