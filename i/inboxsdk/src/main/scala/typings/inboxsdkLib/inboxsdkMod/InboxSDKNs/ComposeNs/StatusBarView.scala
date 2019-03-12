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
    destroy: () => scala.Unit,
    destroyed: scala.Boolean,
    el: stdLib.HTMLElement,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    setHeight: scala.Double => scala.Unit
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed, el = el, setHeight = js.Any.fromFunction1(setHeight))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[StatusBarView]
  }
}

