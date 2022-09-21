package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack extends StObject {
  
  /**
    * Top N match of the celebrities for the face in this track.
    */
  var celebrities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]] = js.undefined
  
  /**
    * A track of a person's face.
    */
  var faceTrack: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1Track] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1CelebrityTrack](x: Self) {
    
    inline def setCelebrities(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]): Self = StObject.set(x, "celebrities", value.asInstanceOf[js.Any])
    
    inline def setCelebritiesUndefined: Self = StObject.set(x, "celebrities", js.undefined)
    
    inline def setCelebritiesVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity*): Self = StObject.set(x, "celebrities", js.Array(value*))
    
    inline def setFaceTrack(value: SchemaGoogleCloudVideointelligenceV1p3beta1Track): Self = StObject.set(x, "faceTrack", value.asInstanceOf[js.Any])
    
    inline def setFaceTrackUndefined: Self = StObject.set(x, "faceTrack", js.undefined)
  }
}
