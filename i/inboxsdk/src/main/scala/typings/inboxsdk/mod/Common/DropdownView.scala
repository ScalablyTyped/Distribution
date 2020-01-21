package typings.inboxsdk.mod.Common

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.preautoclose
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownView extends js.Object {
  var destroyed: Boolean = js.native
  var el: HTMLElement = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
  def reposition(): Unit = js.native
  def setPlacementOptions(options: PositionOptions): Unit = js.native
}

