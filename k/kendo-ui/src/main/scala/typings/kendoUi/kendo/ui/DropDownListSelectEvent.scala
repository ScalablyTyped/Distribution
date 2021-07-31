package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownListSelectEvent
  extends StObject
     with DropDownListEvent {
  
  var dataItem: js.UndefOr[js.Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object DropDownListSelectEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DropDownList): DropDownListSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListSelectEvent]
  }
  
  @scala.inline
  implicit class DropDownListSelectEventMutableBuilder[Self <: DropDownListSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    @scala.inline
    def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
