package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation extends StObject {
  
  /**
    * The tracks detected from the input video, including recognized celebrities and other detected faces in the video.
    */
  var celebrityTracks: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack]] = js.undefined
  
  /**
    * Feature version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation](x: Self) {
    
    inline def setCelebrityTracks(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack]): Self = StObject.set(x, "celebrityTracks", value.asInstanceOf[js.Any])
    
    inline def setCelebrityTracksUndefined: Self = StObject.set(x, "celebrityTracks", js.undefined)
    
    inline def setCelebrityTracksVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack*): Self = StObject.set(x, "celebrityTracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
