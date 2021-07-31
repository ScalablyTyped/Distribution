package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1EvaluationConfig extends StObject {
  
  /** Only specify this field if the related model performs image object detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate bounding boxes. */
  var boundingBoxEvaluationOptions: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions] = js.undefined
}
object GoogleCloudDatalabelingV1beta1EvaluationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1EvaluationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBoxEvaluationOptions(value: GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions): Self = StObject.set(x, "boundingBoxEvaluationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxEvaluationOptionsUndefined: Self = StObject.set(x, "boundingBoxEvaluationOptions", js.undefined)
  }
}
