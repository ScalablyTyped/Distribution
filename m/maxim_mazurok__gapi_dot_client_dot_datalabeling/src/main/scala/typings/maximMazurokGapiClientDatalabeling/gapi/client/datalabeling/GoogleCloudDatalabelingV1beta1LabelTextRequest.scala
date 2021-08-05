package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelTextRequest extends StObject {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
  
  /** Required. The type of text labeling task. */
  var feature: js.UndefOr[String] = js.undefined
  
  /** Configuration for text classification task. One of text_classification_config and text_entity_extraction_config is required. */
  var textClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.undefined
  
  /** Configuration for entity extraction task. One of text_classification_config and text_entity_extraction_config is required. */
  var textEntityExtractionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelTextRequest {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1LabelTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelTextRequest]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1LabelTextRequest](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    inline def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
    
    inline def setTextEntityExtractionConfig(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = StObject.set(x, "textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextEntityExtractionConfigUndefined: Self = StObject.set(x, "textEntityExtractionConfig", js.undefined)
  }
}
