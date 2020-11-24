package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends js.Object {
  
  /** Path to the artifact manifest. Only populated when artifacts are uploaded. */
  var artifactManifest: js.UndefOr[String] = js.native
  
  /** Time to push all non-container artifacts. */
  var artifactTiming: js.UndefOr[TimeSpan] = js.native
  
  /** List of build step digests, in the order corresponding to build step indices. */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of build step outputs, produced by builder images, in the order corresponding to build step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders)
    * can produce this output by writing to `$BUILDER_OUTPUT/output`. Only the first 4KB of data is stored.
    */
  var buildStepOutputs: js.UndefOr[js.Array[String]] = js.native
  
  /** Container images that were built as a part of the build. */
  var images: js.UndefOr[js.Array[BuiltImage]] = js.native
  
  /** Number of artifacts uploaded. Only populated when artifacts are uploaded. */
  var numArtifacts: js.UndefOr[String] = js.native
}
object Results {
  
  @scala.inline
  def apply(): Results = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
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
    def setArtifactManifest(value: String): Self = this.set("artifactManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactManifest: Self = this.set("artifactManifest", js.undefined)
    
    @scala.inline
    def setArtifactTiming(value: TimeSpan): Self = this.set("artifactTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactTiming: Self = this.set("artifactTiming", js.undefined)
    
    @scala.inline
    def setBuildStepImagesVarargs(value: String*): Self = this.set("buildStepImages", js.Array(value :_*))
    
    @scala.inline
    def setBuildStepImages(value: js.Array[String]): Self = this.set("buildStepImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildStepImages: Self = this.set("buildStepImages", js.undefined)
    
    @scala.inline
    def setBuildStepOutputsVarargs(value: String*): Self = this.set("buildStepOutputs", js.Array(value :_*))
    
    @scala.inline
    def setBuildStepOutputs(value: js.Array[String]): Self = this.set("buildStepOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildStepOutputs: Self = this.set("buildStepOutputs", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: BuiltImage*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[BuiltImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setNumArtifacts(value: String): Self = this.set("numArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumArtifacts: Self = this.set("numArtifacts", js.undefined)
  }
}
