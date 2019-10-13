package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCommon extends ObjectCommon {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.undefined
}

object DeviceCommon {
  @scala.inline
  def apply(
    name: String,
    custom: js.UndefOr[scala.Nothing] = js.undefined,
    icon: String = null,
    role: String = null
  ): DeviceCommon = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[DeviceCommon]
  }
}

