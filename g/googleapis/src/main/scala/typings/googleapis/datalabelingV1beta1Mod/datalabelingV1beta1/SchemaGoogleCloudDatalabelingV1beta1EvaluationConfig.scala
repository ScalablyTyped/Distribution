package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig extends StObject {
  
  /**
    * Only specify this field if the related model performs image object detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate bounding boxes.
    */
  var boundingBoxEvaluationOptions: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig](x: Self) {
    
    inline def setBoundingBoxEvaluationOptions(value: SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions): Self = StObject.set(x, "boundingBoxEvaluationOptions", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxEvaluationOptionsUndefined: Self = StObject.set(x, "boundingBoxEvaluationOptions", js.undefined)
  }
}
