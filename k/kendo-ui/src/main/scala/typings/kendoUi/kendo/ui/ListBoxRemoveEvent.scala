package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxRemoveEvent extends ListBoxEvent {
  
  var dataItems: js.UndefOr[js.Any] = js.native
  
  var items: js.UndefOr[js.Any] = js.native
}
object ListBoxRemoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxRemoveEvent]
  }
  
  @scala.inline
  implicit class ListBoxRemoveEventMutableBuilder[Self <: ListBoxRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItems(value: js.Any): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
