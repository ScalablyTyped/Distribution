package typings.inputmask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Back extends js.Object {
  var back: String
  var front: String
}

object Back {
  @scala.inline
  def apply(back: String, front: String): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
}

