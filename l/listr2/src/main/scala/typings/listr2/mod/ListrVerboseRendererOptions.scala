package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrVerboseRendererOptions
  extends StObject
     with RendererPresetTimer
     with RendererPresetTimestamp
     with RendererLoggerOptions[ListrLogLevels]
     with ListrLoggerStyleMap[ListrLogLevels] {
  
  /**
    * Log the title changes of the task.
    *
    * @default `false`
    */
  var logTitleChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show duration for the pauses.
    *
    * @defaultValue `PRESET_TIMER`
    */
  var pausedTimer: js.UndefOr[PresetTimer] = js.undefined
}
object ListrVerboseRendererOptions {
  
  inline def apply(): ListrVerboseRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrVerboseRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrVerboseRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setLogTitleChange(value: Boolean): Self = StObject.set(x, "logTitleChange", value.asInstanceOf[js.Any])
    
    inline def setLogTitleChangeUndefined: Self = StObject.set(x, "logTitleChange", js.undefined)
    
    inline def setPausedTimer(value: PresetTimer): Self = StObject.set(x, "pausedTimer", value.asInstanceOf[js.Any])
    
    inline def setPausedTimerUndefined: Self = StObject.set(x, "pausedTimer", js.undefined)
  }
}
