package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1LabelImageRequest extends StObject {
  
  /**
    * Required. Basic human annotation config.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /**
    * Configuration for bounding box and bounding poly task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required.
    */
  var boundingPolyConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig] = js.undefined
  
  /**
    * Required. The type of image labeling task.
    */
  var feature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for image classification task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required.
    */
  var imageClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig] = js.undefined
  
  /**
    * Configuration for polyline task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required.
    */
  var polylineConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1PolylineConfig] = js.undefined
  
  /**
    * Configuration for segmentation task. One of image_classification_config, bounding_poly_config, polyline_config and segmentation_config are required.
    */
  var segmentationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1LabelImageRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1LabelImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1LabelImageRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1LabelImageRequest](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    inline def setBoundingPolyConfig(value: SchemaGoogleCloudDatalabelingV1beta1BoundingPolyConfig): Self = StObject.set(x, "boundingPolyConfig", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyConfigUndefined: Self = StObject.set(x, "boundingPolyConfig", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setImageClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig): Self = StObject.set(x, "imageClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setImageClassificationConfigUndefined: Self = StObject.set(x, "imageClassificationConfig", js.undefined)
    
    inline def setPolylineConfig(value: SchemaGoogleCloudDatalabelingV1beta1PolylineConfig): Self = StObject.set(x, "polylineConfig", value.asInstanceOf[js.Any])
    
    inline def setPolylineConfigUndefined: Self = StObject.set(x, "polylineConfig", js.undefined)
    
    inline def setSegmentationConfig(value: SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig): Self = StObject.set(x, "segmentationConfig", value.asInstanceOf[js.Any])
    
    inline def setSegmentationConfigUndefined: Self = StObject.set(x, "segmentationConfig", js.undefined)
  }
}
