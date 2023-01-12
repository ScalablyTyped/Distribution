package typings.libp2pMdns

import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.multicastDns.mod.ResponsePacket
import typings.node.dgramMod.RemoteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatQuerierMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat/querier", "Querier")
  @js.native
  open class Querier protected ()
    extends PeerDiscovery
       with Startable {
    def this(components: QuerierComponents) = this()
    def this(components: QuerierComponents, init: QuerierInit) = this()
    
    /* private */ var _handle: Any = js.native
    
    /* private */ val _init: Any = js.native
    
    def _onResponse(event: ResponsePacket, info: RemoteInfo): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait QuerierComponents extends StObject {
    
    var peerId: PeerId
  }
  object QuerierComponents {
    
    inline def apply(peerId: PeerId): QuerierComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerierComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuerierComponents] (val x: Self) extends AnyVal {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuerierInit] (val x: Self) extends AnyVal {
      
      inline def setQueryInterval(value: Double): Self = StObject.set(x, "queryInterval", value.asInstanceOf[js.Any])
      
      inline def setQueryIntervalUndefined: Self = StObject.set(x, "queryInterval", js.undefined)
      
      inline def setQueryPeriod(value: Double): Self = StObject.set(x, "queryPeriod", value.asInstanceOf[js.Any])
      
      inline def setQueryPeriodUndefined: Self = StObject.set(x, "queryPeriod", js.undefined)
    }
  }
}
