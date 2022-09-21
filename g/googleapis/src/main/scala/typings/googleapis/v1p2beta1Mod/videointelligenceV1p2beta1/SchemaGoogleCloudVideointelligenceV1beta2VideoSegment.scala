package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2VideoSegment extends StObject {
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the end of the segment (inclusive).
    */
  var endTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the start of the segment (inclusive).
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2VideoSegment {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetNull: Self = StObject.set(x, "endTimeOffset", null)
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
