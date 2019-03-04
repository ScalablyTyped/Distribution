package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarView
  extends inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.SimpleElementView {
  def setHeight(height: scala.Double): scala.Unit
}

object StatusBarView {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    destroyed: scala.Boolean,
    el: stdLib.HTMLElement,
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    setHeight: js.Function1[scala.Double, scala.Unit]
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = destroy, destroyed = destroyed, el = el, setHeight = setHeight)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[StatusBarView]
  }
}

