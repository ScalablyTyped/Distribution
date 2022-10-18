package typings.libp2pMdns

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.multicastDns.mod.QueryPacket
import typings.multicastDns.mod.ResponsePacket
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/mdns", "MulticastDNS")
  @js.native
  open class MulticastDNS ()
    extends PeerDiscovery
       with Initializable {
    def this(options: MulticastDNSOptions) = this()
    
    /* private */ val _goMdns: Any = js.native
    
    def _onMdnsQuery(event: QueryPacket): Unit = js.native
    
    def _onMdnsResponse(event: ResponsePacket): Unit = js.native
    
    def _onPeer(evt: CustomEvent[PeerInfo]): Unit = js.native
    
    /* private */ var _queryInterval: Any = js.native
    
    /* private */ val broadcast: Any = js.native
    
    /* private */ var components: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val interval: Any = js.native
    
    def isStarted(): Boolean = js.native
    
    var mdns: js.UndefOr[typings.multicastDns.mod.MulticastDNS] = js.native
    
    /* private */ val port: Any = js.native
    
    /* private */ val serviceTag: Any = js.native
    
    /**
      * Start sending queries to the LAN.
      *
      * @returns {void}
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stop sending queries to the LAN.
      *
      * @returns {Promise}
      */
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_MulticastDNS: js.Function0[String] = js.native
  }
  
  trait MulticastDNSOptions extends StObject {
    
    var broadcast: js.UndefOr[Boolean] = js.undefined
    
    var compat: js.UndefOr[Boolean] = js.undefined
    
    var compatQueryInterval: js.UndefOr[Double] = js.undefined
    
    var compatQueryPeriod: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var serviceTag: js.UndefOr[String] = js.undefined
  }
  object MulticastDNSOptions {
    
    inline def apply(): MulticastDNSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MulticastDNSOptions]
    }
    
    extension [Self <: MulticastDNSOptions](x: Self) {
      
      inline def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setCompat(value: Boolean): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
      
      inline def setCompatQueryInterval(value: Double): Self = StObject.set(x, "compatQueryInterval", value.asInstanceOf[js.Any])
      
      inline def setCompatQueryIntervalUndefined: Self = StObject.set(x, "compatQueryInterval", js.undefined)
      
      inline def setCompatQueryPeriod(value: Double): Self = StObject.set(x, "compatQueryPeriod", value.asInstanceOf[js.Any])
      
      inline def setCompatQueryPeriodUndefined: Self = StObject.set(x, "compatQueryPeriod", js.undefined)
      
      inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServiceTag(value: String): Self = StObject.set(x, "serviceTag", value.asInstanceOf[js.Any])
      
      inline def setServiceTagUndefined: Self = StObject.set(x, "serviceTag", js.undefined)
    }
  }
}
