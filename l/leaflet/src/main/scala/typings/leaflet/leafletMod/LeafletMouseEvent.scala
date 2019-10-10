package typings.leaflet.leafletMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletMouseEvent extends LeafletEvent {
  var containerPoint: Point
  var latlng: LatLng
  var layerPoint: Point
  var originalEvent: MouseEvent
}

object LeafletMouseEvent {
  @scala.inline
  def apply(
    containerPoint: Point,
    latlng: LatLng,
    layer: js.Any,
    layerPoint: Point,
    originalEvent: MouseEvent,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LeafletMouseEvent = {
    val __obj = js.Dynamic.literal(containerPoint = containerPoint, latlng = latlng, layer = layer, layerPoint = layerPoint, originalEvent = originalEvent, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletMouseEvent]
  }
}

