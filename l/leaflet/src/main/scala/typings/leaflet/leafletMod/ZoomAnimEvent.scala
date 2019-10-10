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
    val __obj = js.Dynamic.literal(center = center, layer = layer, noUpdate = noUpdate, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target, zoom = zoom)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ZoomAnimEvent]
  }
}

