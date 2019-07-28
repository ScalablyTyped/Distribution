package typings.intlDashMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HourMinuteSecond extends js.Object {
  var hour: String
  var minute: String
  var second: String
  var timeZoneName: String
}

object Anon_HourMinuteSecond {
  @scala.inline
  def apply(hour: String, minute: String, second: String, timeZoneName: String): Anon_HourMinuteSecond = {
    val __obj = js.Dynamic.literal(hour = hour, minute = minute, second = second, timeZoneName = timeZoneName)
  
    __obj.asInstanceOf[Anon_HourMinuteSecond]
  }
}

