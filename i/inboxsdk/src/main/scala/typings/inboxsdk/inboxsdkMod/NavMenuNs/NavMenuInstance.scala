package typings.inboxsdk.inboxsdkMod.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavMenuInstance extends js.Object {
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
}

object NavMenuInstance {
  @scala.inline
  def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
  
    __obj.asInstanceOf[NavMenuInstance]
  }
}

