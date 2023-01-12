package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1EvaluationMetrics extends StObject {
  
  var classificationMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1ClassificationMetrics] = js.undefined
  
  var objectDetectionMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] = js.undefined
}
object GoogleCloudDatalabelingV1beta1EvaluationMetrics {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1EvaluationMetrics] (val x: Self) extends AnyVal {
    
    inline def setClassificationMetrics(value: GoogleCloudDatalabelingV1beta1ClassificationMetrics): Self = StObject.set(x, "classificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setClassificationMetricsUndefined: Self = StObject.set(x, "classificationMetrics", js.undefined)
    
    inline def setObjectDetectionMetrics(value: GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics): Self = StObject.set(x, "objectDetectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setObjectDetectionMetricsUndefined: Self = StObject.set(x, "objectDetectionMetrics", js.undefined)
  }
}
