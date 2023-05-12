package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererPresetTimestamp extends StObject {
  
  /**
    * Show timestamp for each event that has been logged.
    */
  var timestamp: js.UndefOr[PresetTimestamp] = js.undefined
}
object RendererPresetTimestamp {
  
  inline def apply(): RendererPresetTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererPresetTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererPresetTimestamp] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: PresetTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
