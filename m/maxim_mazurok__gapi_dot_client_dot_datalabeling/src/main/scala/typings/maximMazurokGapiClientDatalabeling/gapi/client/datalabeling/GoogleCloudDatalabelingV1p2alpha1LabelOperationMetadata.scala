package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata extends js.Object {
  
  /** Output only. The name of annotated dataset in format "projects/∗/datasets/∗/annotatedDatasets/ *". */
  var annotatedDataset: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp when labeling request was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The name of dataset to be labeled. "projects/∗/datasets/ *" */
  var dataset: js.UndefOr[String] = js.native
  
  /** Details of label image bounding box operation. */
  var imageBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImageBoundingBoxOperationMetadata] = js.native
  
  /** Details of label image bounding poly operation. */
  var imageBoundingPolyDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImageBoundingPolyOperationMetadata] = js.native
  
  /** Details of label image classification operation. */
  var imageClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImageClassificationOperationMetadata] = js.native
  
  /** Details of label image oriented bounding box operation. */
  var imageOrientedBoundingBoxDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata] = js.native
  
  /** Details of label image polyline operation. */
  var imagePolylineDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImagePolylineOperationMetadata] = js.native
  
  /** Details of label image segmentation operation. */
  var imageSegmentationDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata] = js.native
  
  /** Output only. Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
  
  /** Output only. Progress of label operation. Range: [0, 100]. */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Details of label text classification operation. */
  var textClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelTextClassificationOperationMetadata] = js.native
  
  /** Details of label text entity extraction operation. */
  var textEntityExtractionDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelTextEntityExtractionOperationMetadata] = js.native
  
  /** Details of label video classification operation. */
  var videoClassificationDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelVideoClassificationOperationMetadata] = js.native
  
  /** Details of label video event operation. */
  var videoEventDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata] = js.native
  
  /** Details of label video object detection operation. */
  var videoObjectDetectionDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectDetectionOperationMetadata] = js.native
  
  /** Details of label video object tracking operation. */
  var videoObjectTrackingDetails: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadataOps[Self <: GoogleCloudDatalabelingV1p2alpha1LabelOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setAnnotatedDataset(value: String): Self = this.set("annotatedDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedDataset: Self = this.set("annotatedDataset", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setImageBoundingBoxDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImageBoundingBoxOperationMetadata): Self = this.set("imageBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBoundingBoxDetails: Self = this.set("imageBoundingBoxDetails", js.undefined)
    
    @scala.inline
    def setImageBoundingPolyDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImageBoundingPolyOperationMetadata): Self = this.set("imageBoundingPolyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBoundingPolyDetails: Self = this.set("imageBoundingPolyDetails", js.undefined)
    
    @scala.inline
    def setImageClassificationDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImageClassificationOperationMetadata): Self = this.set("imageClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassificationDetails: Self = this.set("imageClassificationDetails", js.undefined)
    
    @scala.inline
    def setImageOrientedBoundingBoxDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata): Self = this.set("imageOrientedBoundingBoxDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOrientedBoundingBoxDetails: Self = this.set("imageOrientedBoundingBoxDetails", js.undefined)
    
    @scala.inline
    def setImagePolylineDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImagePolylineOperationMetadata): Self = this.set("imagePolylineDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePolylineDetails: Self = this.set("imagePolylineDetails", js.undefined)
    
    @scala.inline
    def setImageSegmentationDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata): Self = this.set("imageSegmentationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSegmentationDetails: Self = this.set("imageSegmentationDetails", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = this.set("partialFailures", js.Array(value :_*))
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = this.set("partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFailures: Self = this.set("partialFailures", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = this.set("progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("progressPercent", js.undefined)
    
    @scala.inline
    def setTextClassificationDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelTextClassificationOperationMetadata): Self = this.set("textClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassificationDetails: Self = this.set("textClassificationDetails", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelTextEntityExtractionOperationMetadata): Self = this.set("textEntityExtractionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEntityExtractionDetails: Self = this.set("textEntityExtractionDetails", js.undefined)
    
    @scala.inline
    def setVideoClassificationDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelVideoClassificationOperationMetadata): Self = this.set("videoClassificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoClassificationDetails: Self = this.set("videoClassificationDetails", js.undefined)
    
    @scala.inline
    def setVideoEventDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata): Self = this.set("videoEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoEventDetails: Self = this.set("videoEventDetails", js.undefined)
    
    @scala.inline
    def setVideoObjectDetectionDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectDetectionOperationMetadata): Self = this.set("videoObjectDetectionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoObjectDetectionDetails: Self = this.set("videoObjectDetectionDetails", js.undefined)
    
    @scala.inline
    def setVideoObjectTrackingDetails(value: GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata): Self = this.set("videoObjectTrackingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoObjectTrackingDetails: Self = this.set("videoObjectTrackingDetails", js.undefined)
  }
}
