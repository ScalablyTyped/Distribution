package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1PersonDetectionAnnotation extends StObject {
  
  /**
    * The detected tracks of a person.
    */
  var tracks: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1Track]] = js.undefined
  
  /**
    * Feature version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1PersonDetectionAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1PersonDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1PersonDetectionAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1PersonDetectionAnnotation](x: Self) {
    
    inline def setTracks(value: js.Array[SchemaGoogleCloudVideointelligenceV1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: SchemaGoogleCloudVideointelligenceV1Track*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
