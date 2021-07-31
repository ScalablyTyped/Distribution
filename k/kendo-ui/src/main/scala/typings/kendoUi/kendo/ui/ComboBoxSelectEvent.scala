package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxSelectEvent
  extends StObject
     with ComboBoxEvent {
  
  var dataItem: js.UndefOr[js.Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object ComboBoxSelectEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ComboBox): ComboBoxSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxSelectEvent]
  }
  
  @scala.inline
  implicit class ComboBoxSelectEventMutableBuilder[Self <: ComboBoxSelectEvent] (val x: Self) extends AnyVal {
    
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
