package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactResult extends js.Object {
  
  /** The file hash of the artifact. */
  var fileHash: js.UndefOr[js.Array[FileHashes]] = js.native
  
  /** The path of an artifact in a Google Cloud Storage bucket, with the generation number. For example, `gs://mybucket/path/to/output.jar#generation`. */
  var location: js.UndefOr[String] = js.native
}
object ArtifactResult {
  
  @scala.inline
  def apply(): ArtifactResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactResult]
  }
  
  @scala.inline
  implicit class ArtifactResultOps[Self <: ArtifactResult] (val x: Self) extends AnyVal {
    
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
    def setFileHashVarargs(value: FileHashes*): Self = this.set("fileHash", js.Array(value :_*))
    
    @scala.inline
    def setFileHash(value: js.Array[FileHashes]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
