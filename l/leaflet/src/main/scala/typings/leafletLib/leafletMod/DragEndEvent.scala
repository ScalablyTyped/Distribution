package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEndEvent extends LeafletEvent {
  var distance: scala.Double
}

object DragEndEvent {
  @scala.inline
  def apply(distance: scala.Double, target: js.Any, `type`: java.lang.String): DragEndEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DragEndEvent]
  }
}

