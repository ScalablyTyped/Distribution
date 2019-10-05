package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.cast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastParam extends js.Object {
  var active: Boolean
  var available: Boolean
  var deviceName: String
  var `type`: cast
}

object CastParam {
  @scala.inline
  def apply(active: Boolean, available: Boolean, deviceName: String, `type`: cast): CastParam = {
    val __obj = js.Dynamic.literal(active = active, available = available, deviceName = deviceName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CastParam]
  }
}

