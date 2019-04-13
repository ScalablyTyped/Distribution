package typings
package inboxsdkLib.inboxsdkMod.CommonNs

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
    destroy: () => scala.Unit,
    destroyed: scala.Boolean,
    el: stdLib.HTMLElement,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit
  ): SimpleElementView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed, el = el)
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[SimpleElementView]
  }
}

