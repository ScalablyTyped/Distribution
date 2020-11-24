package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelVideoRequest extends js.Object {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
  
  /** Configuration for video event task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var eventConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EventConfig] = js.native
  
  /** Required. The type of video labeling task. */
  var feature: js.UndefOr[String] = js.native
  
  /** Configuration for video object detection task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var objectDetectionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectDetectionConfig] = js.native
  
  /** Configuration for video object tracking task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var objectTrackingConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectTrackingConfig] = js.native
  
  /** Configuration for video classification task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var videoClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoClassificationConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1LabelVideoRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelVideoRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelVideoRequestOps[Self <: GoogleCloudDatalabelingV1beta1LabelVideoRequest] (val x: Self) extends AnyVal {
    
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
    def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = this.set("basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicConfig: Self = this.set("basicConfig", js.undefined)
    
    @scala.inline
    def setEventConfig(value: GoogleCloudDatalabelingV1beta1EventConfig): Self = this.set("eventConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventConfig: Self = this.set("eventConfig", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setObjectDetectionConfig(value: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = this.set("objectDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectDetectionConfig: Self = this.set("objectDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = this.set("objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectTrackingConfig: Self = this.set("objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setVideoClassificationConfig(value: GoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = this.set("videoClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoClassificationConfig: Self = this.set("videoClassificationConfig", js.undefined)
  }
}
