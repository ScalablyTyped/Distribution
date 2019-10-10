package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMove extends LeafletEvent {
  /**
    * Layer that was just moved.
    */
  @JSName("layer")
  var layer_EditMove: Layer
}

object EditMove {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditMove = {
    val __obj = js.Dynamic.literal(layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EditMove]
  }
}

