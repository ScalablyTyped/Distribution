package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2TextFrame extends StObject {
  
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly] = js.undefined
  
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2TextFrame {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2TextFrame]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2TextFrameMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotatedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly): Self = StObject.set(x, "rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedBoundingBoxUndefined: Self = StObject.set(x, "rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
