package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ClassificationMetrics extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ClassificationMetricsOps[Self <: GoogleCloudDatalabelingV1beta1ClassificationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfusionMatrix(value: GoogleCloudDatalabelingV1beta1ConfusionMatrix): Self = this.set("confusionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfusionMatrix: Self = this.set("confusionMatrix", js.undefined)
    
    @scala.inline
    def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = this.set("prCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrCurve: Self = this.set("prCurve", js.undefined)
  }
}
