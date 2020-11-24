package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelTextRequest extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1LabelTextRequestOps[Self <: GoogleCloudDatalabelingV1beta1LabelTextRequest] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setTextClassificationConfig(value: GoogleCloudDatalabelingV1beta1TextClassificationConfig): Self = this.set("textClassificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassificationConfig: Self = this.set("textClassificationConfig", js.undefined)
    
    @scala.inline
    def setTextEntityExtractionConfig(value: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig): Self = this.set("textEntityExtractionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEntityExtractionConfig: Self = this.set("textEntityExtractionConfig", js.undefined)
  }
}
