package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMenu extends StObject {
  
  var closeMenu: js.UndefOr[String] = js.undefined
  
  var openMenu: js.UndefOr[String] = js.undefined
}
object OpenMenu {
  
  inline def apply(): OpenMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenMenu]
  }
  
  extension [Self <: OpenMenu](x: Self) {
    
    inline def setCloseMenu(value: String): Self = StObject.set(x, "closeMenu", value.asInstanceOf[js.Any])
    
    inline def setCloseMenuUndefined: Self = StObject.set(x, "closeMenu", js.undefined)
    
    inline def setOpenMenu(value: String): Self = StObject.set(x, "openMenu", value.asInstanceOf[js.Any])
    
    inline def setOpenMenuUndefined: Self = StObject.set(x, "openMenu", js.undefined)
  }
}
