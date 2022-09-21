package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1TimeSegment extends StObject {
  
  /**
    * End of the time segment (exclusive), represented as the duration since the example start.
    */
  var endTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start of the time segment (inclusive), represented as the duration since the example start.
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1TimeSegment {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1TimeSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1TimeSegment]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1TimeSegment](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetNull: Self = StObject.set(x, "endTimeOffset", null)
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
