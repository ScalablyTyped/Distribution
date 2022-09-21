package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1TextDetectionParams extends StObject {
  
  /**
    * A list of advanced OCR options to fine-tune OCR behavior.
    */
  var advancedOcrOptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * By default, Cloud Vision API only includes confidence score for DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence score for TEXT_DETECTION as well.
    */
  var enableTextDetectionConfidenceScore: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1TextDetectionParams {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1TextDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1TextDetectionParams]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1TextDetectionParams](x: Self) {
    
    inline def setAdvancedOcrOptions(value: js.Array[String]): Self = StObject.set(x, "advancedOcrOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOcrOptionsNull: Self = StObject.set(x, "advancedOcrOptions", null)
    
    inline def setAdvancedOcrOptionsUndefined: Self = StObject.set(x, "advancedOcrOptions", js.undefined)
    
    inline def setAdvancedOcrOptionsVarargs(value: String*): Self = StObject.set(x, "advancedOcrOptions", js.Array(value*))
    
    inline def setEnableTextDetectionConfidenceScore(value: Boolean): Self = StObject.set(x, "enableTextDetectionConfidenceScore", value.asInstanceOf[js.Any])
    
    inline def setEnableTextDetectionConfidenceScoreNull: Self = StObject.set(x, "enableTextDetectionConfidenceScore", null)
    
    inline def setEnableTextDetectionConfidenceScoreUndefined: Self = StObject.set(x, "enableTextDetectionConfidenceScore", js.undefined)
  }
}
