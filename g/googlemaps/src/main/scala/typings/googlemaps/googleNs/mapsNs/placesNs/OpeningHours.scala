package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHours extends js.Object {
  var open_now: Boolean
  var periods: js.Array[OpeningPeriod]
  var weekday_text: js.Array[String]
}

object OpeningHours {
  @scala.inline
  def apply(open_now: Boolean, periods: js.Array[OpeningPeriod], weekday_text: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now, periods = periods, weekday_text = weekday_text)
  
    __obj.asInstanceOf[OpeningHours]
  }
}

