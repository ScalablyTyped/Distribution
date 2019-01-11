package typings
package atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod

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
    atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double): js.Promise[
    atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor]
  ] = js.native
  def create(openTimeout: scala.Double, listenTimeout: scala.Double): js.Promise[
    atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Transport[atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor]
  ] = js.native
  def isSupported(): js.Promise[scala.Boolean] = js.native
  def list(): js.Promise[js.Array[atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor]] = js.native
  def listen(
    observer: atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Observer[
      atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.DescriptorEvent[atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor]
    ]
  ): atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Subscription = js.native
  def open(descriptor: atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor): js.Promise[
    atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
  def open(
    descriptor: atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Descriptor,
    timeout: scala.Double
  ): js.Promise[
    atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod.Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
}

