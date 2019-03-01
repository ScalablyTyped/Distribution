package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionView extends js.Object {
  var destroyed: scala.Boolean
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  def remove(): scala.Unit
}

object SectionView {
  @scala.inline
  def apply(
    destroyed: scala.Boolean,
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    remove: js.Function0[scala.Unit]
  ): SectionView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("on")(on_destroy)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[SectionView]
  }
}

