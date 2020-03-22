package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecond extends js.Object {
  var hour: String
  var minute: String
  var second: String
  var timeZoneName: String
}

object AnonSecond {
  @scala.inline
  def apply(hour: String, minute: String, second: String, timeZoneName: String): AnonSecond = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSecond]
  }
}

