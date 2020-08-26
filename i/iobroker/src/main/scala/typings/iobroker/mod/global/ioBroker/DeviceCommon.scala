package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCommon extends ObjectCommon {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.native
}

object DeviceCommon {
  @scala.inline
  def apply(name: String): DeviceCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommon]
  }
}

