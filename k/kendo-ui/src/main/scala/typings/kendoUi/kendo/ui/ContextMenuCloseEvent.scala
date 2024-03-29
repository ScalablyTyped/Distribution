package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuCloseEvent
  extends StObject
     with ContextMenuEvent {
  
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  
  var item: js.UndefOr[Element] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ContextMenuCloseEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ContextMenu): ContextMenuCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuCloseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuCloseEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
