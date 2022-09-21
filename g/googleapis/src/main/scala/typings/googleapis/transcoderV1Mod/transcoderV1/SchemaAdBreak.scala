package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdBreak extends StObject {
  
  /**
    * Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`.
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdBreak {
  
  inline def apply(): SchemaAdBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdBreak]
  }
  
  extension [Self <: SchemaAdBreak](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
