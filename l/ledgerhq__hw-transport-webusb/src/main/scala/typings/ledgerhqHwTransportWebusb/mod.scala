package typings.ledgerhqHwTransportWebusb

import typings.ledgerhqHwTransport.mod.DescriptorEvent
import typings.ledgerhqHwTransport.mod.Observer
import typings.ledgerhqHwTransport.mod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ledgerhq/hw-transport-webusb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.ledgerhqHwTransport.mod.default[String] {
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
  
  type TransportWebUSB = typings.ledgerhqHwTransport.mod.default[String]
}
