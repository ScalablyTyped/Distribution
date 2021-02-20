package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo extends StObject {
  
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
  implicit class GoogleDevtoolsArtifactregistryV1alpha1ErrorInfoMutableBuilder[Self <: GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleDevtoolsArtifactregistryV1alpha1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
