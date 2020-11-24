package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EvaluationConfig extends js.Object {
  
  /** Only specify this field if the related model performs image object detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate bounding boxes. */
  var boundingBoxEvaluationOptions: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions] = js.native
}
object GoogleCloudDatalabelingV1beta1EvaluationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationConfigOps[Self <: GoogleCloudDatalabelingV1beta1EvaluationConfig] (val x: Self) extends AnyVal {
    
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
    def setBoundingBoxEvaluationOptions(value: GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions): Self = this.set("boundingBoxEvaluationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBoxEvaluationOptions: Self = this.set("boundingBoxEvaluationOptions", js.undefined)
  }
}
