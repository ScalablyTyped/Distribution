package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinute extends js.Object {
  var hour: String
  var minute: String
  var second: String
}

object AnonMinute {
  @scala.inline
  def apply(hour: String, minute: String, second: String): AnonMinute = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinute]
  }
}

