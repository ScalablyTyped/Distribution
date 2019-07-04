package typings
package intlDashMessageformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HourMinuteSecond extends js.Object {
  var hour: java.lang.String
  var minute: java.lang.String
  var second: java.lang.String
  var timeZoneName: java.lang.String
}

object Anon_HourMinuteSecond {
  @scala.inline
  def apply(
    hour: java.lang.String,
    minute: java.lang.String,
    second: java.lang.String,
    timeZoneName: java.lang.String
  ): Anon_HourMinuteSecond = {
    val __obj = js.Dynamic.literal(hour = hour, minute = minute, second = second, timeZoneName = timeZoneName)
  
    __obj.asInstanceOf[Anon_HourMinuteSecond]
  }
}

