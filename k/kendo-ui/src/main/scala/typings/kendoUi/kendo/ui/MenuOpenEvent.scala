package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOpenEvent
  extends StObject
     with MenuEvent {
  
  var item: js.UndefOr[HTMLElement] = js.undefined
}
object MenuOpenEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Menu): MenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOpenEvent]
  }
  
  extension [Self <: MenuOpenEvent](x: Self) {
    
    inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
