package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxDropEvent
  extends StObject
     with ListBoxEvent {
  
  var dataItems: js.UndefOr[Any] = js.undefined
  
  var items: js.UndefOr[Any] = js.undefined
}
object ListBoxDropEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxDropEvent] (val x: Self) extends AnyVal {
    
    inline def setDataItems(value: Any): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
