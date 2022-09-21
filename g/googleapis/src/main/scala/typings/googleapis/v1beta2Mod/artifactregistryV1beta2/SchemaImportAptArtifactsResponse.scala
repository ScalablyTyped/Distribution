package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAptArtifactsResponse extends StObject {
  
  /**
    * The Apt artifacts updated.
    */
  var aptArtifacts: js.UndefOr[js.Array[SchemaAptArtifact]] = js.undefined
  
  /**
    * Detailed error info for packages that were not imported.
    */
  var errors: js.UndefOr[js.Array[SchemaImportAptArtifactsErrorInfo]] = js.undefined
}
object SchemaImportAptArtifactsResponse {
  
  inline def apply(): SchemaImportAptArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAptArtifactsResponse]
  }
  
  extension [Self <: SchemaImportAptArtifactsResponse](x: Self) {
    
    inline def setAptArtifacts(value: js.Array[SchemaAptArtifact]): Self = StObject.set(x, "aptArtifacts", value.asInstanceOf[js.Any])
    
    inline def setAptArtifactsUndefined: Self = StObject.set(x, "aptArtifacts", js.undefined)
    
    inline def setAptArtifactsVarargs(value: SchemaAptArtifact*): Self = StObject.set(x, "aptArtifacts", js.Array(value*))
    
    inline def setErrors(value: js.Array[SchemaImportAptArtifactsErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaImportAptArtifactsErrorInfo*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
