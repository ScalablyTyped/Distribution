package typings.jqueryDrawer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryDrawerClassOptions extends StObject {
  
  var close: js.UndefOr[String] = js.native
  
  var dropdown: js.UndefOr[String] = js.native
  
  var nav: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[String] = js.native
}
object JQueryDrawerClassOptions {
  
  @scala.inline
  def apply(): JQueryDrawerClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerClassOptions]
  }
  
  @scala.inline
  implicit class JQueryDrawerClassOptionsMutableBuilder[Self <: JQueryDrawerClassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    @scala.inline
    def setNav(value: String): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
