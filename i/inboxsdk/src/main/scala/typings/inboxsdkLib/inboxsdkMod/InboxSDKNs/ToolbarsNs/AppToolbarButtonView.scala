package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonView extends js.Object {
  var destroyed: scala.Boolean
  def close(): scala.Unit
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  def open(): scala.Unit
  def remove(): scala.Unit
}

object AppToolbarButtonView {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    destroyed: scala.Boolean,
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    open: js.Function0[scala.Unit],
    remove: js.Function0[scala.Unit]
  ): AppToolbarButtonView = {
    val __obj = js.Dynamic.literal(close = close, destroyed = destroyed, open = open, remove = remove)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[AppToolbarButtonView]
  }
}

