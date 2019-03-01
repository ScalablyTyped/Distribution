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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ErrorEvent]
  }
}

