package typings.ledgerhqHwTransportNodeHid

import typings.nodeHid.mod.HID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
  @js.native
  open class default protected () extends TransportNodeHid {
    def this(device: HID) = this()
    def this(device: HID, ledgerTransport: Boolean) = this()
    def this(device: HID, ledgerTransport: Boolean, timeout: Double) = this()
    def this(device: HID, ledgerTransport: Unit, timeout: Double) = this()
  }
  object default {
    
    @JSImport("@ledgerhq/hw-transport-node-hid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def open(path: String): js.Promise[TransportNodeHid] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransportNodeHid]]
  }
  
  @js.native
  trait TransportNodeHid
    extends typings.ledgerhqHwTransport.mod.default[String] {
    
    var device: HID = js.native
    
    var exchangeStack: js.Array[Any] = js.native
    
    var ledgerTransport: Boolean = js.native
    
    def setScrambleKey(): Unit = js.native
    
    var timeout: Double = js.native
  }
}
