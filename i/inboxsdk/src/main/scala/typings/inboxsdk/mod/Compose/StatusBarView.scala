package typings.inboxsdk.mod.Compose

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.mod.Common.SimpleElementView
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
    on: (destroy, js.Function0[Unit]) => Unit,
    setHeight: Double => Unit
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), setHeight = js.Any.fromFunction1(setHeight))
    __obj.asInstanceOf[StatusBarView]
  }
}

