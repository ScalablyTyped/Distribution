package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation extends StObject {
  
  /**
    * Entity category information to specify the logo class that all the logo tracks within this LogoRecognitionAnnotation are recognized as.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2Entity] = js.undefined
  
  /**
    * All video segments where the recognized logo appears. There might be multiple instances of the same logo class appearing in one VideoSegment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.undefined
  
  /**
    * All logo tracks where the recognized logo appears. Each track corresponds to one logo instance appearing in consecutive frames.
    */
  var tracks: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2Track]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation](x: Self) {
    
    inline def setEntity(value: SchemaGoogleCloudVideointelligenceV1beta2Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setTracks(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2Track*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
