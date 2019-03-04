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
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, altitudeAccuracy = altitudeAccuracy, bounds = bounds, heading = heading, latlng = latlng, speed = speed, target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationEvent]
  }
}

