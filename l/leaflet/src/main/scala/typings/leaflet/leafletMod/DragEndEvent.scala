package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEndEvent extends LeafletEvent {
  var distance: Double
}

object DragEndEvent {
  @scala.inline
  def apply(distance: Double, target: js.Any, `type`: String): DragEndEvent = {
    val __obj = js.Dynamic.literal(distance = distance, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragEndEvent]
  }
}

