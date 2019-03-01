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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("el")(el)
    __obj.updateDynamic("on")(on_destroy)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.asInstanceOf[StatusBarView]
  }
}

