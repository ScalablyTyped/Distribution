package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata extends StObject {
  
  /**
    * Output only. The name of annotated dataset in format "projects/x/datasets/x/annotatedDatasets/x".
    */
  var annotatedDataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp when labeling request was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of dataset to be labeled. "projects/x/datasets/x"
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details of label image bounding box operation.
    */
  var imageBoundingBoxDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageBoundingBoxOperationMetadata] = js.undefined
  
  /**
    * Details of label image bounding poly operation.
    */
  var imageBoundingPolyDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageBoundingPolyOperationMetadata] = js.undefined
  
  /**
    * Details of label image classification operation.
    */
  var imageClassificationDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageClassificationOperationMetadata] = js.undefined
  
  /**
    * Details of label image oriented bounding box operation.
    */
  var imageOrientedBoundingBoxDetails: js.UndefOr[
    SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata
  ] = js.undefined
  
  /**
    * Details of label image polyline operation.
    */
  var imagePolylineDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImagePolylineOperationMetadata] = js.undefined
  
  /**
    * Details of label image segmentation operation.
    */
  var imageSegmentationDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata] = js.undefined
  
  /**
    * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details.
    */
  var partialFailures: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Output only. Progress of label operation. Range: [0, 100].
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Details of label text classification operation.
    */
  var textClassificationDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelTextClassificationOperationMetadata] = js.undefined
  
  /**
    * Details of label text entity extraction operation.
    */
  var textEntityExtractionDetails: js.UndefOr[
    SchemaGoogleCloudDatalabelingV1p2alpha1LabelTextEntityExtractionOperationMetadata
  ] = js.undefined
  
  /**
    * Details of label video classification operation.
    */
  var videoClassificationDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoClassificationOperationMetadata] = js.undefined
  
  /**
    * Details of label video event operation.
    */
  var videoEventDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata] = js.undefined
  
  /**
    * Details of label video object detection operation.
    */
  var videoObjectDetectionDetails: js.UndefOr[
    SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoObjectDetectionOperationMetadata
  ] = js.undefined
  
  /**
    * Details of label video object tracking operation.
    */
  var videoObjectTrackingDetails: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata](x: Self) {
    
    inline def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetNull: Self = StObject.set(x, "annotatedDataset", null)
    
    inline def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setImageBoundingBoxDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageBoundingBoxOperationMetadata): Self = StObject.set(x, "imageBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    inline def setImageBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageBoundingBoxDetails", js.undefined)
    
    inline def setImageBoundingPolyDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageBoundingPolyOperationMetadata): Self = StObject.set(x, "imageBoundingPolyDetails", value.asInstanceOf[js.Any])
    
    inline def setImageBoundingPolyDetailsUndefined: Self = StObject.set(x, "imageBoundingPolyDetails", js.undefined)
    
    inline def setImageClassificationDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageClassificationOperationMetadata): Self = StObject.set(x, "imageClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationDetailsUndefined: Self = StObject.set(x, "imageClassificationDetails", js.undefined)
    
    inline def setImageOrientedBoundingBoxDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata): Self = StObject.set(x, "imageOrientedBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    inline def setImageOrientedBoundingBoxDetailsUndefined: Self = StObject.set(x, "imageOrientedBoundingBoxDetails", js.undefined)
    
    inline def setImagePolylineDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImagePolylineOperationMetadata): Self = StObject.set(x, "imagePolylineDetails", value.asInstanceOf[js.Any])
    
    inline def setImagePolylineDetailsUndefined: Self = StObject.set(x, "imagePolylineDetails", js.undefined)
    
    inline def setImageSegmentationDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata): Self = StObject.set(x, "imageSegmentationDetails", value.asInstanceOf[js.Any])
    
    inline def setImageSegmentationDetailsUndefined: Self = StObject.set(x, "imageSegmentationDetails", js.undefined)
    
    inline def setPartialFailures(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setTextClassificationDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelTextClassificationOperationMetadata): Self = StObject.set(x, "textClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationDetailsUndefined: Self = StObject.set(x, "textClassificationDetails", js.undefined)
    
    inline def setTextEntityExtractionDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelTextEntityExtractionOperationMetadata): Self = StObject.set(x, "textEntityExtractionDetails", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionDetailsUndefined: Self = StObject.set(x, "textEntityExtractionDetails", js.undefined)
    
    inline def setVideoClassificationDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoClassificationOperationMetadata): Self = StObject.set(x, "videoClassificationDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoClassificationDetailsUndefined: Self = StObject.set(x, "videoClassificationDetails", js.undefined)
    
    inline def setVideoEventDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata): Self = StObject.set(x, "videoEventDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoEventDetailsUndefined: Self = StObject.set(x, "videoEventDetails", js.undefined)
    
    inline def setVideoObjectDetectionDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoObjectDetectionOperationMetadata): Self = StObject.set(x, "videoObjectDetectionDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoObjectDetectionDetailsUndefined: Self = StObject.set(x, "videoObjectDetectionDetails", js.undefined)
    
    inline def setVideoObjectTrackingDetails(value: SchemaGoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata): Self = StObject.set(x, "videoObjectTrackingDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoObjectTrackingDetailsUndefined: Self = StObject.set(x, "videoObjectTrackingDetails", js.undefined)
  }
}
