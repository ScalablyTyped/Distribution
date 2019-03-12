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
    close: () => scala.Unit,
    destroyed: scala.Boolean,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    open: () => scala.Unit,
    remove: () => scala.Unit
  ): AppToolbarButtonView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed, open = js.Any.fromFunction0(open), remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[AppToolbarButtonView]
  }
}

