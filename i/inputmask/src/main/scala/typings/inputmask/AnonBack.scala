package typings.inputmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBack extends js.Object {
  var back: String
  var front: String
}

object AnonBack {
  @scala.inline
  def apply(back: String, front: String): AnonBack = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBack]
  }
}

