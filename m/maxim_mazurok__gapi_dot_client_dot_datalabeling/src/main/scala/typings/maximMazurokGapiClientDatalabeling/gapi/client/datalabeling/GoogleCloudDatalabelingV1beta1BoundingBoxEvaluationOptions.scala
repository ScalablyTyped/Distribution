package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions extends js.Object {
  
  /**
    * Minimum [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) required for 2 bounding boxes to be considered a match. This must be a
    * number between 0 and 1.
    */
  var iouThreshold: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsOps[Self <: GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions] (val x: Self) extends AnyVal {
    
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
    def setIouThreshold(value: Double): Self = this.set("iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIouThreshold: Self = this.set("iouThreshold", js.undefined)
  }
}
