package typings.makeupFloatingLabel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabel extends js.Object {
  def refresh(): Unit
}

object FloatingLabel {
  @scala.inline
  def apply(refresh: () => Unit): FloatingLabel = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[FloatingLabel]
  }
}

