package typings.jqueryDrawer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryDrawerClassOptions extends StObject {
  
  var close: js.UndefOr[String] = js.undefined
  
  var dropdown: js.UndefOr[String] = js.undefined
  
  var nav: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[String] = js.undefined
  
  var toggle: js.UndefOr[String] = js.undefined
}
object JQueryDrawerClassOptions {
  
  inline def apply(): JQueryDrawerClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerClassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryDrawerClassOptions] (val x: Self) extends AnyVal {
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    inline def setNav(value: String): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
