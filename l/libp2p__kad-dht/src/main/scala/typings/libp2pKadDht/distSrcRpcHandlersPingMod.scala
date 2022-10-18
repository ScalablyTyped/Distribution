package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersPingMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/ping", "PingHandler")
  @js.native
  open class PingHandler ()
    extends StObject
       with DHTMessageHandler {
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    def init(): Unit = js.native
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
  }
}
