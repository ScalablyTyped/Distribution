package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchMod {
  
  @JSImport("libp2p/dist/src/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchService(): js.Function1[/* components */ FetchServiceComponents, FetchService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchService")().asInstanceOf[js.Function1[/* components */ FetchServiceComponents, FetchService_]]
  inline def fetchService(init: FetchServiceInit): js.Function1[/* components */ FetchServiceComponents, FetchService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ FetchServiceComponents, FetchService_]]
  
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
    
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    var protocolPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * How long we should wait for a remote peer to send any data
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FetchServiceInit {
    
    inline def apply(): FetchServiceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchServiceInit] (val x: Self) extends AnyVal {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait FetchService_ extends StObject {
    
    /**
      * Sends a request to fetch the value associated with the given key from the given peer
      */
    def fetch(peer: PeerId, key: String): js.Promise[js.typedarray.Uint8Array | Null] = js.native
    def fetch(peer: PeerId, key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array | Null] = js.native
    
    /**
      * The protocol name used by this fetch service
      */
    var protocol: String = js.native
    
    /**
      * Registers a new lookup callback that can map keys to values, for a given set of keys that
      * share the same prefix
      *
      * @example
      *
      * ```js
      * // ...
      * libp2p.fetchService.registerLookupFunction('/prefix', (key) => { ... })
      * ```
      */
    def registerLookupFunction(prefix: String, lookup: LookupFunction): Unit = js.native
    
    /**
      * Registers a new lookup callback that can map keys to values, for a given set of keys that
      * share the same prefix.
      *
      * @example
      *
      * ```js
      * // ...
      * libp2p.fetchService.unregisterLookupFunction('/prefix')
      * ```
      */
    def unregisterLookupFunction(prefix: String): Unit = js.native
    def unregisterLookupFunction(prefix: String, lookup: LookupFunction): Unit = js.native
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
