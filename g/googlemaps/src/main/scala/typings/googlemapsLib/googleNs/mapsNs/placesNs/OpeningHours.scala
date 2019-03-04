package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHours extends js.Object {
  var open_now: scala.Boolean
  var periods: js.Array[OpeningPeriod]
  var weekday_text: js.Array[java.lang.String]
}

object OpeningHours {
  @scala.inline
  def apply(
    open_now: scala.Boolean,
    periods: js.Array[OpeningPeriod],
    weekday_text: js.Array[java.lang.String]
  ): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now, periods = periods, weekday_text = weekday_text)
  
    __obj.asInstanceOf[OpeningHours]
  }
}

