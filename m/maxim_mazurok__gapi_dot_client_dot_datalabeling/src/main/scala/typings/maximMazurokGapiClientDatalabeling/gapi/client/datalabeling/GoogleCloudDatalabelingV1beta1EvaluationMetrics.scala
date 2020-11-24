package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EvaluationMetrics extends js.Object {
  
  var classificationMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1ClassificationMetrics] = js.native
  
  var objectDetectionMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics] = js.native
}
object GoogleCloudDatalabelingV1beta1EvaluationMetrics {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationMetrics]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationMetricsOps[Self <: GoogleCloudDatalabelingV1beta1EvaluationMetrics] (val x: Self) extends AnyVal {
    
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
    def setClassificationMetrics(value: GoogleCloudDatalabelingV1beta1ClassificationMetrics): Self = this.set("classificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassificationMetrics: Self = this.set("classificationMetrics", js.undefined)
    
    @scala.inline
    def setObjectDetectionMetrics(value: GoogleCloudDatalabelingV1beta1ObjectDetectionMetrics): Self = this.set("objectDetectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectDetectionMetrics: Self = this.set("objectDetectionMetrics", js.undefined)
  }
}
