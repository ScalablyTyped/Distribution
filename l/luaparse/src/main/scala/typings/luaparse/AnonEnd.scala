package typings.luaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: AnonColumn
  var start: AnonColumn
}

object AnonEnd {
  @scala.inline
  def apply(end: AnonColumn, start: AnonColumn): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

