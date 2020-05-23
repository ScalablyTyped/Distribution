package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Off extends js.Object {
  var off: js.Function
  var on: js.Function
}

object Off {
  @scala.inline
  def apply(off: js.Function, on: js.Function): Off = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[Off]
  }
}

