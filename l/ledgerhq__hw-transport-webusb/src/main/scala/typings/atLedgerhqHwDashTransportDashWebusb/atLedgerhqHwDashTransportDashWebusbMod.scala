package typings.atLedgerhqHwDashTransportDashWebusb

import typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.DescriptorEvent
import typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.Observer
import typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-webusb", JSImport.Namespace)
@js.native
object atLedgerhqHwDashTransportDashWebusbMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String] {
    def this(device: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def listen(observer: Observer[DescriptorEvent[String]]): Subscription = js.native
    def open(device: String): js.Promise[TransportWebUSB] = js.native
    def openConnection(): js.Promise[TransportWebUSB] = js.native
    def request(): js.Promise[TransportWebUSB] = js.native
  }
  
  type TransportWebUSB = typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
}

