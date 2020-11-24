package typings.inboxsdk.mod.NavMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavMenuInstance extends js.Object {
  
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView = js.native
}
object NavMenuInstance {
  
  @scala.inline
  def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
    __obj.asInstanceOf[NavMenuInstance]
  }
  
  @scala.inline
  implicit class NavMenuInstanceOps[Self <: NavMenuInstance] (val x: Self) extends AnyVal {
    
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
    def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = this.set("addNavItem", js.Any.fromFunction1(value))
  }
}
