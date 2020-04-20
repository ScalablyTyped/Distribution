package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImmediate extends js.Object {
  var immediate: Boolean
}

object AnonImmediate {
  @scala.inline
  def apply(immediate: Boolean): AnonImmediate = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImmediate]
  }
}

