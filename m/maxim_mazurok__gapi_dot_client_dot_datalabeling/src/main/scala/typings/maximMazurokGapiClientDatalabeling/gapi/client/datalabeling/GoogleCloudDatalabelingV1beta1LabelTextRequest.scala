package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelTextRequest extends StObject {
  
  /** Required. Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
  
  /** Required. The type of text labeling task. */
  var feature: js.UndefOr[String] = js.native
  
  /** Configuration for text classification task. One of text_classification_config and text_entity_extraction_config is required. */
  var textClassificationConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextClassificationConfig] = js.native
  
  /** Configuration for entity extraction task. One of text_classification_config and text_entity_extraction_config is required. */
  var textEntityExtractionConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1LabelTextRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelTextRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelTextRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = StObject.set(x, "textClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClassificationConfigUndefined: Self = StObject.set(x, "textClassificationConfig", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionConfig(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = StObject.set(x, "textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEntityExtractionConfigUndefined: Self = StObject.set(x, "textEntityExtractionConfig", js.undefined)
  }
}
