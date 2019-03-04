package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends LeafletEvent {
  var code: scala.Double
  var message: java.lang.String
}

object ErrorEvent {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, target: js.Any, `type`: java.lang.String): ErrorEvent = {
    val __obj = js.Dynamic.literal(code = code, message = message, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorEvent]
  }
}

