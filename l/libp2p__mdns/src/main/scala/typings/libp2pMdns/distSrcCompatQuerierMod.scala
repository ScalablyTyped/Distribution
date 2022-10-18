package typings.libp2pMdns

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.multicastDns.mod.ResponsePacket
import typings.node.dgramMod.RemoteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatQuerierMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat/querier", "Querier")
  @js.native
  open class Querier ()
    extends PeerDiscovery
       with Initializable {
    def this(init: QuerierInit) = this()
    
    /* private */ var _handle: Any = js.native
    
    /* private */ val _init: Any = js.native
    
    def _onResponse(event: ResponsePacket, info: RemoteInfo): Unit = js.native
    
    /* private */ var components: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def start(): Unit = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Querier: js.Function0[String] = js.native
  }
  
  trait Handle extends StObject {
    
    def stop(): js.Promise[Unit]
  }
  object Handle {
    
    inline def apply(stop: () => js.Promise[Unit]): Handle = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Handle]
    }
    
    extension [Self <: Handle](x: Self) {
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait QuerierInit extends StObject {
    
    var queryInterval: js.UndefOr[Double] = js.undefined
    
    var queryPeriod: js.UndefOr[Double] = js.undefined
  }
  object QuerierInit {
    
    inline def apply(): QuerierInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuerierInit]
    }
    
    extension [Self <: QuerierInit](x: Self) {
      
      inline def setQueryInterval(value: Double): Self = StObject.set(x, "queryInterval", value.asInstanceOf[js.Any])
      
      inline def setQueryIntervalUndefined: Self = StObject.set(x, "queryInterval", js.undefined)
      
      inline def setQueryPeriod(value: Double): Self = StObject.set(x, "queryPeriod", value.asInstanceOf[js.Any])
      
      inline def setQueryPeriodUndefined: Self = StObject.set(x, "queryPeriod", js.undefined)
    }
  }
}
