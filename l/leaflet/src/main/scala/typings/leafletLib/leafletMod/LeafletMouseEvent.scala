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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("containerPoint")(containerPoint)
    __obj.updateDynamic("latlng")(latlng)
    __obj.updateDynamic("layerPoint")(layerPoint)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LeafletMouseEvent]
  }
}

