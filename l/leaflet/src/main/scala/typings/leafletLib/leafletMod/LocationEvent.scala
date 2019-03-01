package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationEvent extends LeafletEvent {
  var accuracy: scala.Double
  var altitude: scala.Double
  var altitudeAccuracy: scala.Double
  var bounds: LatLngBounds
  var heading: scala.Double
  var latlng: LatLng
  var speed: scala.Double
  var timestamp: scala.Double
}

object LocationEvent {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    altitude: scala.Double,
    altitudeAccuracy: scala.Double,
    bounds: LatLngBounds,
    heading: scala.Double,
    latlng: LatLng,
    speed: scala.Double,
    target: js.Any,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): LocationEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("latlng")(latlng)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LocationEvent]
  }
}

