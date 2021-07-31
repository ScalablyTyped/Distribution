package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxFilteringEvent
  extends StObject
     with MultiColumnComboBoxEvent {
  
  var filter: js.UndefOr[js.Any] = js.undefined
}
object MultiColumnComboBoxFilteringEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: MultiColumnComboBox): MultiColumnComboBoxFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxFilteringEvent]
  }
  
  @scala.inline
  implicit class MultiColumnComboBoxFilteringEventMutableBuilder[Self <: MultiColumnComboBoxFilteringEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
