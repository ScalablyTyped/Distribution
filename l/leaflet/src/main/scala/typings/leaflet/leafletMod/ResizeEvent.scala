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
  def apply(newSize: Point, oldSize: Point, target: js.Any, `type`: String): ResizeEvent = {
    val __obj = js.Dynamic.literal(newSize = newSize, oldSize = oldSize, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeEvent]
  }
}

