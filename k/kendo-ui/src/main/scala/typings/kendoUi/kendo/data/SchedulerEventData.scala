package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerEventData extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[js.Date] = js.undefined
  
  var endTimezone: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var isAllDay: js.UndefOr[Boolean] = js.undefined
  
  var recurrenceException: js.UndefOr[String] = js.undefined
  
  var recurrenceId: js.UndefOr[Any] = js.undefined
  
  var recurrenceRule: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[js.Date] = js.undefined
  
  var startTimezone: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object SchedulerEventData {
  
  inline def apply(): SchedulerEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerEventData]
  }
  
  extension [Self <: SchedulerEventData](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndTimezone(value: String): Self = StObject.set(x, "endTimezone", value.asInstanceOf[js.Any])
    
    inline def setEndTimezoneUndefined: Self = StObject.set(x, "endTimezone", js.undefined)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    inline def setRecurrenceException(value: String): Self = StObject.set(x, "recurrenceException", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceExceptionUndefined: Self = StObject.set(x, "recurrenceException", js.undefined)
    
    inline def setRecurrenceId(value: Any): Self = StObject.set(x, "recurrenceId", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceIdUndefined: Self = StObject.set(x, "recurrenceId", js.undefined)
    
    inline def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartTimezone(value: String): Self = StObject.set(x, "startTimezone", value.asInstanceOf[js.Any])
    
    inline def setStartTimezoneUndefined: Self = StObject.set(x, "startTimezone", js.undefined)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
