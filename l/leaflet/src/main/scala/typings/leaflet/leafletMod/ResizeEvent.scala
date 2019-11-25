package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEvent extends LeafletEvent {
  var newSize: Point
  var oldSize: Point
}

object ResizeEvent {
  @scala.inline
  def apply(
    layer: js.Any,
    newSize: Point,
    oldSize: Point,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): ResizeEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], oldSize = oldSize.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
}

