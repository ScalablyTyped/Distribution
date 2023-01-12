package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ ToolBarClickEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ToolBarCloseEvent, Unit]] = js.undefined
  
  var items: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ToolBarOpenEvent, Unit]] = js.undefined
  
  var overflowClose: js.UndefOr[js.Function1[/* e */ ToolBarOverflowCloseEvent, Unit]] = js.undefined
  
  var overflowOpen: js.UndefOr[js.Function1[/* e */ ToolBarOverflowOpenEvent, Unit]] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var toggle: js.UndefOr[js.Function1[/* e */ ToolBarToggleEvent, Unit]] = js.undefined
}
object ToolBarOptions {
  
  inline def apply(): ToolBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolBarOptions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: /* e */ ToolBarClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setClose(value: /* e */ ToolBarCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setItems(value: js.Array[ToolBarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ToolBarItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ ToolBarOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOverflowClose(value: /* e */ ToolBarOverflowCloseEvent => Unit): Self = StObject.set(x, "overflowClose", js.Any.fromFunction1(value))
    
    inline def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
    
    inline def setOverflowOpen(value: /* e */ ToolBarOverflowOpenEvent => Unit): Self = StObject.set(x, "overflowOpen", js.Any.fromFunction1(value))
    
    inline def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setToggle(value: /* e */ ToolBarToggleEvent => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
