package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditStart extends LeafletEvent {
  /**
    * The type of edit this is. One of: edit
    */
  var handler: String
}

object EditStart {
  @scala.inline
  def apply(
    handler: String,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): EditStart = {
    val __obj = js.Dynamic.literal(handler = handler, layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EditStart]
  }
}

