package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramSelectEvent extends DiagramEvent {
  
  var deselected: js.UndefOr[js.Any] = js.native
  
  var selected: js.UndefOr[js.Any] = js.native
}
object DiagramSelectEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramSelectEvent]
  }
  
  @scala.inline
  implicit class DiagramSelectEventMutableBuilder[Self <: DiagramSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeselected(value: js.Any): Self = StObject.set(x, "deselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectedUndefined: Self = StObject.set(x, "deselected", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
