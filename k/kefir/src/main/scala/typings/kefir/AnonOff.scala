package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOff extends js.Object {
  var off: js.Function
  var on: js.Function
}

object AnonOff {
  @scala.inline
  def apply(off: js.Function, on: js.Function): AnonOff = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOff]
  }
}

