package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Menu //////////////////////////////////////////////////
@js.native
trait MenuOptions extends MenuEvents {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
  
  var menus: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[js.Any] = js.native
  
  // TODO
  var role: js.UndefOr[String] = js.native
}
object MenuOptions {
  
  @scala.inline
  def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setMenus(value: String): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
