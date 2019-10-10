package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupEvent extends LeafletEvent {
  var popup: Popup
}

object PopupEvent {
  @scala.inline
  def apply(
    layer: js.Any,
    popup: Popup,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): PopupEvent = {
    val __obj = js.Dynamic.literal(layer = layer, popup = popup, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PopupEvent]
  }
}

