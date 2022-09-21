package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnimationStatic extends StObject {
  
  /**
    * The time to start displaying the overlay object, in seconds. Default: 0
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0\} to position the top-left corner of the overlay animation in the top-left corner of the output video.
    */
  var xy: js.UndefOr[SchemaNormalizedCoordinate] = js.undefined
}
object SchemaAnimationStatic {
  
  inline def apply(): SchemaAnimationStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnimationStatic]
  }
  
  extension [Self <: SchemaAnimationStatic](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setXy(value: SchemaNormalizedCoordinate): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
