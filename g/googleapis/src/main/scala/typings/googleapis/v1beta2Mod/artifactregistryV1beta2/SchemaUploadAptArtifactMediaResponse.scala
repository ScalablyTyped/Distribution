package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadAptArtifactMediaResponse extends StObject {
  
  /**
    * Operation to be returned to the user.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
}
object SchemaUploadAptArtifactMediaResponse {
  
  inline def apply(): SchemaUploadAptArtifactMediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAptArtifactMediaResponse]
  }
  
  extension [Self <: SchemaUploadAptArtifactMediaResponse](x: Self) {
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
