package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationEvent extends LeafletEvent {
  var accuracy: Double
  var altitude: Double
  var altitudeAccuracy: Double
  var bounds: LatLngBounds
  var heading: Double
  var latlng: LatLng
  var speed: Double
  var timestamp: Double
}

object LocationEvent {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    bounds: LatLngBounds,
    heading: Double,
    latlng: LatLng,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    speed: Double,
    target: js.Any,
    timestamp: Double,
    `type`: String
  ): LocationEvent = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, altitudeAccuracy = altitudeAccuracy, bounds = bounds, heading = heading, latlng = latlng, layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, speed = speed, target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationEvent]
  }
}

