package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerSelectOptions extends StObject {
  
  var end: js.UndefOr[js.Date] = js.undefined
  
  var events: js.UndefOr[js.Array[Any | SchedulerEvent]] = js.undefined
  
  var isAllDay: js.UndefOr[Boolean] = js.undefined
  
  var resources: js.UndefOr[js.Array[Any]] = js.undefined
  
  var start: js.UndefOr[js.Date] = js.undefined
}
object SchedulerSelectOptions {
  
  inline def apply(): SchedulerSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerSelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerSelectOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEvents(value: js.Array[Any | SchedulerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: (Any | SchedulerEvent)*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    inline def setResources(value: js.Array[Any]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Any*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
