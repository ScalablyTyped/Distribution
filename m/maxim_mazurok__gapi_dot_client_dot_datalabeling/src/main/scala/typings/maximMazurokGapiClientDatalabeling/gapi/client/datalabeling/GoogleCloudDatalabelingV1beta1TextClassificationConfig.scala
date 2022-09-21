package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TextClassificationConfig extends StObject {
  
  /** Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment. */
  var allowMultiLabel: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP. */
  var sentimentConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1SentimentConfig] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TextClassificationConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1TextClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextClassificationConfig]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1TextClassificationConfig](x: Self) {
    
    inline def setAllowMultiLabel(value: Boolean): Self = StObject.set(x, "allowMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiLabelUndefined: Self = StObject.set(x, "allowMultiLabel", js.undefined)
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setSentimentConfig(value: GoogleCloudDatalabelingV1beta1SentimentConfig): Self = StObject.set(x, "sentimentConfig", value.asInstanceOf[js.Any])
    
    inline def setSentimentConfigUndefined: Self = StObject.set(x, "sentimentConfig", js.undefined)
  }
}
