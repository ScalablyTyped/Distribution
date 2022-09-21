package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1LabelVideoRequest extends StObject {
  
  /**
    * Required. Basic human annotation config.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /**
    * Configuration for video event task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required.
    */
  var eventConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EventConfig] = js.undefined
  
  /**
    * Required. The type of video labeling task.
    */
  var feature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for video object detection task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required.
    */
  var objectDetectionConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig] = js.undefined
  
  /**
    * Configuration for video object tracking task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required.
    */
  var objectTrackingConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig] = js.undefined
  
  /**
    * Configuration for video classification task. One of video_classification_config, object_detection_config, object_tracking_config and event_config is required.
    */
  var videoClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1LabelVideoRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1LabelVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1LabelVideoRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1LabelVideoRequest](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    inline def setEventConfig(value: SchemaGoogleCloudDatalabelingV1beta1EventConfig): Self = StObject.set(x, "eventConfig", value.asInstanceOf[js.Any])
    
    inline def setEventConfigUndefined: Self = StObject.set(x, "eventConfig", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setObjectDetectionConfig(value: SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = StObject.set(x, "objectDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectDetectionConfigUndefined: Self = StObject.set(x, "objectDetectionConfig", js.undefined)
    
    inline def setObjectTrackingConfig(value: SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    inline def setVideoClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = StObject.set(x, "videoClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setVideoClassificationConfigUndefined: Self = StObject.set(x, "videoClassificationConfig", js.undefined)
  }
}
