package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IhideMenuItems
  extends StObject
     with BaseParams {
  
  var menuList: js.Array[menuProtected | menuShare]
}
object IhideMenuItems {
  
  @scala.inline
  def apply(menuList: js.Array[menuProtected | menuShare]): IhideMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IhideMenuItems]
  }
  
  @scala.inline
  implicit class IhideMenuItemsMutableBuilder[Self <: IhideMenuItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuList(value: js.Array[menuProtected | menuShare]): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuListVarargs(value: (menuProtected | menuShare)*): Self = StObject.set(x, "menuList", js.Array(value :_*))
  }
}
