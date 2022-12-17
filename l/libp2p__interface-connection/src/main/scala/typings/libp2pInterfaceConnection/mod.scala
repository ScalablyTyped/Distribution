package typings.libp2pInterfaceConnection

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.CLOSED
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.CLOSING
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.OPEN
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isConnection(other: Any): /* is @libp2p/interface-connection.@libp2p/interface-connection.Connection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnection")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-connection.@libp2p/interface-connection.Connection */ Boolean]
  
  @JSImport("@libp2p/interface-connection", "symbol")
  @js.native
  val symbol: js.Symbol = js.native
  
  @js.native
  trait Connection extends StObject {
    
    def addStream(stream: Stream): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var id: String = js.native
    
    def newStream(multicodecs: String): js.Promise[Stream] = js.native
    def newStream(multicodecs: String, options: AbortOptions): js.Promise[Stream] = js.native
    def newStream(multicodecs: js.Array[String]): js.Promise[Stream] = js.native
    def newStream(multicodecs: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    
    var remoteAddr: Multiaddr_ = js.native
    
    var remotePeer: PeerId = js.native
    
    def removeStream(id: String): Unit = js.native
    
    var stat: ConnectionStat = js.native
    
    var streams: js.Array[Stream] = js.native
    
    var tags: js.Array[String] = js.native
  }
  
  trait ConnectionGater extends StObject {
    
    /**
      * denyDialMultiaddr tests whether we're permitted to dial the specified
      * multiaddr for the given peer.
      *
      * This is called by the dialer.connectToPeer implementation after it has
      * resolved the peer's addrs, and prior to dialling each.
      *
      * Return true to prevent dialing the passed peer on the passed multiaddr.
      */
    def denyDialMultiaddr(peerId: PeerId, multiaddr: Multiaddr_): js.Promise[Boolean]
    
    /**
      * denyDialMultiaddr tests whether we're permitted to Dial the
      * specified peer.
      *
      * This is called by the dialer.connectToPeer implementation before
      * dialling a peer.
      *
      * Return true to prevent dialing the passed peer.
      */
    def denyDialPeer(peerId: PeerId): js.Promise[Boolean]
    
    /**
      * denyInboundConnection tests whether an incipient inbound connection is allowed.
      *
      * This is called by the upgrader, or by the transport directly (e.g. QUIC,
      * Bluetooth), straight after it has accepted a connection from its socket.
      *
      * Return true to deny the incoming passed connection.
      */
    def denyInboundConnection(maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * denyInboundEncryptedConnection tests whether a given connection, now encrypted,
      * is allowed.
      *
      * This is called by the upgrader, after it has performed the security
      * handshake, and before it negotiates the muxer, or by the directly by the
      * transport, at the exact same checkpoint.
      *
      * Return true to deny the passed secured connection.
      */
    def denyInboundEncryptedConnection(peerId: PeerId, maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * denyInboundUpgradedConnection tests whether a fully capable connection is allowed.
      *
      * This is called after encryption has been negotiated and the connection has been
      * multiplexed, if a multiplexer is configured.
      *
      * Return true to deny the passed upgraded connection.
      */
    def denyInboundUpgradedConnection(peerId: PeerId, maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * denyOutboundConnection tests whether an incipient outbound connection is allowed.
      *
      * This is called by the upgrader, or by the transport directly (e.g. QUIC,
      * Bluetooth), straight after it has created a connection with its socket.
      *
      * Return true to deny the incoming passed connection.
      */
    def denyOutboundConnection(peerId: PeerId, maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * denyOutboundEncryptedConnection tests whether a given connection, now encrypted,
      * is allowed.
      *
      * This is called by the upgrader, after it has performed the security
      * handshake, and before it negotiates the muxer, or by the directly by the
      * transport, at the exact same checkpoint.
      *
      * Return true to deny the passed secured connection.
      */
    def denyOutboundEncryptedConnection(peerId: PeerId, maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * denyOutboundUpgradedConnection tests whether a fully capable connection is allowed.
      *
      * This is called after encryption has been negotiated and the connection has been
      * multiplexed, if a multiplexer is configured.
      *
      * Return true to deny the passed upgraded connection.
      */
    def denyOutboundUpgradedConnection(peerId: PeerId, maConn: MultiaddrConnection): js.Promise[Boolean]
    
    /**
      * Used by the address book to filter passed addresses.
      *
      * Return true to allow storing the passed multiaddr for the passed peer.
      */
    def filterMultiaddrForPeer(peer: PeerId, multiaddr: Multiaddr_): js.Promise[Boolean]
  }
  object ConnectionGater {
    
    inline def apply(
      denyDialMultiaddr: (PeerId, Multiaddr_) => js.Promise[Boolean],
      denyDialPeer: PeerId => js.Promise[Boolean],
      denyInboundConnection: MultiaddrConnection => js.Promise[Boolean],
      denyInboundEncryptedConnection: (PeerId, MultiaddrConnection) => js.Promise[Boolean],
      denyInboundUpgradedConnection: (PeerId, MultiaddrConnection) => js.Promise[Boolean],
      denyOutboundConnection: (PeerId, MultiaddrConnection) => js.Promise[Boolean],
      denyOutboundEncryptedConnection: (PeerId, MultiaddrConnection) => js.Promise[Boolean],
      denyOutboundUpgradedConnection: (PeerId, MultiaddrConnection) => js.Promise[Boolean],
      filterMultiaddrForPeer: (PeerId, Multiaddr_) => js.Promise[Boolean]
    ): ConnectionGater = {
      val __obj = js.Dynamic.literal(denyDialMultiaddr = js.Any.fromFunction2(denyDialMultiaddr), denyDialPeer = js.Any.fromFunction1(denyDialPeer), denyInboundConnection = js.Any.fromFunction1(denyInboundConnection), denyInboundEncryptedConnection = js.Any.fromFunction2(denyInboundEncryptedConnection), denyInboundUpgradedConnection = js.Any.fromFunction2(denyInboundUpgradedConnection), denyOutboundConnection = js.Any.fromFunction2(denyOutboundConnection), denyOutboundEncryptedConnection = js.Any.fromFunction2(denyOutboundEncryptedConnection), denyOutboundUpgradedConnection = js.Any.fromFunction2(denyOutboundUpgradedConnection), filterMultiaddrForPeer = js.Any.fromFunction2(filterMultiaddrForPeer))
      __obj.asInstanceOf[ConnectionGater]
    }
    
    extension [Self <: ConnectionGater](x: Self) {
      
      inline def setDenyDialMultiaddr(value: (PeerId, Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "denyDialMultiaddr", js.Any.fromFunction2(value))
      
      inline def setDenyDialPeer(value: PeerId => js.Promise[Boolean]): Self = StObject.set(x, "denyDialPeer", js.Any.fromFunction1(value))
      
      inline def setDenyInboundConnection(value: MultiaddrConnection => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundConnection", js.Any.fromFunction1(value))
      
      inline def setDenyInboundEncryptedConnection(value: (PeerId, MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundEncryptedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyInboundUpgradedConnection(value: (PeerId, MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundUpgradedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundConnection(value: (PeerId, MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundEncryptedConnection(value: (PeerId, MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundEncryptedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundUpgradedConnection(value: (PeerId, MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundUpgradedConnection", js.Any.fromFunction2(value))
      
      inline def setFilterMultiaddrForPeer(value: (PeerId, Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "filterMultiaddrForPeer", js.Any.fromFunction2(value))
    }
  }
  
  trait ConnectionProtector extends StObject {
    
    /**
      * Takes a given Connection and creates a private encryption stream
      * between its two peers from the PSK the Protector instance was
      * created with.
      */
    def protect(connection: MultiaddrConnection): js.Promise[MultiaddrConnection]
  }
  object ConnectionProtector {
    
    inline def apply(protect: MultiaddrConnection => js.Promise[MultiaddrConnection]): ConnectionProtector = {
      val __obj = js.Dynamic.literal(protect = js.Any.fromFunction1(protect))
      __obj.asInstanceOf[ConnectionProtector]
    }
    
    extension [Self <: ConnectionProtector](x: Self) {
      
      inline def setProtect(value: MultiaddrConnection => js.Promise[MultiaddrConnection]): Self = StObject.set(x, "protect", js.Any.fromFunction1(value))
    }
  }
  
  trait ConnectionStat extends StObject {
    
    /**
      * Outbound conections are opened by the local node, inbound streams are opened by the remote
      */
    var direction: Direction
    
    /**
      * Once a connection encrypter has been negotiated for this stream, it will be set on the stat object
      */
    var encryption: js.UndefOr[String] = js.undefined
    
    /**
      * Once a multiplexer has been negotiated for this stream, it will be set on the stat object
      */
    var multiplexer: js.UndefOr[String] = js.undefined
    
    /**
      * The current status of the connection
      */
    var status: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED
    
    /**
      * Lifecycle times for the connection
      */
    var timeline: ConnectionTimeline
  }
  object ConnectionStat {
    
    inline def apply(
      direction: Direction,
      status: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED,
      timeline: ConnectionTimeline
    ): ConnectionStat = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStat]
    }
    
    extension [Self <: ConnectionStat](x: Self) {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      inline def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      inline def setStatus(value: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: ConnectionTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
    
    var upgraded: js.UndefOr[Double] = js.undefined
  }
  object ConnectionTimeline {
    
    inline def apply(open: Double): ConnectionTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionTimeline]
    }
    
    extension [Self <: ConnectionTimeline](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: Double): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
      
      inline def setUpgradedUndefined: Self = StObject.set(x, "upgraded", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound
    - typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound
  */
  trait Direction extends StObject
  object Direction {
    
    inline def inbound: typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound = "inbound".asInstanceOf[typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound]
    
    inline def outbound: typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound = "outbound".asInstanceOf[typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound]
  }
  
  @js.native
  trait MultiaddrConnection
    extends StObject
       with Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]] {
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    var remoteAddr: Multiaddr_ = js.native
    
    var timeline: MultiaddrConnectionTimeline = js.native
  }
  
  trait MultiaddrConnectionTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
    
    var upgraded: js.UndefOr[Double] = js.undefined
  }
  object MultiaddrConnectionTimeline {
    
    inline def apply(open: Double): MultiaddrConnectionTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiaddrConnectionTimeline]
    }
    
    extension [Self <: MultiaddrConnectionTimeline](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: Double): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
      
      inline def setUpgradedUndefined: Self = StObject.set(x, "upgraded", js.undefined)
    }
  }
  
  trait Stream
    extends StObject
       with Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]] {
    
    /**
      * Call when a local error occurs, should close the stream for reading and writing
      */
    def abort(err: js.Error): Unit
    
    /**
      * Close a stream for reading and writing
      */
    def close(): Unit
    
    /**
      * Close a stream for reading only
      */
    def closeRead(): Unit
    
    /**
      * Close a stream for writing only
      */
    def closeWrite(): Unit
    
    /**
      * Unique identifier for a stream
      */
    var id: String
    
    /**
      * User defined stream metadata
      */
    var metadata: Record[String, Any]
    
    /**
      * Call when a remote error occurs, should close the stream for reading and writing
      */
    def reset(): Unit
    
    /**
      * Stats about this stream
      */
    var stat: StreamStat
  }
  object Stream {
    
    inline def apply(
      abort: js.Error => Unit,
      close: () => Unit,
      closeRead: () => Unit,
      closeWrite: () => Unit,
      id: String,
      metadata: Record[String, Any],
      reset: () => Unit,
      sink: /* source */ Source[Uint8ArrayList | js.typedarray.Uint8Array] => js.Promise[Unit],
      source: Source[Uint8ArrayList],
      stat: StreamStat
    ): Stream = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), close = js.Any.fromFunction0(close), closeRead = js.Any.fromFunction0(closeRead), closeWrite = js.Any.fromFunction0(closeWrite), id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setAbort(value: js.Error => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseRead(value: () => Unit): Self = StObject.set(x, "closeRead", js.Any.fromFunction0(value))
      
      inline def setCloseWrite(value: () => Unit): Self = StObject.set(x, "closeWrite", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStat(value: StreamStat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamStat extends StObject {
    
    /**
      * Outbound streams are opened by the local node, inbound streams are opened by the remote
      */
    var direction: Direction
    
    /**
      * Once a protocol has been negotiated for this stream, it will be set on the stat object
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * Lifecycle times for the stream
      */
    var timeline: StreamTimeline
  }
  object StreamStat {
    
    inline def apply(direction: Direction, timeline: StreamTimeline): StreamStat = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamStat]
    }
    
    extension [Self <: StreamStat](x: Self) {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setTimeline(value: StreamTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
  }
  object StreamTimeline {
    
    inline def apply(open: Double): StreamTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTimeline]
    }
    
    extension [Self <: StreamTimeline](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
