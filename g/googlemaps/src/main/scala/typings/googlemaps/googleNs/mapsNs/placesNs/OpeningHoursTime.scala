package typings.googlemaps.googleNs.mapsNs.placesNs

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
    val __obj = js.Dynamic.literal(day = day, hours = hours, minutes = minutes, nextDate = nextDate, time = time)
  
    __obj.asInstanceOf[OpeningHoursTime]
  }
}

