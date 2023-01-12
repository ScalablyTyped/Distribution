package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterContentLoadEvent
  extends StObject
     with SplitterEvent {
  
  var pane: js.UndefOr[Element] = js.undefined
}
object SplitterContentLoadEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Splitter): SplitterContentLoadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterContentLoadEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitterContentLoadEvent] (val x: Self) extends AnyVal {
    
    inline def setPane(value: Element): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
