package typings.inputmask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait C extends js.Object {
  var c: String
  var pos: Double
}

object C {
  @scala.inline
  def apply(c: String, pos: Double): C = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[C]
  }
}

