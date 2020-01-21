package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayOption extends js.Object {
  var pin: Double | String
  var `type`: js.UndefOr[String] = js.undefined
}

object RelayOption {
  @scala.inline
  def apply(pin: Double | String, `type`: String = null): RelayOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayOption]
  }
}

