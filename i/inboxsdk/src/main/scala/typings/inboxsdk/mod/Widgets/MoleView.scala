package typings.inboxsdk.mod.Widgets

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.minimize
import typings.inboxsdk.inboxsdkStrings.restore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoleView extends js.Object {
  
  def close(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
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
