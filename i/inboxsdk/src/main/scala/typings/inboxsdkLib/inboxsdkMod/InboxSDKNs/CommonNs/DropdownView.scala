package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownView extends js.Object {
  var destroyed: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  def close(): scala.Unit = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_preautoclose(
    name: inboxsdkLib.inboxsdkLibStrings.preautoclose,
    cb: js.Function1[/* event */ PreAutoCloseEvent, scala.Unit]
  ): scala.Unit = js.native
  def reposition(): scala.Unit = js.native
  def setPlacementOptions(options: PositionOptions): scala.Unit = js.native
}

