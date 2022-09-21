package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1TimestampedObject extends StObject {
  
  /**
    * Optional. The attributes of the object in the bounding box.
    */
  var attributes: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1DetectedAttribute]] = js.undefined
  
  /**
    * Optional. The detected landmarks.
    */
  var landmarks: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1DetectedLandmark]] = js.undefined
  
  /**
    * Normalized Bounding box in a frame, where the object is located.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the video frame for this object.
    */
  var timeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1TimestampedObject {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1TimestampedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TimestampedObject]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1TimestampedObject](x: Self) {
    
    inline def setAttributes(value: js.Array[SchemaGoogleCloudVideointelligenceV1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SchemaGoogleCloudVideointelligenceV1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setLandmarks(value: js.Array[SchemaGoogleCloudVideointelligenceV1DetectedLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: SchemaGoogleCloudVideointelligenceV1DetectedLandmark*): Self = StObject.set(x, "landmarks", js.Array(value*))
    
    inline def setNormalizedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetNull: Self = StObject.set(x, "timeOffset", null)
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
