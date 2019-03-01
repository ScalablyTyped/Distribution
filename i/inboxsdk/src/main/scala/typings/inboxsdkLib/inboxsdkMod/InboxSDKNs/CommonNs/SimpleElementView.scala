package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleElementView extends js.Object {
  var destroyed: scala.Boolean
  var el: stdLib.HTMLElement
  def destroy(): scala.Unit
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}

object SimpleElementView {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    destroyed: scala.Boolean,
    el: stdLib.HTMLElement,
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit]
  ): SimpleElementView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("el")(el)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[SimpleElementView]
  }
}

