package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation extends StObject {
  
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation](x: Self) {
    
    inline def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
  }
}
