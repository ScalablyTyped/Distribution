package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAptArtifactsRequest extends StObject {
  
  /**
    * Google Cloud Storage location where input content is located.
    */
  var gcsSource: js.UndefOr[SchemaImportAptArtifactsGcsSource] = js.undefined
}
object SchemaImportAptArtifactsRequest {
  
  inline def apply(): SchemaImportAptArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAptArtifactsRequest]
  }
  
  extension [Self <: SchemaImportAptArtifactsRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaImportAptArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
