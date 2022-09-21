package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1LabelTextRequest extends StObject {
  
  /**
    * Required. Basic human annotation config.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /**
    * Required. The type of text labeling task.
    */
  var feature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for text classification task. One of text_classification_config and text_entity_extraction_config is required.
    */
  var textClassificationConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.undefined
  
  /**
    * Configuration for entity extraction task. One of text_classification_config and text_entity_extraction_config is required.
    */
  var textEntityExtractionConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1LabelTextRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1LabelTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1LabelTextRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1LabelTextRequest](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setTextClassificationConfig(value: SchemaGoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
    
    inline def setTextEntityExtractionConfig(value: SchemaGoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = StObject.set(x, "textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionConfigUndefined: Self = StObject.set(x, "textEntityExtractionConfig", js.undefined)
  }
}
