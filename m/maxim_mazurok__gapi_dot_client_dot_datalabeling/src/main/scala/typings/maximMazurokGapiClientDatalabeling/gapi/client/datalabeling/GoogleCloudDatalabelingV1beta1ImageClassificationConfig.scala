package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImageClassificationConfig extends StObject {
  
  /** Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one image. */
  var allowMultiLabel: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Optional. The type of how to aggregate answers. */
  var answerAggregationType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImageClassificationConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImageClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageClassificationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImageClassificationConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowMultiLabel(value: Boolean): Self = StObject.set(x, "allowMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiLabelUndefined: Self = StObject.set(x, "allowMultiLabel", js.undefined)
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setAnswerAggregationType(value: String): Self = StObject.set(x, "answerAggregationType", value.asInstanceOf[js.Any])
    
    inline def setAnswerAggregationTypeUndefined: Self = StObject.set(x, "answerAggregationType", js.undefined)
  }
}
