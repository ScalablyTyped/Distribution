package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitDetails extends js.Object {
  var arrival_stop: TransitStop
  var arrival_time: Time
  var departure_stop: TransitStop
  var departure_time: Time
  var headsign: java.lang.String
  var headway: scala.Double
  var line: TransitLine
  var num_stops: scala.Double
}

object TransitDetails {
  @scala.inline
  def apply(
    arrival_stop: TransitStop,
    arrival_time: Time,
    departure_stop: TransitStop,
    departure_time: Time,
    headsign: java.lang.String,
    headway: scala.Double,
    line: TransitLine,
    num_stops: scala.Double
  ): TransitDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrival_stop")(arrival_stop)
    __obj.updateDynamic("arrival_time")(arrival_time)
    __obj.updateDynamic("departure_stop")(departure_stop)
    __obj.updateDynamic("departure_time")(departure_time)
    __obj.updateDynamic("headsign")(headsign)
    __obj.updateDynamic("headway")(headway)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("num_stops")(num_stops)
    __obj.asInstanceOf[TransitDetails]
  }
}

