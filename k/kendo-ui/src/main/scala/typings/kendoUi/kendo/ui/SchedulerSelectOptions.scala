package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerSelectOptions extends StObject {
  
  var end: js.UndefOr[Date] = js.native
  
  var events: js.UndefOr[js.Array[_ | SchedulerEvent]] = js.native
  
  var isAllDay: js.UndefOr[Boolean] = js.native
  
  var resources: js.UndefOr[js.Array[_]] = js.native
  
  var start: js.UndefOr[Date] = js.native
}
object SchedulerSelectOptions {
  
  @scala.inline
  def apply(): SchedulerSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerSelectOptions]
  }
  
  @scala.inline
  implicit class SchedulerSelectOptionsMutableBuilder[Self <: SchedulerSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[_ | SchedulerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (js.Any | SchedulerEvent)*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[_]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: js.Any*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
