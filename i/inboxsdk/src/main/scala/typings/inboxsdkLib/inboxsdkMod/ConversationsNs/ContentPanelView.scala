package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentPanelView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def isActive(): scala.Boolean = js.native
  @JSName("on")
  def on_activate(name: inboxsdkLib.inboxsdkLibStrings.activate, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_deactivate(name: inboxsdkLib.inboxsdkLibStrings.deactivate, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
}

