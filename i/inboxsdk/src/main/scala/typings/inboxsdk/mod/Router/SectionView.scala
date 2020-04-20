package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionView extends js.Object {
  var destroyed: Boolean
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def remove(): Unit
}

object SectionView {
  @scala.inline
  def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit, remove: () => Unit): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SectionView]
  }
}

