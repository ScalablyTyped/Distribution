package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartExpandEvent
  extends StObject
     with OrgChartEvent {
  
  var dataItems: js.UndefOr[Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object OrgChartExpandEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: OrgChart): OrgChartExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgChartExpandEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgChartExpandEvent] (val x: Self) extends AnyVal {
    
    inline def setDataItems(value: Any): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
