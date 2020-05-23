package typings.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headroom extends js.Object {
  def init(): Unit
}

object Headroom {
  @scala.inline
  def apply(init: () => Unit): Headroom = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[Headroom]
  }
}

