package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGroupEvent
  extends StObject
     with GridEvent {
  
  var groups: js.UndefOr[js.Any] = js.undefined
}
object GridGroupEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridGroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGroupEvent]
  }
  
  @scala.inline
  implicit class GridGroupEventMutableBuilder[Self <: GridGroupEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
  }
}
