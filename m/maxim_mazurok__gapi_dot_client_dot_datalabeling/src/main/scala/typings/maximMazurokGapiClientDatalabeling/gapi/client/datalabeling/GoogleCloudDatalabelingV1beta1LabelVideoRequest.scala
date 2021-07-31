package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelVideoRequest extends StObject {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /** Configuration for video event task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var eventConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EventConfig] = js.undefined
  
  /** Required. The type of video labeling task. */
  var feature: js.UndefOr[String] = js.undefined
  
  /** Configuration for video object detection task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var objectDetectionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectDetectionConfig] = js.undefined
  
  /** Configuration for video object tracking task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var objectTrackingConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectTrackingConfig] = js.undefined
  
  /** Configuration for video classification task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required. */
  var videoClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoClassificationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelVideoRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelVideoRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelVideoRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelVideoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    @scala.inline
    def setEventConfig(value: GoogleCloudDatalabelingV1beta1EventConfig): Self = StObject.set(x, "eventConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConfigUndefined: Self = StObject.set(x, "eventConfig", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setObjectDetectionConfig(value: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = StObject.set(x, "objectDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDetectionConfigUndefined: Self = StObject.set(x, "objectDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setVideoClassificationConfig(value: GoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = StObject.set(x, "videoClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClassificationConfigUndefined: Self = StObject.set(x, "videoClassificationConfig", js.undefined)
  }
}
