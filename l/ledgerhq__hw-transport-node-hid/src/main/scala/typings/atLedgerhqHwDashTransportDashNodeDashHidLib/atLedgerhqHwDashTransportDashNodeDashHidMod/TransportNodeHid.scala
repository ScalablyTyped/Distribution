package typings
package atLedgerhqHwDashTransportDashNodeDashHidLib.atLedgerhqHwDashTransportDashNodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportNodeHid
  extends atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.default[java.lang.String] {
  var device: nodeDashHidLib.nodeDashHidMod.HID = js.native
  var exchangeStack: js.Array[_] = js.native
  var ledgerTransport: scala.Boolean = js.native
  var timeout: scala.Double = js.native
  def setScrambleKey(): scala.Unit = js.native
}

