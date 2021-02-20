package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ClassificationMetrics extends StObject {
  
  /** Confusion matrix of predicted labels vs. ground truth labels. */
  var confusionMatrix: js.UndefOr[GoogleCloudDatalabelingV1beta1ConfusionMatrix] = js.native
  
  /** Precision-recall curve based on ground truth labels, predicted labels, and scores for the predicted labels. */
  var prCurve: js.UndefOr[GoogleCloudDatalabelingV1beta1PrCurve] = js.native
}
object GoogleCloudDatalabelingV1beta1ClassificationMetrics {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ClassificationMetrics]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ClassificationMetricsMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ClassificationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfusionMatrix(value: GoogleCloudDatalabelingV1beta1ConfusionMatrix): Self = StObject.set(x, "confusionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfusionMatrixUndefined: Self = StObject.set(x, "confusionMatrix", js.undefined)
    
    @scala.inline
    def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = StObject.set(x, "prCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrCurveUndefined: Self = StObject.set(x, "prCurve", js.undefined)
  }
}
