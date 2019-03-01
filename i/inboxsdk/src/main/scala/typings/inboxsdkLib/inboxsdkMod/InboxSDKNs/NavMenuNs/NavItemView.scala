package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemView extends js.Object {
  var destroyed: scala.Boolean
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
  def isCollapsed(): scala.Boolean
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  def remove(): scala.Unit
  def setCollapsed(collapseValue: scala.Boolean): scala.Unit
}

object NavItemView {
  @scala.inline
  def apply(
    addNavItem: js.Function1[NavItemDescriptor, NavItemView],
    destroyed: scala.Boolean,
    isCollapsed: js.Function0[scala.Boolean],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    remove: js.Function0[scala.Unit],
    setCollapsed: js.Function1[scala.Boolean, scala.Unit]
  ): NavItemView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNavItem")(addNavItem)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("isCollapsed")(isCollapsed)
    __obj.updateDynamic("on")(on_destroy)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setCollapsed")(setCollapsed)
    __obj.asInstanceOf[NavItemView]
  }
}

