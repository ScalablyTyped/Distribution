package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse extends StObject {
  
  /** Detailed error info for packages that were not imported. */
  var errors: js.UndefOr[js.Array[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]] = js.undefined
  
  /** The packages updated. */
  var packages: js.UndefOr[js.Array[GoogleDevtoolsArtifactregistryV1alpha1Package]] = js.undefined
}
object GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse {
  
  inline def apply(): GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse]
  }
  
  extension [Self <: GoogleDevtoolsArtifactregistryV1alpha1ImportArtifactsResponse](x: Self) {
    
    inline def setErrors(value: js.Array[GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleDevtoolsArtifactregistryV1alpha1ErrorInfo*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setPackages(value: js.Array[GoogleDevtoolsArtifactregistryV1alpha1Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: GoogleDevtoolsArtifactregistryV1alpha1Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
  }
}
