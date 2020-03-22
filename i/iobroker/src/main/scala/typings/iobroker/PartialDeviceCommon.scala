package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker._Global_.ioBroker.DeviceCommon> */
trait PartialDeviceCommon extends js.Object {
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PartialDeviceCommon {
  @scala.inline
  def apply(
    custom: js.UndefOr[scala.Nothing] = js.undefined,
    icon: String = null,
    name: String = null,
    role: String = null
  ): PartialDeviceCommon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDeviceCommon]
  }
}

