package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHoursTime extends js.Object {
  var day: scala.Double
  var hours: scala.Double
  var minutes: scala.Double
  var nextDate: scala.Double
  var time: java.lang.String
}

object OpeningHoursTime {
  @scala.inline
  def apply(
    day: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    nextDate: scala.Double,
    time: java.lang.String
  ): OpeningHoursTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("nextDate")(nextDate)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[OpeningHoursTime]
  }
}

