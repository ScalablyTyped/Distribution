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
  def apply(code: Double, message: String, target: js.Any, `type`: String): ErrorEvent = {
    val __obj = js.Dynamic.literal(code = code, message = message, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorEvent]
  }
}

