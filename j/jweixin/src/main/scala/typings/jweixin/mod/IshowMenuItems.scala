package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IshowMenuItems
  extends StObject
     with BaseParams {
  
  var menuList: typings.jweixin.mod.menuList
}
object IshowMenuItems {
  
  inline def apply(menuList: menuList): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IshowMenuItems]
  }
  
  extension [Self <: IshowMenuItems](x: Self) {
    
    inline def setMenuList(value: menuList): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    inline def setMenuListVarargs(value: (menuBase | menuProtected | menuShare)*): Self = StObject.set(x, "menuList", js.Array(value*))
  }
}
