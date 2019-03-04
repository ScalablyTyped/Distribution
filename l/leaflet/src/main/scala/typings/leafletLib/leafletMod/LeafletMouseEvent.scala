package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletMouseEvent extends LeafletEvent {
  var containerPoint: Point
  var latlng: LatLng
  var layerPoint: Point
  var originalEvent: stdLib.MouseEvent
}

object LeafletMouseEvent {
  @scala.inline
  def apply(
    containerPoint: Point,
    latlng: LatLng,
    layerPoint: Point,
    originalEvent: stdLib.MouseEvent,
    target: js.Any,
    `type`: java.lang.String
  ): LeafletMouseEvent = {
    val __obj = js.Dynamic.literal(containerPoint = containerPoint, latlng = latlng, layerPoint = layerPoint, originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletMouseEvent]
  }
}

