package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadataOps[Self <: GoogleCloudDatalabelingV1beta1AnnotatedDatasetMetadata] (val x: Self) extends AnyVal {
    
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
    def setBoundingPolyConfig(value: GoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = this.set("boundingPolyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPolyConfig: Self = this.set("boundingPolyConfig", js.undefined)
    
    @scala.inline
    def setEventConfig(value: GoogleCloudDatalabelingV1beta1EventConfig): Self = this.set("eventConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventConfig: Self = this.set("eventConfig", js.undefined)
    
    @scala.inline
    def setHumanAnnotationConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = this.set("humanAnnotationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanAnnotationConfig: Self = this.set("humanAnnotationConfig", js.undefined)
    
    @scala.inline
    def setImageClassificationConfig(value: GoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = this.set("imageClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassificationConfig: Self = this.set("imageClassificationConfig", js.undefined)
    
    @scala.inline
    def setObjectDetectionConfig(value: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig): Self = this.set("objectDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectDetectionConfig: Self = this.set("objectDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig): Self = this.set("objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectTrackingConfig: Self = this.set("objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setPolylineConfig(value: GoogleCloudDatalabelingV1beta1PolylineConfig): Self = this.set("polylineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineConfig: Self = this.set("polylineConfig", js.undefined)
    
    @scala.inline
    def setSegmentationConfig(value: GoogleCloudDatalabelingV1beta1SegmentationConfig): Self = this.set("segmentationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationConfig: Self = this.set("segmentationConfig", js.undefined)
    
    @scala.inline
    def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = this.set("textClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassificationConfig: Self = this.set("textClassificationConfig", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionConfig(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = this.set("textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEntityExtractionConfig: Self = this.set("textEntityExtractionConfig", js.undefined)
    
    @scala.inline
    def setVideoClassificationConfig(value: GoogleCloudDatalabelingV1beta1VideoClassificationConfig): Self = this.set("videoClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoClassificationConfig: Self = this.set("videoClassificationConfig", js.undefined)
  }
}
