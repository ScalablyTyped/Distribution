package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1FaceDetectionAnnotation extends StObject {
  
  /**
    * The thumbnail of a person's face.
    */
  var thumbnail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The face tracks with attributes.
    */
  var tracks: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1Track]] = js.undefined
  
  /**
    * Feature version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1FaceDetectionAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1FaceDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1FaceDetectionAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1FaceDetectionAnnotation](x: Self) {
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailNull: Self = StObject.set(x, "thumbnail", null)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTracks(value: js.Array[SchemaGoogleCloudVideointelligenceV1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: SchemaGoogleCloudVideointelligenceV1Track*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
