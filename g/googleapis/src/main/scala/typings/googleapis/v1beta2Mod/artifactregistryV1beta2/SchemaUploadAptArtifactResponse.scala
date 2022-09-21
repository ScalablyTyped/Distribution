package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadAptArtifactResponse extends StObject {
  
  /**
    * The Apt artifacts updated.
    */
  var aptArtifacts: js.UndefOr[js.Array[SchemaAptArtifact]] = js.undefined
}
object SchemaUploadAptArtifactResponse {
  
  inline def apply(): SchemaUploadAptArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAptArtifactResponse]
  }
  
  extension [Self <: SchemaUploadAptArtifactResponse](x: Self) {
    
    inline def setAptArtifacts(value: js.Array[SchemaAptArtifact]): Self = StObject.set(x, "aptArtifacts", value.asInstanceOf[js.Any])
    
    inline def setAptArtifactsUndefined: Self = StObject.set(x, "aptArtifacts", js.undefined)
    
    inline def setAptArtifactsVarargs(value: SchemaAptArtifact*): Self = StObject.set(x, "aptArtifacts", js.Array(value*))
  }
}
