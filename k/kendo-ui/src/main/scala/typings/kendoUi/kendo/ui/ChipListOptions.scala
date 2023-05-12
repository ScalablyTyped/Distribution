package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipListOptions extends StObject {
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var itemSize: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[ChipListItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ ChipListRemoveEvent, Unit]] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ChipListSelectEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ChipListOptions {
  
  inline def apply(): ChipListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChipListOptions] (val x: Self) extends AnyVal {
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setItemSize(value: String): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    inline def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
    
    inline def setItems(value: js.Array[ChipListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChipListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemove(value: /* e */ ChipListRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSelect(value: /* e */ ChipListSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
