package typings
package atLedgerhqHwDashTransportDashNodeDashHidLib.atLedgerhqHwDashTransportDashNodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
@js.native
class default protected () extends TransportNodeHid {
  def this(device: nodeDashHidLib.nodeDashHidMod.HID) = this()
  def this(device: nodeDashHidLib.nodeDashHidMod.HID, ledgerTransport: scala.Boolean) = this()
  def this(device: nodeDashHidLib.nodeDashHidMod.HID, ledgerTransport: scala.Boolean, timeout: scala.Double) = this()
}

@JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
@js.native
object default extends js.Object {
  def open(path: java.lang.String): js.Promise[
    atLedgerhqHwDashTransportDashNodeDashHidLib.atLedgerhqHwDashTransportDashNodeDashHidMod.TransportNodeHid
  ] = js.native
}

