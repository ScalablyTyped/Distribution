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

