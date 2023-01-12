package typings.libp2pMdns

import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pMdns.mod.MulticastDNSComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat", "GoMulticastDNS")
  @js.native
  open class GoMulticastDNS protected () extends PeerDiscovery {
    def this(components: MulticastDNSComponents) = this()
    def this(components: MulticastDNSComponents, options: GoMulticastDNSInit) = this()
    
    /* private */ val _querier: Any = js.native
    
    /* private */ val _responder: Any = js.native
    
    /* private */ var _started: Any = js.native
    
    var get: Any = js.native
    
    def isStarted(): Boolean = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_GoMulticastDNS: js.Function0[String] = js.native
  }
  
  trait GoMulticastDNSInit extends StObject {
    
    var queryInterval: js.UndefOr[Double] = js.undefined
    
    var queryPeriod: js.UndefOr[Double] = js.undefined
  }
  object GoMulticastDNSInit {
    
    inline def apply(): GoMulticastDNSInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoMulticastDNSInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoMulticastDNSInit] (val x: Self) extends AnyVal {
      
      inline def setQueryInterval(value: Double): Self = StObject.set(x, "queryInterval", value.asInstanceOf[js.Any])
      
      inline def setQueryIntervalUndefined: Self = StObject.set(x, "queryInterval", js.undefined)
      
      inline def setQueryPeriod(value: Double): Self = StObject.set(x, "queryPeriod", value.asInstanceOf[js.Any])
      
      inline def setQueryPeriodUndefined: Self = StObject.set(x, "queryPeriod", js.undefined)
    }
  }
}
