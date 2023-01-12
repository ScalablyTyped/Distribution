package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Menu //////////////////////////////////////////////////
trait MenuOptions
  extends StObject
     with MenuEvents {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[Any] = js.undefined
  
  var menus: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[Any] = js.undefined
  
  // TODO
  var role: js.UndefOr[String] = js.undefined
}
object MenuOptions {
  
  inline def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcons(value: Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setMenus(value: String): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
