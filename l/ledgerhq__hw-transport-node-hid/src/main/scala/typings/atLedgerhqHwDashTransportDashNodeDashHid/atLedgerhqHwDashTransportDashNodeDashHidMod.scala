package typings.atLedgerhqHwDashTransportDashNodeDashHid

import typings.atLedgerhqHwDashTransportDashNodeDashHid.atLedgerhqHwDashTransportDashNodeDashHidMod.TransportNodeHid
import typings.nodeDashHid.nodeDashHidMod.HID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Namespace)
@js.native
object atLedgerhqHwDashTransportDashNodeDashHidMod extends js.Object {
  @js.native
  trait TransportNodeHid
    extends typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String] {
    var device: HID = js.native
    var exchangeStack: js.Array[_] = js.native
    var ledgerTransport: Boolean = js.native
    var timeout: Double = js.native
    def setScrambleKey(): Unit = js.native
  }
  
  @js.native
  class default protected () extends TransportNodeHid {
    def this(device: HID) = this()
    def this(device: HID, ledgerTransport: Boolean) = this()
    def this(device: HID, ledgerTransport: Boolean, timeout: Double) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def open(path: String): js.Promise[TransportNodeHid] = js.native
  }
  
}

