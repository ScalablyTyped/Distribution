package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics extends StObject {
  
  var classificationMetrics: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ClassificationMetrics] = js.undefined
  
  var objectDetectionMetrics: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics](x: Self) {
    
    inline def setClassificationMetrics(value: SchemaGoogleCloudDatalabelingV1beta1ClassificationMetrics): Self = StObject.set(x, "classificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setClassificationMetricsUndefined: Self = StObject.set(x, "classificationMetrics", js.undefined)
    
    inline def setObjectDetectionMetrics(value: SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics): Self = StObject.set(x, "objectDetectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setObjectDetectionMetricsUndefined: Self = StObject.set(x, "objectDetectionMetrics", js.undefined)
  }
}
