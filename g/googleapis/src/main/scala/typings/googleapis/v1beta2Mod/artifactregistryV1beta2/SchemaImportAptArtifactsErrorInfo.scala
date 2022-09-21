package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAptArtifactsErrorInfo extends StObject {
  
  /**
    * The detailed error status.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Google Cloud Storage location requested.
    */
  var gcsSource: js.UndefOr[SchemaImportAptArtifactsGcsSource] = js.undefined
}
object SchemaImportAptArtifactsErrorInfo {
  
  inline def apply(): SchemaImportAptArtifactsErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAptArtifactsErrorInfo]
  }
  
  extension [Self <: SchemaImportAptArtifactsErrorInfo](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGcsSource(value: SchemaImportAptArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
