package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoleView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def getMinimized(): scala.Boolean = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_minimize(name: inboxsdkLib.inboxsdkLibStrings.minimize, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_restore(name: inboxsdkLib.inboxsdkLibStrings.restore, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMinimized(minimized: scala.Boolean): scala.Unit = js.native
  def setTitle(text: java.lang.String): scala.Unit = js.native
}

