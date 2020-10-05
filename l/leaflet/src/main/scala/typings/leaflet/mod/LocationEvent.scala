package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationEvent extends LeafletEvent {
  var accuracy: Double = js.native
  var altitude: Double = js.native
  var altitudeAccuracy: Double = js.native
  var bounds: LatLngBounds_ = js.native
  var heading: Double = js.native
  var latlng: LatLng_ = js.native
  var speed: Double = js.native
  var timestamp: Double = js.native
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
  @scala.inline
  implicit class LocationEventOps[Self <: LocationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounds(value: LatLngBounds_): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatlng(value: LatLng_): Self = this.set("latlng", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

