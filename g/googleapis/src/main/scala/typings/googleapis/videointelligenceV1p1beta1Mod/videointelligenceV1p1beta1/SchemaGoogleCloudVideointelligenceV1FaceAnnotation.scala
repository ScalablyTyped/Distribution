package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1FaceAnnotation extends StObject {
  
  /**
    * All video frames where a face was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1FaceFrame]] = js.undefined
  
  /**
    * All video segments where a face was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1FaceSegment]] = js.undefined
  
  /**
    * Thumbnail of a representative face view (in JPEG format).
    */
  var thumbnail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1FaceAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1FaceAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1FaceAnnotation](x: Self) {
    
    inline def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1FaceFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1FaceFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1FaceSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1FaceSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailNull: Self = StObject.set(x, "thumbnail", null)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
