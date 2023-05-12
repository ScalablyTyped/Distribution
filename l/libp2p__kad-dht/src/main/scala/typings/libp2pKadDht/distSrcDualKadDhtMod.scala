package typings.libp2pKadDht

import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscoveryEvents
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pKadDht.distSrcKadDhtMod.DefaultKadDHT
import typings.libp2pKadDht.libp2pKadDhtStrings.`@libp2pSlashdual-kad-dht`
import typings.libp2pKadDht.mod.DualKadDHT
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.libp2pKadDht.mod.KadDHTInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDualKadDhtMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/dual-kad-dht", "DefaultDualKadDHT")
  @js.native
  open class DefaultDualKadDHT protected ()
    extends EventEmitter[PeerDiscoveryEvents]
       with DualKadDHT {
    def this(components: KadDHTComponents) = this()
    def this(components: KadDHTComponents, init: KadDHTInit) = this()
    
    val components: KadDHTComponents = js.native
    
    /* private */ val contentRouting: Any = js.native
    
    var get: Any = js.native
    
    /**
      * Is this DHT running.
      */
    def isStarted(): Boolean = js.native
    
    @JSName("lan")
    val lan_DefaultDualKadDHT: DefaultKadDHT = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /**
      * Start listening to incoming connections.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stop accepting incoming connections and sending outgoing
      * messages.
      */
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: `@libp2pSlashdual-kad-dht` = js.native
    
    @JSName("wan")
    val wan_DefaultDualKadDHT: DefaultKadDHT = js.native
  }
}
