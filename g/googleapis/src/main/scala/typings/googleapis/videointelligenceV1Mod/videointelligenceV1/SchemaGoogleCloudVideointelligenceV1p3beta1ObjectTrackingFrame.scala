package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame extends StObject {
  
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox] = js.undefined
  
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame](x: Self) {
    
    inline def setNormalizedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
