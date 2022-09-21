package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig extends StObject {
  
  /**
    * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one image.
    */
  var allowMultiLabel: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Annotation spec set resource name.
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of how to aggregate answers.
    */
  var answerAggregationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImageClassificationConfig](x: Self) {
    
    inline def setAllowMultiLabel(value: Boolean): Self = StObject.set(x, "allowMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiLabelNull: Self = StObject.set(x, "allowMultiLabel", null)
    
    inline def setAllowMultiLabelUndefined: Self = StObject.set(x, "allowMultiLabel", js.undefined)
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setAnswerAggregationType(value: String): Self = StObject.set(x, "answerAggregationType", value.asInstanceOf[js.Any])
    
    inline def setAnswerAggregationTypeNull: Self = StObject.set(x, "answerAggregationType", null)
    
    inline def setAnswerAggregationTypeUndefined: Self = StObject.set(x, "answerAggregationType", js.undefined)
  }
}
