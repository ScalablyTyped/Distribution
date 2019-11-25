package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends LeafletEvent {
  var code: Double
  var message: String
}

object ErrorEvent {
  @scala.inline
  def apply(
    code: Double,
    layer: js.Any,
    message: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}

