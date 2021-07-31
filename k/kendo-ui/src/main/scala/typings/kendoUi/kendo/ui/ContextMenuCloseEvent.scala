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
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ContextMenu): ContextMenuCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuCloseEvent]
  }
  
  @scala.inline
  implicit class ContextMenuCloseEventMutableBuilder[Self <: ContextMenuCloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
