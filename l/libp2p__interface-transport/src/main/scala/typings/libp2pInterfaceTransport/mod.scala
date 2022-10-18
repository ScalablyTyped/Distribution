package typings.libp2pInterfaceTransport

import typings.itStreamTypes.mod.Duplex
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTransport(other: Any): /* is @libp2p/interface-transport.@libp2p/interface-transport.Transport */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransport")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-transport.@libp2p/interface-transport.Transport */ Boolean]
  
  @JSImport("@libp2p/interface-transport", "symbol")
  @js.native
  val symbol: js.Symbol = js.native
  
  type ConnectionHandler = js.Function1[/* connection */ Connection, Unit]
  
  trait CreateListenerOptions extends StObject {
    
    var handler: js.UndefOr[ConnectionHandler] = js.undefined
    
    var upgrader: Upgrader
  }
  object CreateListenerOptions {
    
    inline def apply(upgrader: Upgrader): CreateListenerOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateListenerOptions]
    }
    
    extension [Self <: CreateListenerOptions](x: Self) {
      
      inline def setHandler(value: /* connection */ Connection => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialOptions
    extends StObject
       with AbortOptions {
    
    var upgrader: Upgrader
  }
  object DialOptions {
    
    inline def apply(upgrader: Upgrader): DialOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialOptions]
    }
    
    extension [Self <: DialOptions](x: Self) {
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Listener extends EventEmitter[ListenerEvents] {
    
    /**
      * Close listener
      *
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Get listen addresses
      */
    def getAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Start a listener
      */
    def listen(multiaddr: Multiaddr_): js.Promise[Unit] = js.native
  }
  
  trait ListenerEvents extends StObject {
    
    var close: CustomEvent[Any]
    
    var connection: CustomEvent[Connection]
    
    var error: CustomEvent[js.Error]
    
    var listening: CustomEvent[Any]
  }
  object ListenerEvents {
    
    inline def apply(
      close: CustomEvent[Any],
      connection: CustomEvent[Connection],
      error: CustomEvent[js.Error],
      listening: CustomEvent[Any]
    ): ListenerEvents = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerEvents]
    }
    
    extension [Self <: ListenerEvents](x: Self) {
      
      inline def setClose(value: CustomEvent[Any]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: CustomEvent[Connection]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setError(value: CustomEvent[js.Error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setListening(value: CustomEvent[Any]): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiaddrFilter = js.Function1[/* multiaddrs */ js.Array[Multiaddr_], js.Array[Multiaddr_]]
  
  type ProtocolHandler = js.Function2[
    /* stream */ Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]], 
    /* connection */ Connection, 
    Unit
  ]
  
  @js.native
  trait Transport extends StObject {
    
    /**
      * Create transport listeners.
      */
    def createListener(options: CreateListenerOptions): Listener = js.native
    
    /**
      * Dial a given multiaddr.
      */
    def dial(ma: Multiaddr_, options: DialOptions): js.Promise[Connection] = js.native
    
    /**
      * Takes a list of `Multiaddr`s and returns only valid addresses for the transport
      */
    def filter(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_] = js.native
    /**
      * Takes a list of `Multiaddr`s and returns only valid addresses for the transport
      */
    @JSName("filter")
    var filter_Original: MultiaddrFilter = js.native
    
    /**
      * Used to identify the transport
      */
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
  }
  
  @js.native
  trait TransportManager extends EventEmitter[TransportManagerEvents] {
    
    def add(transport: Transport): Unit = js.native
    
    def dial(ma: Multiaddr_): js.Promise[Connection] = js.native
    def dial(ma: Multiaddr_, options: Any): js.Promise[Connection] = js.native
    
    def getAddrs(): js.Array[Multiaddr_] = js.native
    
    def getTransports(): js.Array[Transport] = js.native
    
    def listen(addrs: js.Array[Multiaddr_]): js.Promise[Unit] = js.native
    
    def remove(key: String): js.Promise[Unit] = js.native
    
    def removeAll(): js.Promise[Unit] = js.native
    
    def transportForMultiaddr(ma: Multiaddr_): js.UndefOr[Transport] = js.native
  }
  
  trait TransportManagerEvents extends StObject {
    
    @JSName("listener:close")
    var listenerColonclose: CustomEvent[Listener]
    
    @JSName("listener:listening")
    var listenerColonlistening: CustomEvent[Listener]
  }
  object TransportManagerEvents {
    
    inline def apply(listenerColonclose: CustomEvent[Listener], listenerColonlistening: CustomEvent[Listener]): TransportManagerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("listener:close")(listenerColonclose.asInstanceOf[js.Any])
      __obj.updateDynamic("listener:listening")(listenerColonlistening.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportManagerEvents]
    }
    
    extension [Self <: TransportManagerEvents](x: Self) {
      
      inline def setListenerColonclose(value: CustomEvent[Listener]): Self = StObject.set(x, "listener:close", value.asInstanceOf[js.Any])
      
      inline def setListenerColonlistening(value: CustomEvent[Listener]): Self = StObject.set(x, "listener:listening", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Upgrader extends EventEmitter[UpgraderEvents] {
    
    /**
      * Upgrades an inbound connection on transport listener.
      */
    def upgradeInbound(maConn: MultiaddrConnection): js.Promise[Connection] = js.native
    
    /**
      * Upgrades an outbound connection on `transport.dial`.
      */
    def upgradeOutbound(maConn: MultiaddrConnection): js.Promise[Connection] = js.native
  }
  
  trait UpgraderEvents extends StObject {
    
    var connection: CustomEvent[Connection]
    
    var connectionEnd: CustomEvent[Connection]
  }
  object UpgraderEvents {
    
    inline def apply(connection: CustomEvent[Connection], connectionEnd: CustomEvent[Connection]): UpgraderEvents = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], connectionEnd = connectionEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpgraderEvents]
    }
    
    extension [Self <: UpgraderEvents](x: Self) {
      
      inline def setConnection(value: CustomEvent[Connection]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionEnd(value: CustomEvent[Connection]): Self = StObject.set(x, "connectionEnd", value.asInstanceOf[js.Any])
    }
  }
}
