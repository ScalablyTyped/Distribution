package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactResult extends StObject {
  
  /** The file hash of the artifact. */
  var fileHash: js.UndefOr[js.Array[FileHashes]] = js.undefined
  
  /** The path of an artifact in a Google Cloud Storage bucket, with the generation number. For example, `gs://mybucket/path/to/output.jar#generation`. */
  var location: js.UndefOr[String] = js.undefined
}
object ArtifactResult {
  
  @scala.inline
  def apply(): ArtifactResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactResult]
  }
  
  @scala.inline
  implicit class ArtifactResultMutableBuilder[Self <: ArtifactResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHash(value: js.Array[FileHashes]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setFileHashVarargs(value: FileHashes*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
