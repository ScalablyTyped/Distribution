package typings.ledgerhqHwTransportWebusb

import typings.ledgerhqHwTransport.mod.DescriptorEvent
import typings.ledgerhqHwTransport.mod.Observer
import typings.ledgerhqHwTransport.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-webusb", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.ledgerhqHwTransport.mod.default[String] {
    def this(device: String) = this()
  }
  object default {
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.listen")
    @js.native
    def listen(observer: Observer[DescriptorEvent[String]]): Subscription = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.open")
    @js.native
    def open(device: String): js.Promise[TransportWebUSB] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.openConnection")
    @js.native
    def openConnection(): js.Promise[TransportWebUSB] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.request")
    @js.native
    def request(): js.Promise[TransportWebUSB] = js.native
  }
  
  type TransportWebUSB = typings.ledgerhqHwTransport.mod.default[String]
}
