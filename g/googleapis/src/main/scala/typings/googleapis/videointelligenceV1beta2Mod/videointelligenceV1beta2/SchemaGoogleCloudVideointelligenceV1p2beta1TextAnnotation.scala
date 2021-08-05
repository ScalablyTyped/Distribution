package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotations related to one detected OCR text snippet. This will contain the
  * corresponding text, confidence value, and frame level information for each
  * detection.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1TextAnnotation extends StObject {
  
  /**
    * All video segments where OCR detected text appears.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1TextSegment]] = js.undefined
  
  /**
    * The detected text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1TextAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1TextAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1TextAnnotation](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1TextSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
