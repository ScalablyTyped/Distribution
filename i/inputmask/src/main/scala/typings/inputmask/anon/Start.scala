package typings.inputmask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends js.Object {
  var end: Double
  var start: Double
}

object Start {
  @scala.inline
  def apply(end: Double, start: Double): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

