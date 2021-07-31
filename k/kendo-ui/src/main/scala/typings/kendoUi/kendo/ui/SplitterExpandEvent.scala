package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterExpandEvent
  extends StObject
     with SplitterEvent {
  
  var pane: js.UndefOr[Element] = js.undefined
}
object SplitterExpandEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Splitter): SplitterExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterExpandEvent]
  }
  
  @scala.inline
  implicit class SplitterExpandEventMutableBuilder[Self <: SplitterExpandEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPane(value: Element): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
