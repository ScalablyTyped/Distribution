package typings.ledgerhqHwTransportWebusb

import typings.ledgerhqHwTransport.mod.DescriptorEvent
import typings.ledgerhqHwTransport.mod.Observer
import typings.ledgerhqHwTransport.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-webusb", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ledgerhqHwTransport.mod.default[String] {
    def this(device: String) = this()
  }
  object default {
    
    @JSImport("@ledgerhq/hw-transport-webusb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def listen(observer: Observer[DescriptorEvent[String]]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(observer.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    
    /* static member */
    inline def open(device: String): js.Promise[TransportWebUSB] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(device.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransportWebUSB]]
    
    /* static member */
    inline def openConnection(): js.Promise[TransportWebUSB] = ^.asInstanceOf[js.Dynamic].applyDynamic("openConnection")().asInstanceOf[js.Promise[TransportWebUSB]]
    
    /* static member */
    inline def request(): js.Promise[TransportWebUSB] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Promise[TransportWebUSB]]
  }
  
  type TransportWebUSB = typings.ledgerhqHwTransport.mod.default[String]
}
