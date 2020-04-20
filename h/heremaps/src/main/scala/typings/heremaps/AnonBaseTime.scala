package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseTime extends js.Object {
  var baseTime: Double
  var distance: Double
  var flags: js.Array[String]
  var text: String
  var trafficTime: Double
  var travelTime: Double
}

object AnonBaseTime {
  @scala.inline
  def apply(
    baseTime: Double,
    distance: Double,
    flags: js.Array[String],
    text: String,
    trafficTime: Double,
    travelTime: Double
  ): AnonBaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trafficTime = trafficTime.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseTime]
  }
}

