package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastParam extends js.Object {
  var active: scala.Boolean
  var available: scala.Boolean
  var deviceName: java.lang.String
  var `type`: jwplayerLib.jwplayerLibStrings.cast
}

object CastParam {
  @scala.inline
  def apply(
    active: scala.Boolean,
    available: scala.Boolean,
    deviceName: java.lang.String,
    `type`: jwplayerLib.jwplayerLibStrings.cast
  ): CastParam = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.asInstanceOf[CastParam]
  }
}

