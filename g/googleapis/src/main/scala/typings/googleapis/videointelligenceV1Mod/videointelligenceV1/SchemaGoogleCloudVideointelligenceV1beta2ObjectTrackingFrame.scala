package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame extends StObject {
  
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox] = js.undefined
  
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrameMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
