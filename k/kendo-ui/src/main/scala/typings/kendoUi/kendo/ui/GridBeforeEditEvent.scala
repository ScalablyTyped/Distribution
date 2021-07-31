package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridBeforeEditEvent
  extends StObject
     with GridEvent {
  
  var model: js.UndefOr[Model] = js.undefined
}
object GridBeforeEditEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBeforeEditEvent]
  }
  
  @scala.inline
  implicit class GridBeforeEditEventMutableBuilder[Self <: GridBeforeEditEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
