package typings
package atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptorEvent[Descriptor] extends js.Object {
  var descriptor: Descriptor
  var device: js.UndefOr[Device] = js.undefined
  var `type`: atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportLibStrings.add | atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportLibStrings.remove
}

object DescriptorEvent {
  @scala.inline
  def apply[Descriptor](
    descriptor: Descriptor,
    `type`: atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportLibStrings.add | atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportLibStrings.remove,
    device: Device = null
  ): DescriptorEvent[Descriptor] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device)
    __obj.asInstanceOf[DescriptorEvent[Descriptor]]
  }
}

