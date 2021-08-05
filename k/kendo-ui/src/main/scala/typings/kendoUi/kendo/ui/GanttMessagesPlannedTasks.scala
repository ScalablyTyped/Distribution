package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttMessagesPlannedTasks extends StObject {
  
  var days: js.UndefOr[String] = js.undefined
  
  var hours: js.UndefOr[String] = js.undefined
  
  var minutes: js.UndefOr[String] = js.undefined
  
  var offsetTooltipAdvanced: js.UndefOr[String] = js.undefined
  
  var offsetTooltipDelay: js.UndefOr[String] = js.undefined
  
  var seconds: js.UndefOr[String] = js.undefined
  
  var switchText: js.UndefOr[String] = js.undefined
}
object GanttMessagesPlannedTasks {
  
  inline def apply(): GanttMessagesPlannedTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesPlannedTasks]
  }
  
  extension [Self <: GanttMessagesPlannedTasks](x: Self) {
    
    inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setOffsetTooltipAdvanced(value: String): Self = StObject.set(x, "offsetTooltipAdvanced", value.asInstanceOf[js.Any])
    
    inline def setOffsetTooltipAdvancedUndefined: Self = StObject.set(x, "offsetTooltipAdvanced", js.undefined)
    
    inline def setOffsetTooltipDelay(value: String): Self = StObject.set(x, "offsetTooltipDelay", value.asInstanceOf[js.Any])
    
    inline def setOffsetTooltipDelayUndefined: Self = StObject.set(x, "offsetTooltipDelay", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setSwitchText(value: String): Self = StObject.set(x, "switchText", value.asInstanceOf[js.Any])
    
    inline def setSwitchTextUndefined: Self = StObject.set(x, "switchText", js.undefined)
  }
}
