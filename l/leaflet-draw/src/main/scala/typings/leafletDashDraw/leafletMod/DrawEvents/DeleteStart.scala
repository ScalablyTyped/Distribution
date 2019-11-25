package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStart extends LeafletEvent {
  /**
    * The type of edit this is. One of: remove
    */
  var handler: String
}

object DeleteStart {
  @scala.inline
  def apply(
    handler: String,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DeleteStart = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStart]
  }
}

