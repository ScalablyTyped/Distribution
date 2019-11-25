package typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod

import typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportStrings.add
import typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptorEvent[Descriptor] extends js.Object {
  var descriptor: Descriptor
  var device: js.UndefOr[Device] = js.undefined
  var `type`: add | remove
}

object DescriptorEvent {
  @scala.inline
  def apply[Descriptor](descriptor: Descriptor, `type`: add | remove, device: Device = null): DescriptorEvent[Descriptor] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorEvent[Descriptor]]
  }
}

