package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p2beta1FaceSegment extends StObject {
  
  /**
    * Video segment where a face was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1FaceSegment {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1FaceSegment]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1FaceSegment](x: Self) {
    
    inline def setSegment(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
