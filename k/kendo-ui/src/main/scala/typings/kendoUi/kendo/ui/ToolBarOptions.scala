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
  
  @scala.inline
  def apply(): ToolBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarOptions]
  }
  
  @scala.inline
  implicit class ToolBarOptionsMutableBuilder[Self <: ToolBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: /* e */ ToolBarClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ToolBarCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ToolBarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ToolBarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ToolBarOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOverflowClose(value: /* e */ ToolBarOverflowCloseEvent => Unit): Self = StObject.set(x, "overflowClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
    
    @scala.inline
    def setOverflowOpen(value: /* e */ ToolBarOverflowOpenEvent => Unit): Self = StObject.set(x, "overflowOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setToggle(value: /* e */ ToolBarToggleEvent => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
