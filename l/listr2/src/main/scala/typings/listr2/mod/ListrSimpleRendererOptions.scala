package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrSimpleRendererOptions
  extends StObject
     with RendererPresetTimer
     with RendererPresetTimestamp
     with RendererLoggerOptions[ListrLogLevels]
     with ListrLoggerStyleMap[ListrLogLevels] {
  
  /**
    * Show duration for the pauses.
    *
    * @defaultValue `PRESET_TIMER`
    */
  var pausedTimer: js.UndefOr[PresetTimer] = js.undefined
}
object ListrSimpleRendererOptions {
  
  inline def apply(): ListrSimpleRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrSimpleRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrSimpleRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setPausedTimer(value: PresetTimer): Self = StObject.set(x, "pausedTimer", value.asInstanceOf[js.Any])
    
    inline def setPausedTimerUndefined: Self = StObject.set(x, "pausedTimer", js.undefined)
  }
}
