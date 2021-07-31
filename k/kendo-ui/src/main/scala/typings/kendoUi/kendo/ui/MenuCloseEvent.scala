package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuCloseEvent
  extends StObject
     with MenuEvent {
  
  var item: js.UndefOr[HTMLElement] = js.undefined
}
object MenuCloseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Menu): MenuCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuCloseEvent]
  }
  
  @scala.inline
  implicit class MenuCloseEventMutableBuilder[Self <: MenuCloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
