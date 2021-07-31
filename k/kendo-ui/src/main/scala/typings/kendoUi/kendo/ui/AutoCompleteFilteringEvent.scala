package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteFilteringEvent
  extends StObject
     with AutoCompleteEvent {
  
  var filter: js.UndefOr[js.Any] = js.undefined
}
object AutoCompleteFilteringEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: AutoComplete): AutoCompleteFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteFilteringEvent]
  }
  
  @scala.inline
  implicit class AutoCompleteFilteringEventMutableBuilder[Self <: AutoCompleteFilteringEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
