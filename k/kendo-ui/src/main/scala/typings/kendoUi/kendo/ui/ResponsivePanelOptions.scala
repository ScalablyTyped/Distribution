package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsivePanelOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var breakpoint: js.UndefOr[Double] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var toggleButton: js.UndefOr[String] = js.undefined
}
object ResponsivePanelOptions {
  
  @scala.inline
  def apply(): ResponsivePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsivePanelOptions]
  }
  
  @scala.inline
  implicit class ResponsivePanelOptionsMutableBuilder[Self <: ResponsivePanelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ResponsivePanelEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ResponsivePanelEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setToggleButton(value: String): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
  }
}
