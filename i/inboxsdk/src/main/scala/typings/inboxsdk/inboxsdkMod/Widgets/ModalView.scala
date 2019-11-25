package typings.inboxsdk.inboxsdkMod.Widgets

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalView extends js.Object {
  var destroyed: Boolean
  def close(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object ModalView {
  @scala.inline
  def apply(close: () => Unit, destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit): ModalView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[ModalView]
  }
}

