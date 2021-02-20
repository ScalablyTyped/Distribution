package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseMenu extends StObject {
  
  var closeMenu: js.UndefOr[String] = js.native
  
  var openMenu: js.UndefOr[String] = js.native
}
object CloseMenu {
  
  @scala.inline
  def apply(): CloseMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMenu]
  }
  
  @scala.inline
  implicit class CloseMenuMutableBuilder[Self <: CloseMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseMenu(value: String): Self = StObject.set(x, "closeMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseMenuUndefined: Self = StObject.set(x, "closeMenu", js.undefined)
    
    @scala.inline
    def setOpenMenu(value: String): Self = StObject.set(x, "openMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMenuUndefined: Self = StObject.set(x, "openMenu", js.undefined)
  }
}
