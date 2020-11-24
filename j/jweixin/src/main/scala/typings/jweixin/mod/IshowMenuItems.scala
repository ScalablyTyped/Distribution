package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IshowMenuItems extends BaseParams {
  
  var menuList: typings.jweixin.mod.menuList = js.native
}
object IshowMenuItems {
  
  @scala.inline
  def apply(menuList: menuList): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IshowMenuItems]
  }
  
  @scala.inline
  implicit class IshowMenuItemsOps[Self <: IshowMenuItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMenuListVarargs(value: (menuBase | menuProtected | menuShare)*): Self = this.set("menuList", js.Array(value :_*))
    
    @scala.inline
    def setMenuList(value: menuList): Self = this.set("menuList", value.asInstanceOf[js.Any])
  }
}
