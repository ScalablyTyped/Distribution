package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelBuildRequest extends js.Object {
  
  /** Required. ID of the build. */
  var id: js.UndefOr[String] = js.native
  
  /** The name of the `Build` to retrieve. Format: `projects/{project}/locations/{location}/builds/{build}` */
  var name: js.UndefOr[String] = js.native
  
  /** Required. ID of the project. */
  var projectId: js.UndefOr[String] = js.native
}
object CancelBuildRequest {
  
  @scala.inline
  def apply(): CancelBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelBuildRequest]
  }
  
  @scala.inline
  implicit class CancelBuildRequestOps[Self <: CancelBuildRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
