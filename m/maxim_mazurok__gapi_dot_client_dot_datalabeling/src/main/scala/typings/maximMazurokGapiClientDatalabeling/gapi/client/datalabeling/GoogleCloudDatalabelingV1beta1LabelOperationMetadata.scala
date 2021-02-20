package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelOperationMetadata extends StObject {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp when labeling request was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The name of dataset to be labeled. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.native
  
  /** Details of label image bounding box operation. */
  var imageBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata] = js.native
  
  /** Details of label image bounding poly operation. */
  var imageBoundingPolyDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageBoundingPolyOperationMetadata] = js.native
  
  /** Details of label image classification operation. */
  var imageClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageClassificationOperationMetadata] = js.native
  
  /** Details of label image oriented bounding box operation. */
  var imageOrientedBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata] = js.native
  
  /** Details of label image polyline operation. */
  var imagePolylineDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImagePolylineOperationMetadata] = js.native
  
  /** Details of label image segmentation operation. */
  var imageSegmentationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata] = js.native
  
  /** Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
  
  /** Output only. Progress of label operation. Range: [0, 100]. */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Details of label text classification operation. */
  var textClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata] = js.native
  
  /** Details of label text entity extraction operation. */
  var textEntityExtractionDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelTextEntityExtractionOperationMetadata] = js.native
  
  /** Details of label video classification operation. */
  var videoClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoClassificationOperationMetadata] = js.native
  
  /** Details of label video event operation. */
  var videoEventDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoEventOperationMetadata] = js.native
  
  /** Details of label video object detection operation. */
  var videoObjectDetectionDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoObjectDetectionOperationMetadata] = js.native
  
  /** Details of label video object tracking operation. */
  var videoObjectTrackingDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoObjectTrackingOperationMetadata] = js.native
}
object GoogleCloudDatalabelingV1beta1LabelOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setImageBoundingBoxDetails(value: GoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata): Self = StObject.set(x, "imageBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageBoundingBoxDetails", js.undefined)
    
    @scala.inline
    def setImageBoundingPolyDetails(value: GoogleCloudDatalabelingV1beta1LabelImageBoundingPolyOperationMetadata): Self = StObject.set(x, "imageBoundingPolyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBoundingPolyDetailsUndefined: Self = StObject.set(x, "imageBoundingPolyDetails", js.undefined)
    
    @scala.inline
    def setImageClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelImageClassificationOperationMetadata): Self = StObject.set(x, "imageClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassificationDetailsUndefined: Self = StObject.set(x, "imageClassificationDetails", js.undefined)
    
    @scala.inline
    def setImageOrientedBoundingBoxDetails(value: GoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata): Self = StObject.set(x, "imageOrientedBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOrientedBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageOrientedBoundingBoxDetails", js.undefined)
    
    @scala.inline
    def setImagePolylineDetails(value: GoogleCloudDatalabelingV1beta1LabelImagePolylineOperationMetadata): Self = StObject.set(x, "imagePolylineDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePolylineDetailsUndefined: Self = StObject.set(x, "imagePolylineDetails", js.undefined)
    
    @scala.inline
    def setImageSegmentationDetails(value: GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata): Self = StObject.set(x, "imageSegmentationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSegmentationDetailsUndefined: Self = StObject.set(x, "imageSegmentationDetails", js.undefined)
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value :_*))
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setTextClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata): Self = StObject.set(x, "textClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClassificationDetailsUndefined: Self = StObject.set(x, "textClassificationDetails", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionDetails(value: GoogleCloudDatalabelingV1beta1LabelTextEntityExtractionOperationMetadata): Self = StObject.set(x, "textEntityExtractionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEntityExtractionDetailsUndefined: Self = StObject.set(x, "textEntityExtractionDetails", js.undefined)
    
    @scala.inline
    def setVideoClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoClassificationOperationMetadata): Self = StObject.set(x, "videoClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClassificationDetailsUndefined: Self = StObject.set(x, "videoClassificationDetails", js.undefined)
    
    @scala.inline
    def setVideoEventDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoEventOperationMetadata): Self = StObject.set(x, "videoEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEventDetailsUndefined: Self = StObject.set(x, "videoEventDetails", js.undefined)
    
    @scala.inline
    def setVideoObjectDetectionDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoObjectDetectionOperationMetadata): Self = StObject.set(x, "videoObjectDetectionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoObjectDetectionDetailsUndefined: Self = StObject.set(x, "videoObjectDetectionDetails", js.undefined)
    
    @scala.inline
    def setVideoObjectTrackingDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoObjectTrackingOperationMetadata): Self = StObject.set(x, "videoObjectTrackingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoObjectTrackingDetailsUndefined: Self = StObject.set(x, "videoObjectTrackingDetails", js.undefined)
  }
}
