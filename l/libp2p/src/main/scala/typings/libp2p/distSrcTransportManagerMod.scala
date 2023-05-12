package typings.libp2p

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfaceTransport.mod.FaultTolerance
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTransportManagerMod {
  
  @JSImport("libp2p/dist/src/transport-manager", "DefaultTransportManager")
  @js.native
  open class DefaultTransportManager protected ()
    extends StObject
       with TransportManager
       with Startable {
    def this(components: DefaultTransportManagerComponents) = this()
    def this(components: DefaultTransportManagerComponents, init: TransportManagerInit) = this()
    
    @JSName("afterStart")
    def afterStart_MDefaultTransportManager(): js.Promise[Unit] = js.native
    
    /* private */ val components: Any = js.native
    
    def dial(ma: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    /* private */ val faultTolerance: Any = js.native
    
    /**
      * Returns all the listener instances
      */
    def getListeners(): js.Array[Listener] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val listeners: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val transports: Any = js.native
  }
  
  trait DefaultTransportManagerComponents extends StObject {
    
    var addressManager: AddressManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var upgrader: Upgrader
  }
  object DefaultTransportManagerComponents {
    
    inline def apply(addressManager: AddressManager, events: EventEmitter[Libp2pEvents], upgrader: Upgrader): DefaultTransportManagerComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTransportManagerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultTransportManagerComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportManagerInit extends StObject {
    
    var faultTolerance: js.UndefOr[FaultTolerance] = js.undefined
  }
  object TransportManagerInit {
    
    inline def apply(): TransportManagerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportManagerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportManagerInit] (val x: Self) extends AnyVal {
      
      inline def setFaultTolerance(value: FaultTolerance): Self = StObject.set(x, "faultTolerance", value.asInstanceOf[js.Any])
      
      inline def setFaultToleranceUndefined: Self = StObject.set(x, "faultTolerance", js.undefined)
    }
  }
}
