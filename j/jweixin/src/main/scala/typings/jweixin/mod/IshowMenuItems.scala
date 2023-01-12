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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IshowMenuItems] (val x: Self) extends AnyVal {
    
    inline def setMenuList(value: menuList): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    inline def setMenuListVarargs(value: (menuBase | menuProtected | menuShare)*): Self = StObject.set(x, "menuList", js.Array(value*))
  }
}
