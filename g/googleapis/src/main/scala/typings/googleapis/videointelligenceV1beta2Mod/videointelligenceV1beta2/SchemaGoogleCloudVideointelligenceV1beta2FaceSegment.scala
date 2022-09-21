package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2FaceSegment extends StObject {
  
  /**
    * Video segment where a face was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2FaceSegment {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2FaceSegment]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2FaceSegment](x: Self) {
    
    inline def setSegment(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
