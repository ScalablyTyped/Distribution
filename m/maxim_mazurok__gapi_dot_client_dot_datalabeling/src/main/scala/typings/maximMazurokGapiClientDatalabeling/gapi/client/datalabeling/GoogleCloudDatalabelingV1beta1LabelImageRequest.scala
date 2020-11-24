package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelImageRequest extends js.Object {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
  
  /** Configuration for bounding box and bounding poly task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var boundingPolyConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.native
  
  /** Required. The type of image labeling task. */
  var feature: js.UndefOr[String] = js.native
  
  /** Configuration for image classification task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var imageClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.native
  
  /** Configuration for polyline task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var polylineConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1PolylineConfig] = js.native
  
  /** Configuration for segmentation task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var segmentationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1SegmentationConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1LabelImageRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelImageRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelImageRequestOps[Self <: GoogleCloudDatalabelingV1beta1LabelImageRequest] (val x: Self) extends AnyVal {
    
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
    def setBoundingPolyConfig(value: GoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = this.set("boundingPolyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPolyConfig: Self = this.set("boundingPolyConfig", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setImageClassificationConfig(value: GoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = this.set("imageClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassificationConfig: Self = this.set("imageClassificationConfig", js.undefined)
    
    @scala.inline
    def setPolylineConfig(value: GoogleCloudDatalabelingV1beta1PolylineConfig): Self = this.set("polylineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineConfig: Self = this.set("polylineConfig", js.undefined)
    
    @scala.inline
    def setSegmentationConfig(value: GoogleCloudDatalabelingV1beta1SegmentationConfig): Self = this.set("segmentationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationConfig: Self = this.set("segmentationConfig", js.undefined)
  }
}
