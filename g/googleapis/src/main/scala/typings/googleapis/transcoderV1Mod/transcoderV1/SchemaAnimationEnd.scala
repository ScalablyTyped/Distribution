package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnimationEnd extends StObject {
  
  /**
    * The time to end overlay object, in seconds. Default: 0
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnimationEnd {
  
  inline def apply(): SchemaAnimationEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnimationEnd]
  }
  
  extension [Self <: SchemaAnimationEnd](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
