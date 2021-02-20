package typings.kendoUi.kendo.data

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEventData extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[Date] = js.native
  
  var endTimezone: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var isAllDay: js.UndefOr[Boolean] = js.native
  
  var recurrenceException: js.UndefOr[String] = js.native
  
  var recurrenceId: js.UndefOr[js.Any] = js.native
  
  var recurrenceRule: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Date] = js.native
  
  var startTimezone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchedulerEventData {
  
  @scala.inline
  def apply(): SchedulerEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerEventData]
  }
  
  @scala.inline
  implicit class SchedulerEventDataMutableBuilder[Self <: SchedulerEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimezone(value: String): Self = StObject.set(x, "endTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimezoneUndefined: Self = StObject.set(x, "endTimezone", js.undefined)
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    @scala.inline
    def setRecurrenceException(value: String): Self = StObject.set(x, "recurrenceException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceExceptionUndefined: Self = StObject.set(x, "recurrenceException", js.undefined)
    
    @scala.inline
    def setRecurrenceId(value: js.Any): Self = StObject.set(x, "recurrenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceIdUndefined: Self = StObject.set(x, "recurrenceId", js.undefined)
    
    @scala.inline
    def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimezone(value: String): Self = StObject.set(x, "startTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimezoneUndefined: Self = StObject.set(x, "startTimezone", js.undefined)
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
