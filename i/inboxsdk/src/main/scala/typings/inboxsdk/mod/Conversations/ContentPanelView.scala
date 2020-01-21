package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.activate
import typings.inboxsdk.inboxsdkStrings.deactivate
import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentPanelView extends js.Object {
  var destroyed: Boolean = js.native
  /**
    * Undocumented method, no guarantee it will always work.
    */
  def close(): Unit = js.native
  def isActive(): Boolean = js.native
  @JSName("on")
  def on_activate(name: activate, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_deactivate(name: deactivate, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  def open(): Unit = js.native
  def remove(): Unit = js.native
}

