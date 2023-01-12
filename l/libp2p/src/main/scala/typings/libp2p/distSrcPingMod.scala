package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPingMod {
  
  @JSImport("libp2p/dist/src/ping", "PingService")
  @js.native
  open class PingService protected ()
    extends StObject
       with Startable {
    def this(components: PingServiceComponents, init: PingServiceInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * A handler to register with Libp2p to process ping messages
      */
    def handleMessage(data: IncomingStreamData): Unit = js.native
    
    /* private */ val init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * Ping a given peer and wait for its response, getting the operation latency.
      *
      * @param {PeerId|Multiaddr} peer
      * @returns {Promise<number>}
      */
    def ping(peer: PeerId): js.Promise[Double] = js.native
    def ping(peer: PeerId, options: AbortOptions): js.Promise[Double] = js.native
    
    val protocol: String = js.native
    
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
  }
  
  trait PingServiceComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var registrar: Registrar
  }
  object PingServiceComponents {
    
    inline def apply(connectionManager: ConnectionManager, registrar: Registrar): PingServiceComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingServiceComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingServiceComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait PingServiceInit extends StObject {
    
    var maxInboundStreams: Double
    
    var maxOutboundStreams: Double
    
    var protocolPrefix: String
    
    /**
      * How long we should wait for a ping response
      */
    var timeout: Double
  }
  object PingServiceInit {
    
    inline def apply(maxInboundStreams: Double, maxOutboundStreams: Double, protocolPrefix: String, timeout: Double): PingServiceInit = {
      val __obj = js.Dynamic.literal(maxInboundStreams = maxInboundStreams.asInstanceOf[js.Any], maxOutboundStreams = maxOutboundStreams.asInstanceOf[js.Any], protocolPrefix = protocolPrefix.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingServiceInit] (val x: Self) extends AnyVal {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
