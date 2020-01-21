package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationEvent extends LeafletEvent {
  var accuracy: Double
  var altitude: Double
  var altitudeAccuracy: Double
  var bounds: LatLngBounds_
  var heading: Double
  var latlng: LatLng_
  var speed: Double
  var timestamp: Double
}

object LocationEvent {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    bounds: LatLngBounds_,
    heading: Double,
    latlng: LatLng_,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    speed: Double,
    target: js.Any,
    timestamp: Double,
    `type`: String
  ): LocationEvent = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationEvent]
  }
}

