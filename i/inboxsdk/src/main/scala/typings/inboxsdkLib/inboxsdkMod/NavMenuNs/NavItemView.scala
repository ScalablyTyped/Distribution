package typings
package inboxsdkLib.inboxsdkMod.NavMenuNs

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
    addNavItem: NavItemDescriptor => NavItemView,
    destroyed: scala.Boolean,
    isCollapsed: () => scala.Boolean,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    remove: () => scala.Unit,
    setCollapsed: scala.Boolean => scala.Unit
  ): NavItemView = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem), destroyed = destroyed, isCollapsed = js.Any.fromFunction0(isCollapsed), remove = js.Any.fromFunction0(remove), setCollapsed = js.Any.fromFunction1(setCollapsed))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[NavItemView]
  }
}

