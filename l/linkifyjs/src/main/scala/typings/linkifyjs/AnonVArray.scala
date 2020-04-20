package typings.linkifyjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVArray extends js.Object {
  var v: js.Array[AnonV]
}

object AnonVArray {
  @scala.inline
  def apply(v: js.Array[AnonV]): AnonVArray = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVArray]
  }
}

