package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video segment level annotation results for text detection.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1TextSegment extends StObject {
  
  /**
    * Confidence for the track of detected text. It is calculated as the
    * highest over all frames where OCR detected text appears.
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Information related to the frames where OCR detected text appears.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame]] = js.undefined
  
  /**
    * Video segment where a text snippet was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1TextSegment {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1TextSegment]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1TextSegment](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    inline def setSegment(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
