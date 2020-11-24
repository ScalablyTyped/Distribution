package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildsResponse extends js.Object {
  
  /** Builds will be sorted by `create_time`, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.native
  
  /** Token to receive the next page of results. This will be absent if the end of the response list has been reached. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListBuildsResponse {
  
  @scala.inline
  def apply(): ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsResponse]
  }
  
  @scala.inline
  implicit class ListBuildsResponseOps[Self <: ListBuildsResponse] (val x: Self) extends AnyVal {
    
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
    def setBuildsVarargs(value: Build*): Self = this.set("builds", js.Array(value :_*))
    
    @scala.inline
    def setBuilds(value: js.Array[Build]): Self = this.set("builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilds: Self = this.set("builds", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
