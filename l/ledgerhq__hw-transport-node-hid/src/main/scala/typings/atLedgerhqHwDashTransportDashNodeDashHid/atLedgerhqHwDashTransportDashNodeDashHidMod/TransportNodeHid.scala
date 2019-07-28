package typings.atLedgerhqHwDashTransportDashNodeDashHid.atLedgerhqHwDashTransportDashNodeDashHidMod

import typings.nodeDashHid.nodeDashHidMod.HID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportNodeHid
  extends typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String] {
  var device: HID = js.native
  var exchangeStack: js.Array[_] = js.native
  var ledgerTransport: Boolean = js.native
  var timeout: Double = js.native
  def setScrambleKey(): Unit = js.native
}

