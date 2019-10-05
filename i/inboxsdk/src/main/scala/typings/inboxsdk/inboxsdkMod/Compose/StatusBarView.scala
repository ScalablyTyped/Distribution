package typings.inboxsdk.inboxsdkMod.Compose

import typings.inboxsdk.inboxsdkMod.Common.SimpleElementView
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarView extends SimpleElementView {
  def setHeight(height: Double): Unit
}

object StatusBarView {
  @scala.inline
  def apply(
    destroy: () => Unit,
    destroyed: Boolean,
    el: HTMLElement,
    on_destroy: (destroy, js.Function0[Unit]) => Unit,
    setHeight: Double => Unit
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed, el = el, setHeight = js.Any.fromFunction1(setHeight))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[StatusBarView]
  }
}

