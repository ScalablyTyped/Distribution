package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuActivateEvent
  extends StObject
     with MenuEvent {
  
  var item: js.UndefOr[HTMLElement] = js.undefined
}
object MenuActivateEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Menu): MenuActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuActivateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuActivateEvent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
