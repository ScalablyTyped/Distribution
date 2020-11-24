package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFoldersResponse extends js.Object {
  
  /** A possibly paginated list of Folders that are direct descendants of the specified parent resource. */
  var folders: js.UndefOr[js.Array[Folder]] = js.native
  
  /** A pagination token returned from a previous call to `ListFolders` that indicates from where listing should continue. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFoldersResponse {
  
  @scala.inline
  def apply(): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFoldersResponse]
  }
  
  @scala.inline
  implicit class ListFoldersResponseOps[Self <: ListFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFoldersVarargs(value: Folder*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[Folder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
