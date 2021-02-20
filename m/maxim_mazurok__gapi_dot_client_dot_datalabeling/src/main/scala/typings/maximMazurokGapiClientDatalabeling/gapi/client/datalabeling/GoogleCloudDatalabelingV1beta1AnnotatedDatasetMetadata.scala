package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata extends StObject {
  
  /** Configuration for image bounding box and bounding poly task. */
  var boundingPolyConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.native
  
  /** Configuration for video event labeling task. */
  var eventConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1EventConfig] = js.native
  
  /** HumanAnnotationConfig used when requesting the human labeling task for this AnnotatedDataset. */
  var humanAnnotationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
  
  /** Configuration for image classification task. */
  var imageClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.native
  
  /** Configuration for video object detection task. */
  var objectDetectionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectDetectionConfig] = js.native
  
  /** Configuration for video object tracking task. */
  var objectTrackingConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ObjectTrackingConfig] = js.native
  
  /** Configuration for image polyline task. */
  var polylineConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1PolylineConfig] = js.native
  
  /** Configuration for image segmentation task. */
  var segmentationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1SegmentationConfig] = js.native
  
  /** Configuration for text classification task. */
  var textClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.native
  
  /** Configuration for text entity extraction task. */
  var textEntityExtractionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] = js.native
  
  /** Configuration for video classification task. */
  var videoClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoClassificationConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPolyConfig(value: GoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = StObject.set(x, "boundingPolyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyConfigUndefined: Self = StObject.set(x, "boundingPolyConfig", js.undefined)
    
    @scala.inline
    def setEventConfig(value: GoogleCloudDatalabelingV1beta1EventConfig): Self = StObject.set(x, "eventConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConfigUndefined: Self = StObject.set(x, "eventConfig", js.undefined)
    
    @scala.inline
    def setHumanAnnotationConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "humanAnnotationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanAnnotationConfigUndefined: Self = StObject.set(x, "humanAnnotationConfig", js.undefined)
    
    @scala.inline
    def setImageClassificationConfig(value: GoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = StObject.set(x, "imageClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassificationConfigUndefined: Self = StObject.set(x, "imageClassificationConfig", js.undefined)
    
    @scala.inline
    def setObjectDetectionConfig(value: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = StObject.set(x, "objectDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDetectionConfigUndefined: Self = StObject.set(x, "objectDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setPolylineConfig(value: GoogleCloudDatalabelingV1beta1PolylineConfig): Self = StObject.set(x, "polylineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineConfigUndefined: Self = StObject.set(x, "polylineConfig", js.undefined)
    
    @scala.inline
    def setSegmentationConfig(value: GoogleCloudDatalabelingV1beta1SegmentationConfig): Self = StObject.set(x, "segmentationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationConfigUndefined: Self = StObject.set(x, "segmentationConfig", js.undefined)
    
    @scala.inline
    def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionConfig(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = StObject.set(x, "textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEntityExtractionConfigUndefined: Self = StObject.set(x, "textEntityExtractionConfig", js.undefined)
    
    @scala.inline
    def setVideoClassificationConfig(value: GoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = StObject.set(x, "videoClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClassificationConfigUndefined: Self = StObject.set(x, "videoClassificationConfig", js.undefined)
  }
}
