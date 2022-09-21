package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2AutoMlParams extends StObject {
  
  /**
    * Resource name of the AutoML model. Format: `projects/{project-id\}/locations/{location-id\}/models/{model-id\}`.
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2AutoMlParams {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2AutoMlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2AutoMlParams]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2AutoMlParams](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
