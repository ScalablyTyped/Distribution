package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelImageRequest extends StObject {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /** Configuration for bounding box and bounding poly task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var boundingPolyConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.undefined
  
  /** Required. The type of image labeling task. */
  var feature: js.UndefOr[String] = js.undefined
  
  /** Configuration for image classification task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var imageClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.undefined
  
  /** Configuration for polyline task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var polylineConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1PolylineConfig] = js.undefined
  
  /** Configuration for segmentation task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required. */
  var segmentationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1SegmentationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelImageRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelImageRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelImageRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    @scala.inline
    def setBoundingPolyConfig(value: GoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = StObject.set(x, "boundingPolyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyConfigUndefined: Self = StObject.set(x, "boundingPolyConfig", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setImageClassificationConfig(value: GoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = StObject.set(x, "imageClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassificationConfigUndefined: Self = StObject.set(x, "imageClassificationConfig", js.undefined)
    
    @scala.inline
    def setPolylineConfig(value: GoogleCloudDatalabelingV1beta1PolylineConfig): Self = StObject.set(x, "polylineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineConfigUndefined: Self = StObject.set(x, "polylineConfig", js.undefined)
    
    @scala.inline
    def setSegmentationConfig(value: GoogleCloudDatalabelingV1beta1SegmentationConfig): Self = StObject.set(x, "segmentationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationConfigUndefined: Self = StObject.set(x, "segmentationConfig", js.undefined)
  }
}
