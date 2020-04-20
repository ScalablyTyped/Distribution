package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemView extends js.Object {
  var destroyed: Boolean
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
  def isCollapsed(): Boolean
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def remove(): Unit
  def setCollapsed(collapseValue: Boolean): Unit
}

object NavItemView {
  @scala.inline
  def apply(
    addNavItem: NavItemDescriptor => NavItemView,
    destroyed: Boolean,
    isCollapsed: () => Boolean,
    on: (destroy, js.Function0[Unit]) => Unit,
    remove: () => Unit,
    setCollapsed: Boolean => Unit
  ): NavItemView = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem), destroyed = destroyed.asInstanceOf[js.Any], isCollapsed = js.Any.fromFunction0(isCollapsed), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCollapsed = js.Any.fromFunction1(setCollapsed))
    __obj.asInstanceOf[NavItemView]
  }
}

