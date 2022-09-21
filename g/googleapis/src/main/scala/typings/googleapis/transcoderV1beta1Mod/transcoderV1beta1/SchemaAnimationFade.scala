package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnimationFade extends StObject {
  
  /**
    * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
    */
  var endTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Type of fade animation: `FADE_IN` or `FADE_OUT`.
    */
  var fadeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time to start the fade animation, in seconds. Default: 0
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0\} to position the top-left corner of the overlay animation in the top-left corner of the output video.
    */
  var xy: js.UndefOr[SchemaNormalizedCoordinate] = js.undefined
}
object SchemaAnimationFade {
  
  inline def apply(): SchemaAnimationFade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnimationFade]
  }
  
  extension [Self <: SchemaAnimationFade](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetNull: Self = StObject.set(x, "endTimeOffset", null)
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setFadeType(value: String): Self = StObject.set(x, "fadeType", value.asInstanceOf[js.Any])
    
    inline def setFadeTypeNull: Self = StObject.set(x, "fadeType", null)
    
    inline def setFadeTypeUndefined: Self = StObject.set(x, "fadeType", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setXy(value: SchemaNormalizedCoordinate): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
