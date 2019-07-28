package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEvent extends js.Object {
  var target: js.Any
  var `type`: String
}

object LeafletEvent {
  @scala.inline
  def apply(target: js.Any, `type`: String): LeafletEvent = {
    val __obj = js.Dynamic.literal(target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletEvent]
  }
}

