package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1TextFrame extends StObject {
  
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly] = js.undefined
  
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1TextFrame {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1TextFrame]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1TextFrame](x: Self) {
    
    inline def setRotatedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly): Self = StObject.set(x, "rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setRotatedBoundingBoxUndefined: Self = StObject.set(x, "rotatedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
