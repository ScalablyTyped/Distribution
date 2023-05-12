package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererPresetTimer extends StObject {
  
  /**
    * Show duration for the tasks.
    */
  var timer: js.UndefOr[PresetTimer] = js.undefined
}
object RendererPresetTimer {
  
  inline def apply(): RendererPresetTimer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererPresetTimer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererPresetTimer] (val x: Self) extends AnyVal {
    
    inline def setTimer(value: PresetTimer): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
  }
}
