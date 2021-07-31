package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnUnstickEvent
  extends StObject
     with GridEvent {
  
  var column: js.UndefOr[js.Any] = js.undefined
}
object GridColumnUnstickEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridColumnUnstickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnUnstickEvent]
  }
  
  @scala.inline
  implicit class GridColumnUnstickEventMutableBuilder[Self <: GridColumnUnstickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
