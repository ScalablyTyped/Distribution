package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo extends StObject {
  
  /** The detailed error status. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** Google Cloud Storage location requested. */
  var gcsSource: js.UndefOr[GoogleDevtoolsArtifactregistryV1alpha1GcsSource] = js.undefined
}
object GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo {
  
  inline def apply(): GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]
  }
  
  extension [Self <: GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo](x: Self) {
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGcsSource(value: GoogleDevtoolsArtifactregistryV1alpha1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
