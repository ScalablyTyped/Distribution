package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownListFilteringEvent
  extends StObject
     with DropDownListEvent {
  
  var filter: js.UndefOr[js.Any] = js.undefined
}
object DropDownListFilteringEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DropDownList): DropDownListFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListFilteringEvent]
  }
  
  @scala.inline
  implicit class DropDownListFilteringEventMutableBuilder[Self <: DropDownListFilteringEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
