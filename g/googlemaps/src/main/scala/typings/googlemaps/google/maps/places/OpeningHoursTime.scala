package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHoursTime extends js.Object {
  var day: Double
  var hours: Double
  var minutes: Double
  var nextDate: Double
  var time: String
}

object OpeningHoursTime {
  @scala.inline
  def apply(day: Double, hours: Double, minutes: Double, nextDate: Double, time: String): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], nextDate = nextDate.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
}

