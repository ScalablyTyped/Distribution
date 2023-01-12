package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAptArtifactsResponse extends StObject {
  
  /** The Apt artifacts imported. */
  var aptArtifacts: js.UndefOr[js.Array[AptArtifact]] = js.undefined
  
  /** Detailed error info for packages that were not imported. */
  var errors: js.UndefOr[js.Array[ImportAptArtifactsErrorInfo]] = js.undefined
}
object ImportAptArtifactsResponse {
  
  inline def apply(): ImportAptArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAptArtifactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAptArtifactsResponse] (val x: Self) extends AnyVal {
    
    inline def setAptArtifacts(value: js.Array[AptArtifact]): Self = StObject.set(x, "aptArtifacts", value.asInstanceOf[js.Any])
    
    inline def setAptArtifactsUndefined: Self = StObject.set(x, "aptArtifacts", js.undefined)
    
    inline def setAptArtifactsVarargs(value: AptArtifact*): Self = StObject.set(x, "aptArtifacts", js.Array(value*))
    
    inline def setErrors(value: js.Array[ImportAptArtifactsErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ImportAptArtifactsErrorInfo*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
