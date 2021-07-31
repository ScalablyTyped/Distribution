package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutResizeEvent
  extends StObject
     with TileLayoutEvent {
  
  var container: js.UndefOr[JQuery] = js.undefined
}
object TileLayoutResizeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TileLayout): TileLayoutResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutResizeEvent]
  }
  
  @scala.inline
  implicit class TileLayoutResizeEventMutableBuilder[Self <: TileLayoutResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
