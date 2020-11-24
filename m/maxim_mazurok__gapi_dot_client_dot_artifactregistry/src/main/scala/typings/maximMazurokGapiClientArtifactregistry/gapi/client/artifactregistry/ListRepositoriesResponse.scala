package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesResponse extends js.Object {
  
  /** The token to retrieve the next page of repositories, or empty if there are no more repositories to return. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The repositories returned. */
  var repositories: js.UndefOr[js.Array[Repository]] = js.native
}
object ListRepositoriesResponse {
  
  @scala.inline
  def apply(): ListRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesResponse]
  }
  
  @scala.inline
  implicit class ListRepositoriesResponseOps[Self <: ListRepositoriesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: Repository*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: js.Array[Repository]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
  }
}
