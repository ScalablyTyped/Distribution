package typings
package atLedgerhqHwDashTransportLib.hwDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport", JSImport.Default)
@js.native
class default[TDescriptor /* <: Descriptor */] () extends Transport[TDescriptor]

@JSImport("@ledgerhq/hw-transport", JSImport.Default)
@js.native
object default extends js.Object {
  def create(): stdLib.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double): stdLib.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double, listenTimeout: scala.Double): stdLib.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def isSupported(): stdLib.Promise[scala.Boolean] = js.native
  def list(): stdLib.Promise[js.Array[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]] = js.native
  def listen(
    observer: atLedgerhqHwDashTransportLib.hwDashTransportMod.Observer[
      atLedgerhqHwDashTransportLib.hwDashTransportMod.DescriptorEvent[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
    ]
  ): atLedgerhqHwDashTransportLib.hwDashTransportMod.Subscription = js.native
  def open(descriptor: atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor): stdLib.Promise[atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[_]] = js.native
  def open(descriptor: atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor, timeout: scala.Double): stdLib.Promise[atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[_]] = js.native
}

