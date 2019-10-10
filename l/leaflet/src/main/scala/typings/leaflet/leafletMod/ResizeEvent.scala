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
    val __obj = js.Dynamic.literal(layer = layer, newSize = newSize, oldSize = oldSize, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeEvent]
  }
}

