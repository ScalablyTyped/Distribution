package typings.inboxsdk.inboxsdkMod.Common

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleElementView extends js.Object {
  var destroyed: Boolean
  var el: HTMLElement
  def destroy(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object SimpleElementView {
  @scala.inline
  def apply(
    destroy: () => Unit,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Unit
  ): SimpleElementView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[SimpleElementView]
  }
}

