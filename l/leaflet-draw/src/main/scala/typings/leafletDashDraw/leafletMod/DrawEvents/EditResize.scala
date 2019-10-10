package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditResize extends LeafletEvent {
  /**
    * Layer that was just resized.
    */
  @JSName("layer")
  var layer_EditResize: Layer
}

object EditResize {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditResize = {
    val __obj = js.Dynamic.literal(layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EditResize]
  }
}

