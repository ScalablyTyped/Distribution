package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
trait SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation extends StObject {
  
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotationMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
  }
}
