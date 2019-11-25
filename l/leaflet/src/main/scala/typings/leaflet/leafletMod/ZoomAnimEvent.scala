package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomAnimEvent extends LeafletEvent {
  var center: LatLng
  var noUpdate: Boolean
  var zoom: Double
}

object ZoomAnimEvent {
  @scala.inline
  def apply(
    center: LatLng,
    layer: js.Any,
    noUpdate: Boolean,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String,
    zoom: Double
  ): ZoomAnimEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], noUpdate = noUpdate.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomAnimEvent]
  }
}

