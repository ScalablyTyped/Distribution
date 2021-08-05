package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxReorderEvent
  extends StObject
     with ListBoxEvent {
  
  var dataItems: js.UndefOr[js.Any] = js.undefined
  
  var items: js.UndefOr[js.Any] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object ListBoxReorderEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxReorderEvent]
  }
  
  extension [Self <: ListBoxReorderEvent](x: Self) {
    
    inline def setDataItems(value: js.Any): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
