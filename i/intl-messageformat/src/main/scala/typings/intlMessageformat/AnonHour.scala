package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHour extends js.Object {
  var hour: String
  var minute: String
}

object AnonHour {
  @scala.inline
  def apply(hour: String, minute: String): AnonHour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHour]
  }
}

