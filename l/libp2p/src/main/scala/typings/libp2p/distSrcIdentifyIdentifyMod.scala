package typings.libp2p

import typings.libp2p.anon.AgentVersion
import typings.libp2p.distSrcIdentifyMod.IdentifyServiceComponents
import typings.libp2p.distSrcIdentifyMod.IdentifyServiceInit
import typings.libp2p.distSrcIdentifyPbMessageMod.Identify
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIdentifyIdentifyMod {
  
  @JSImport("libp2p/dist/src/identify/identify", "DefaultIdentifyService")
  @js.native
  open class DefaultIdentifyService protected ()
    extends StObject
       with Startable {
    def this(components: IdentifyServiceComponents, init: IdentifyServiceInit) = this()
    
    /**
      * Sends the `Identify` response with the Signed Peer Record
      * to the requesting peer over the given `connection`
      */
    def _handleIdentify(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    /**
      * Reads the Identify Push message from the given `connection`
      */
    def _handlePush(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    def _identify(connection: Connection): js.Promise[Identify] = js.native
    def _identify(connection: Connection, options: AbortOptions): js.Promise[Identify] = js.native
    
    /* private */ val addressManager: Any = js.native
    
    /* private */ val connectionManager: Any = js.native
    
    /* private */ val events: Any = js.native
    
    val host: AgentVersion = js.native
    
    def identify(connection: Connection): js.Promise[Unit] = js.native
    def identify(connection: Connection, options: AbortOptions): js.Promise[Unit] = js.native
    
    /* private */ val identifyProtocolStr: Any = js.native
    
    /* private */ val identifyPushProtocolStr: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val maxIdentifyMessageSize: Any = js.native
    
    /* private */ val maxInboundStreams: Any = js.native
    
    /* private */ val maxObservedAddresses: Any = js.native
    
    /* private */ val maxOutboundStreams: Any = js.native
    
    /* private */ val maxPushIncomingStreams: Any = js.native
    
    /* private */ val maxPushOutgoingStreams: Any = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Calls `push` on all peer connections
      */
    def push(): js.Promise[Unit] = js.native
    
    /**
      * Send an Identify Push update to the list of connections
      */
    def pushToConnections(connections: js.Array[Connection]): js.Promise[Unit] = js.native
    
    /* private */ val registrar: Any = js.native
    
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
    
    /* private */ val timeout: Any = js.native
  }
}
