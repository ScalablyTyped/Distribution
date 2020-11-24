package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo extends js.Object {
  
  /** The detailed error status. */
  var error: js.UndefOr[Status] = js.native
  
  /** Google Cloud Storage location requested. */
  var gcsSource: js.UndefOr[GoogleDevtoolsArtifactregistryV1alpha1GcsSource] = js.native
}
object GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo {
  
  @scala.inline
  def apply(): GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsArtifactregistryV1alpha1ErrorInfoOps[Self <: GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo] (val x: Self) extends AnyVal {
    
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
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleDevtoolsArtifactregistryV1alpha1GcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}
