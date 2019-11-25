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
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastParam]
  }
}

