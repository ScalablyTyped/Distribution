package typings.atLedgerhqHwDashTransportDashNodeDashHid.atLedgerhqHwDashTransportDashNodeDashHidMod

import typings.nodeDashHid.nodeDashHidMod.HID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
@js.native
class default protected () extends TransportNodeHid {
  def this(device: HID) = this()
  def this(device: HID, ledgerTransport: Boolean) = this()
  def this(device: HID, ledgerTransport: Boolean, timeout: Double) = this()
}

/* static members */
@JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
@js.native
object default extends js.Object {
  def open(path: String): js.Promise[TransportNodeHid] = js.native
}

