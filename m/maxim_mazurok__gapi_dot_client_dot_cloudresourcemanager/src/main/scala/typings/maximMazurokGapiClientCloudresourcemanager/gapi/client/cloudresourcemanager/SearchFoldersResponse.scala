package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFoldersResponse extends StObject {
  
  /** A possibly paginated folder search results. the specified parent resource. */
  var folders: js.UndefOr[js.Array[Folder]] = js.native
  
  /** A pagination token returned from a previous call to `SearchFolders` that indicates from where searching should continue. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SearchFoldersResponse {
  
  @scala.inline
  def apply(): SearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFoldersResponse]
  }
  
  @scala.inline
  implicit class SearchFoldersResponseMutableBuilder[Self <: SearchFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolders(value: js.Array[Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: Folder*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
