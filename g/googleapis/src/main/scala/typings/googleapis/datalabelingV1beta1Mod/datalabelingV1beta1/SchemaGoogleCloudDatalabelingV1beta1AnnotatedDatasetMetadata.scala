package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata extends StObject {
  
  /**
    * Configuration for image bounding box and bounding poly task.
    */
  var boundingPolyConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.undefined
  
  /**
    * Configuration for video event labeling task.
    */
  var eventConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EventConfig] = js.undefined
  
  /**
    * HumanAnnotationConfig used when requesting the human labeling task for this AnnotatedDataset.
    */
  var humanAnnotationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /**
    * Configuration for image classification task.
    */
  var imageClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.undefined
  
  /**
    * Configuration for video object detection task.
    */
  var objectDetectionConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig] = js.undefined
  
  /**
    * Configuration for video object tracking task.
    */
  var objectTrackingConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig] = js.undefined
  
  /**
    * Configuration for image polyline task.
    */
  var polylineConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1PolylineConfig] = js.undefined
  
  /**
    * Configuration for image segmentation task.
    */
  var segmentationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig] = js.undefined
  
  /**
    * Configuration for text classification task.
    */
  var textClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.undefined
  
  /**
    * Configuration for text entity extraction task.
    */
  var textEntityExtractionConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] = js.undefined
  
  /**
    * Configuration for video classification task.
    */
  var videoClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata](x: Self) {
    
    inline def setBoundingPolyConfig(value: SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = StObject.set(x, "boundingPolyConfig", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyConfigUndefined: Self = StObject.set(x, "boundingPolyConfig", js.undefined)
    
    inline def setEventConfig(value: SchemaGoogleCloudDatalabelingV1beta1EventConfig): Self = StObject.set(x, "eventConfig", value.asInstanceOf[js.Any])
    
    inline def setEventConfigUndefined: Self = StObject.set(x, "eventConfig", js.undefined)
    
    inline def setHumanAnnotationConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "humanAnnotationConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanAnnotationConfigUndefined: Self = StObject.set(x, "humanAnnotationConfig", js.undefined)
    
    inline def setImageClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = StObject.set(x, "imageClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationConfigUndefined: Self = StObject.set(x, "imageClassificationConfig", js.undefined)
    
    inline def setObjectDetectionConfig(value: SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = StObject.set(x, "objectDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectDetectionConfigUndefined: Self = StObject.set(x, "objectDetectionConfig", js.undefined)
    
    inline def setObjectTrackingConfig(value: SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    inline def setPolylineConfig(value: SchemaGoogleCloudDatalabelingV1beta1PolylineConfig): Self = StObject.set(x, "polylineConfig", value.asInstanceOf[js.Any])
    
    inline def setPolylineConfigUndefined: Self = StObject.set(x, "polylineConfig", js.undefined)
    
    inline def setSegmentationConfig(value: SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig): Self = StObject.set(x, "segmentationConfig", value.asInstanceOf[js.Any])
    
    inline def setSegmentationConfigUndefined: Self = StObject.set(x, "segmentationConfig", js.undefined)
    
    inline def setTextClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
    
    inline def setTextEntityExtractionConfig(value: SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = StObject.set(x, "textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionConfigUndefined: Self = StObject.set(x, "textEntityExtractionConfig", js.undefined)
    
    inline def setVideoClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = StObject.set(x, "videoClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setVideoClassificationConfigUndefined: Self = StObject.set(x, "videoClassificationConfig", js.undefined)
  }
}
