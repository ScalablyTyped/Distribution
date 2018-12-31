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
  def create(): js.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double): js.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double, listenTimeout: scala.Double): js.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
  ] = js.native
  def isSupported(): js.Promise[scala.Boolean] = js.native
  def list(): js.Promise[js.Array[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]] = js.native
  def listen(
    observer: atLedgerhqHwDashTransportLib.hwDashTransportMod.Observer[
      atLedgerhqHwDashTransportLib.hwDashTransportMod.DescriptorEvent[atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor]
    ]
  ): atLedgerhqHwDashTransportLib.hwDashTransportMod.Subscription = js.native
  def open(descriptor: atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor): js.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
  def open(descriptor: atLedgerhqHwDashTransportLib.hwDashTransportMod.Descriptor, timeout: scala.Double): js.Promise[
    atLedgerhqHwDashTransportLib.hwDashTransportMod.Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
}

