package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavMenuInstance extends js.Object {
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
}

object NavMenuInstance {
  @scala.inline
  def apply(addNavItem: js.Function1[NavItemDescriptor, NavItemView]): NavMenuInstance = {
    val __obj = js.Dynamic.literal(addNavItem = addNavItem)
  
    __obj.asInstanceOf[NavMenuInstance]
  }
}

