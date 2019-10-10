package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawStop extends LeafletEvent {
  /**
    * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
    */
  var layerType: String
}

object DrawStop {
  @scala.inline
  def apply(
    layer: js.Any,
    layerType: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DrawStop = {
    val __obj = js.Dynamic.literal(layer = layer, layerType = layerType, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawStop]
  }
}

