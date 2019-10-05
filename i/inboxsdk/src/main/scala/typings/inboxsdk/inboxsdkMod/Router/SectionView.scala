package typings.inboxsdk.inboxsdkMod.Router

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
  def apply(destroyed: Boolean, on_destroy: (destroy, js.Function0[Unit]) => Unit, remove: () => Unit): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[SectionView]
  }
}

