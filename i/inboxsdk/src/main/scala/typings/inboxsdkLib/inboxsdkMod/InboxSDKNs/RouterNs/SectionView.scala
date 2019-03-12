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
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    remove: () => scala.Unit
  ): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[SectionView]
  }
}

