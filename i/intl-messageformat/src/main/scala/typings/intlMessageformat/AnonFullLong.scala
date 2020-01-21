package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullLong extends js.Object {
  var full: AnonHourMinuteSecond
  var long: AnonHourMinuteSecond
  var medium: AnonHourMinute
  var short: AnonHour
}

object AnonFullLong {
  @scala.inline
  def apply(full: AnonHourMinuteSecond, long: AnonHourMinuteSecond, medium: AnonHourMinute, short: AnonHour): AnonFullLong = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullLong]
  }
}

