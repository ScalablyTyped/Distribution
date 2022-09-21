package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2FaceFrame extends StObject {
  
  /**
    * Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is detected in multiple locations within the current frame.
    */
  var normalizedBoundingBoxes: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox]] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the video frame for this location.
    */
  var timeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2FaceFrame {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2FaceFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2FaceFrame]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2FaceFrame](x: Self) {
    
    inline def setNormalizedBoundingBoxes(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox]): Self = StObject.set(x, "normalizedBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxesUndefined: Self = StObject.set(x, "normalizedBoundingBoxes", js.undefined)
    
    inline def setNormalizedBoundingBoxesVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox*): Self = StObject.set(x, "normalizedBoundingBoxes", js.Array(value*))
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetNull: Self = StObject.set(x, "timeOffset", null)
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
