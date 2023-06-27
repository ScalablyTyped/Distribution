package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesViews extends StObject {
  
  var agenda: js.UndefOr[String] = js.undefined
  
  var day: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var timelineMonth: js.UndefOr[String] = js.undefined
  
  var timelineWeek: js.UndefOr[String] = js.undefined
  
  var week: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesViews {
  
  inline def apply(): SchedulerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesViews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerMessagesViews] (val x: Self) extends AnyVal {
    
    inline def setAgenda(value: String): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    inline def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setTimelineMonth(value: String): Self = StObject.set(x, "timelineMonth", value.asInstanceOf[js.Any])
    
    inline def setTimelineMonthUndefined: Self = StObject.set(x, "timelineMonth", js.undefined)
    
    inline def setTimelineWeek(value: String): Self = StObject.set(x, "timelineWeek", value.asInstanceOf[js.Any])
    
    inline def setTimelineWeekUndefined: Self = StObject.set(x, "timelineWeek", js.undefined)
    
    inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
