package typings.inboxsdk.inboxsdkMod.WidgetsNs

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.minimize
import typings.inboxsdk.inboxsdkStrings.restore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoleView extends js.Object {
  var destroyed: Boolean = js.native
  def close(): Unit = js.native
  def getMinimized(): Boolean = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_minimize(name: minimize, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_restore(name: restore, cb: js.Function0[Unit]): Unit = js.native
  def setMinimized(minimized: Boolean): Unit = js.native
  def setTitle(text: String): Unit = js.native
}

