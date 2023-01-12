package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchMod {
  
  @JSImport("libp2p/dist/src/fetch", "FetchService")
  @js.native
  open class FetchService protected ()
    extends StObject
       with Startable {
    def this(components: FetchServiceComponents, init: FetchServiceInit) = this()
    
    /**
      * Given a key, finds the appropriate function for looking up its corresponding value, based on
      * the key's prefix.
      */
    def _getLookupFunction(key: String): js.UndefOr[LookupFunction] = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Sends a request to fetch the value associated with the given key from the given peer
      */
    def fetch(peer: PeerId, key: String): js.Promise[js.typedarray.Uint8Array | Null] = js.native
    def fetch(peer: PeerId, key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array | Null] = js.native
    
    /**
      * Invoked when a fetch request is received.  Reads the request message off the given stream and
      * responds based on looking up the key in the request via the lookup callback that corresponds
      * to the key's prefix.
      */
    def handleMessage(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    /* private */ val init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val lookupFunctions: Any = js.native
    
    val protocol: String = js.native
    
    /**
      * Registers a new lookup callback that can map keys to values, for a given set of keys that
      * share the same prefix
      */
    def registerLookupFunction(prefix: String, lookup: LookupFunction): Unit = js.native
    
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
    
    /**
      * Registers a new lookup callback that can map keys to values, for a given set of keys that
      * share the same prefix.
      */
    def unregisterLookupFunction(prefix: String): Unit = js.native
    def unregisterLookupFunction(prefix: String, lookup: LookupFunction): Unit = js.native
  }
  
  trait FetchServiceComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var registrar: Registrar
  }
  object FetchServiceComponents {
    
    inline def apply(connectionManager: ConnectionManager, registrar: Registrar): FetchServiceComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchServiceComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchServiceComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchServiceInit extends StObject {
    
    var maxInboundStreams: Double
    
    var maxOutboundStreams: Double
    
    var protocolPrefix: String
    
    /**
      * How long we should wait for a remote peer to send any data
      */
    var timeout: Double
  }
  object FetchServiceInit {
    
    inline def apply(maxInboundStreams: Double, maxOutboundStreams: Double, protocolPrefix: String, timeout: Double): FetchServiceInit = {
      val __obj = js.Dynamic.literal(maxInboundStreams = maxInboundStreams.asInstanceOf[js.Any], maxOutboundStreams = maxOutboundStreams.asInstanceOf[js.Any], protocolPrefix = protocolPrefix.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchServiceInit] (val x: Self) extends AnyVal {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandleMessageOptions extends StObject {
    
    var protocol: String
    
    var stream: Stream
  }
  object HandleMessageOptions {
    
    inline def apply(protocol: String, stream: Stream): HandleMessageOptions = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandleMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type LookupFunction = js.Function1[/* key */ String, js.Promise[js.typedarray.Uint8Array | Null]]
}
