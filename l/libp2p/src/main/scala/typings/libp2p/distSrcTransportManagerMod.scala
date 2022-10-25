package typings.libp2p

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTransportManagerMod {
  
  @JSImport("libp2p/dist/src/transport-manager", "DefaultTransportManager")
  @js.native
  open class DefaultTransportManager protected ()
    extends TransportManager
       with Startable {
    def this(components: DefaultTransportManagerComponents) = this()
    def this(components: DefaultTransportManagerComponents, init: TransportManagerInit) = this()
    
    /* private */ val components: Any = js.native
    
    def dial(ma: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    /* private */ val faultTolerance: Any = js.native
    
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
  
  @js.native
  sealed trait FaultTolerance extends StObject
  @JSImport("libp2p/dist/src/transport-manager", "FaultTolerance")
  @js.native
  object FaultTolerance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FaultTolerance & Double] = js.native
    
    /**
      * should be used for failing in any listen circumstance
      */
    @js.native
    sealed trait FATAL_ALL
      extends StObject
         with FaultTolerance
    /* 0 */ val FATAL_ALL: typings.libp2p.distSrcTransportManagerMod.FaultTolerance.FATAL_ALL & Double = js.native
    
    /**
      * should be used for not failing when not listening
      */
    @js.native
    sealed trait NO_FATAL
      extends StObject
         with FaultTolerance
    /* 1 */ val NO_FATAL: typings.libp2p.distSrcTransportManagerMod.FaultTolerance.NO_FATAL & Double = js.native
  }
  
  trait DefaultTransportManagerComponents extends StObject {
    
    var addressManager: AddressManager
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var upgrader: Upgrader
  }
  object DefaultTransportManagerComponents {
    
    inline def apply(addressManager: AddressManager, upgrader: Upgrader): DefaultTransportManagerComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTransportManagerComponents]
    }
    
    extension [Self <: DefaultTransportManagerComponents](x: Self) {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: TransportManagerInit](x: Self) {
      
      inline def setFaultTolerance(value: FaultTolerance): Self = StObject.set(x, "faultTolerance", value.asInstanceOf[js.Any])
      
      inline def setFaultToleranceUndefined: Self = StObject.set(x, "faultTolerance", js.undefined)
    }
  }
}
