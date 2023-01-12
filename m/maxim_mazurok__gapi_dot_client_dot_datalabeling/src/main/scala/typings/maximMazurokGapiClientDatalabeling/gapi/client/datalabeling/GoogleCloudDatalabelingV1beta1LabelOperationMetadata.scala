package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelOperationMetadata extends StObject {
  
  /** Output only. The name of annotated dataset in format "projects/ *‍/datasets/ *‍/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.undefined
  
  /** Output only. Timestamp when labeling request was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of dataset to be labeled. "projects/ *‍/datasets/ *" */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Details of label image bounding box operation. */
  var imageBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata] = js.undefined
  
  /** Details of label image bounding poly operation. */
  var imageBoundingPolyDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageBoundingPolyOperationMetadata] = js.undefined
  
  /** Details of label image classification operation. */
  var imageClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageClassificationOperationMetadata] = js.undefined
  
  /** Details of label image oriented bounding box operation. */
  var imageOrientedBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata] = js.undefined
  
  /** Details of label image polyline operation. */
  var imagePolylineDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImagePolylineOperationMetadata] = js.undefined
  
  /** Details of label image segmentation operation. */
  var imageSegmentationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata] = js.undefined
  
  /** Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
  
  /** Output only. Progress of label operation. Range: [0, 100]. */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /** Details of label text classification operation. */
  var textClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata] = js.undefined
  
  /** Details of label text entity extraction operation. */
  var textEntityExtractionDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelTextEntityExtractionOperationMetadata] = js.undefined
  
  /** Details of label video classification operation. */
  var videoClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoClassificationOperationMetadata] = js.undefined
  
  /** Details of label video event operation. */
  var videoEventDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoEventOperationMetadata] = js.undefined
  
  /** Details of label video object detection operation. */
  var videoObjectDetectionDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoObjectDetectionOperationMetadata] = js.undefined
  
  /** Details of label video object tracking operation. */
  var videoObjectTrackingDetails: js.UndefOr[GoogleCloudDatalabelingV1beta1LabelVideoObjectTrackingOperationMetadata] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1LabelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setImageBoundingBoxDetails(value: GoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata): Self = StObject.set(x, "imageBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    inline def setImageBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageBoundingBoxDetails", js.undefined)
    
    inline def setImageBoundingPolyDetails(value: GoogleCloudDatalabelingV1beta1LabelImageBoundingPolyOperationMetadata): Self = StObject.set(x, "imageBoundingPolyDetails", value.asInstanceOf[js.Any])
    
    inline def setImageBoundingPolyDetailsUndefined: Self = StObject.set(x, "imageBoundingPolyDetails", js.undefined)
    
    inline def setImageClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelImageClassificationOperationMetadata): Self = StObject.set(x, "imageClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationDetailsUndefined: Self = StObject.set(x, "imageClassificationDetails", js.undefined)
    
    inline def setImageOrientedBoundingBoxDetails(value: GoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata): Self = StObject.set(x, "imageOrientedBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    inline def setImageOrientedBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageOrientedBoundingBoxDetails", js.undefined)
    
    inline def setImagePolylineDetails(value: GoogleCloudDatalabelingV1beta1LabelImagePolylineOperationMetadata): Self = StObject.set(x, "imagePolylineDetails", value.asInstanceOf[js.Any])
    
    inline def setImagePolylineDetailsUndefined: Self = StObject.set(x, "imagePolylineDetails", js.undefined)
    
    inline def setImageSegmentationDetails(value: GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata): Self = StObject.set(x, "imageSegmentationDetails", value.asInstanceOf[js.Any])
    
    inline def setImageSegmentationDetailsUndefined: Self = StObject.set(x, "imageSegmentationDetails", js.undefined)
    
    inline def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setTextClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata): Self = StObject.set(x, "textClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationDetailsUndefined: Self = StObject.set(x, "textClassificationDetails", js.undefined)
    
    inline def setTextEntityExtractionDetails(value: GoogleCloudDatalabelingV1beta1LabelTextEntityExtractionOperationMetadata): Self = StObject.set(x, "textEntityExtractionDetails", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionDetailsUndefined: Self = StObject.set(x, "textEntityExtractionDetails", js.undefined)
    
    inline def setVideoClassificationDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoClassificationOperationMetadata): Self = StObject.set(x, "videoClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoClassificationDetailsUndefined: Self = StObject.set(x, "videoClassificationDetails", js.undefined)
    
    inline def setVideoEventDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoEventOperationMetadata): Self = StObject.set(x, "videoEventDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoEventDetailsUndefined: Self = StObject.set(x, "videoEventDetails", js.undefined)
    
    inline def setVideoObjectDetectionDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoObjectDetectionOperationMetadata): Self = StObject.set(x, "videoObjectDetectionDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoObjectDetectionDetailsUndefined: Self = StObject.set(x, "videoObjectDetectionDetails", js.undefined)
    
    inline def setVideoObjectTrackingDetails(value: GoogleCloudDatalabelingV1beta1LabelVideoObjectTrackingOperationMetadata): Self = StObject.set(x, "videoObjectTrackingDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoObjectTrackingDetailsUndefined: Self = StObject.set(x, "videoObjectTrackingDetails", js.undefined)
  }
}
