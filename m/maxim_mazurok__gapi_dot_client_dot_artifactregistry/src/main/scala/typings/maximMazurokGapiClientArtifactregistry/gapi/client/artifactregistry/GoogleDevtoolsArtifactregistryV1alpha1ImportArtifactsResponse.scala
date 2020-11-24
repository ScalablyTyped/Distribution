package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse extends js.Object {
  
  /** Detailed error info for packages that were not imported. */
  var errors: js.UndefOr[js.Array[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]] = js.native
  
  /** The packages updated. */
  var packages: js.UndefOr[js.Array[GoogleDevtoolsArtifactregistryV1alpha1Package]] = js.native
}
object GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse {
  
  @scala.inline
  def apply(): GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponseOps[Self <: GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: GoogleDevtoolsArtifactregistryV1alpha1Package*): Self = this.set("packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: js.Array[GoogleDevtoolsArtifactregistryV1alpha1Package]): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
  }
}
