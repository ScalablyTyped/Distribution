package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions extends StObject {
  
  /**
    * Minimum [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) required for 2 bounding boxes to be considered a match. This must be a number between 0 and 1.
    */
  var iouThreshold: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions](x: Self) {
    
    inline def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    inline def setIouThresholdNull: Self = StObject.set(x, "iouThreshold", null)
    
    inline def setIouThresholdUndefined: Self = StObject.set(x, "iouThreshold", js.undefined)
  }
}
