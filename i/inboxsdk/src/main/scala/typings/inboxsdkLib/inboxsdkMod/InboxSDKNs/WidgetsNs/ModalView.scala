package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalView extends js.Object {
  var destroyed: scala.Boolean
  def close(): scala.Unit
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}

object ModalView {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    destroyed: scala.Boolean,
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit]
  ): ModalView = {
    val __obj = js.Dynamic.literal(close = close, destroyed = destroyed)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[ModalView]
  }
}

