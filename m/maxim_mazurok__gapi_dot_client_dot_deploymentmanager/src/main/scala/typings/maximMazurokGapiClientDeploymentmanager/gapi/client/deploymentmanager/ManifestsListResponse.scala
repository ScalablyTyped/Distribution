package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestsListResponse extends js.Object {
  
  /** Output only. Manifests contained in this list response. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.native
  
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ManifestsListResponse {
  
  @scala.inline
  def apply(): ManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestsListResponse]
  }
  
  @scala.inline
  implicit class ManifestsListResponseOps[Self <: ManifestsListResponse] (val x: Self) extends AnyVal {
    
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
    def setManifestsVarargs(value: Manifest*): Self = this.set("manifests", js.Array(value :_*))
    
    @scala.inline
    def setManifests(value: js.Array[Manifest]): Self = this.set("manifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifests: Self = this.set("manifests", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
