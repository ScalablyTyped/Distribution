package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroyer extends js.Object {
  def destroy(): Unit
}

object Destroyer {
  @scala.inline
  def apply(destroy: () => Unit): Destroyer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyer]
  }
}

