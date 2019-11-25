package typings.inboxsdk.inboxsdkMod.Toolbars

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonView extends js.Object {
  var destroyed: Boolean
  def close(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def open(): Unit
  def remove(): Unit
}

object AppToolbarButtonView {
  @scala.inline
  def apply(
    close: () => Unit,
    destroyed: Boolean,
    on: (destroy, js.Function0[Unit]) => Unit,
    open: () => Unit,
    remove: () => Unit
  ): AppToolbarButtonView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[AppToolbarButtonView]
  }
}

