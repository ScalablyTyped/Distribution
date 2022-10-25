package typings.libp2pKadDht

import typings.libp2pInterfaceDht.mod.AddingPeerEvent
import typings.libp2pInterfaceDht.mod.DialingPeerEvent
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfaceDht.mod.PeerResponseEvent
import typings.libp2pInterfaceDht.mod.ProviderEvent
import typings.libp2pInterfaceDht.mod.QueryErrorEvent
import typings.libp2pInterfaceDht.mod.QueryEvent
import typings.libp2pInterfaceDht.mod.QueryOptions
import typings.libp2pInterfaceDht.mod.SendingQueryEvent
import typings.libp2pInterfaceDht.mod.ValueEvent
import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pKadDht.distSrcKadDhtMod.KadDHT
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDualKadDhtMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/dual-kad-dht", "DualKadDHT")
  @js.native
  open class DualKadDHT protected () extends DualDHT {
    def this(components: KadDHTComponents, wan: KadDHT, lan: KadDHT) = this()
    
    val components: KadDHTComponents = js.native
    
    /**
      * Search the dht for up to `K` providers of the given CID
      */
    def findProviders(key: CID[Any, Double, Double, Version]): AsyncGenerator[QueryEvent, Unit, Unit] = js.native
    def findProviders(key: CID[Any, Double, Double, Version], options: QueryOptions): AsyncGenerator[QueryEvent, Unit, Unit] = js.native
    
    var get: Any = js.native
    
    /**
      * Is this DHT running.
      */
    def isStarted(): Boolean = js.native
    
    @JSName("lan")
    val lan_DualKadDHT: KadDHT = js.native
    
    /**
      * Announce to the network that we can provide given key's value
      */
    def provide(key: CID[Any, Double, Double, Version]): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ProviderEvent | ValueEvent | AddingPeerEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def provide(key: CID[Any, Double, Double, Version], options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ProviderEvent | ValueEvent | AddingPeerEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
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
    var toStringTag_DualKadDHT: js.Function0[String] = js.native
    
    @JSName("wan")
    val wan_DualKadDHT: KadDHT = js.native
  }
}
