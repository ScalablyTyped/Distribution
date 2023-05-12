package typings.libp2pInterfaceConnectionGater

import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ConnectionGater extends StObject {
    
    /**
      * denyDialMultiaddr tests whether we're permitted to dial the specified
      * multiaddr.
      *
      * This is called by the connection manager - if the peer id of the remote
      * node is known it will be present in the multiaddr.
      *
      * Return true to prevent dialing the passed peer on the passed multiaddr.
      */
    var denyDialMultiaddr: js.UndefOr[js.Function1[/* multiaddr */ Multiaddr_, js.Promise[Boolean]]] = js.undefined
    
    /**
      * denyDialPeer tests whether we're permitted to Dial the
      * specified peer.
      *
      * This is called by the dialer.connectToPeer implementation before
      * dialling a peer.
      *
      * Return true to prevent dialing the passed peer.
      */
    var denyDialPeer: js.UndefOr[js.Function1[/* peerId */ PeerId, js.Promise[Boolean]]] = js.undefined
    
    /**
      * denyInboundConnection tests whether an incipient inbound connection is allowed.
      *
      * This is called by the upgrader, or by the transport directly (e.g. QUIC,
      * Bluetooth), straight after it has accepted a connection from its socket.
      *
      * Return true to deny the incoming passed connection.
      */
    var denyInboundConnection: js.UndefOr[js.Function1[/* maConn */ MultiaddrConnection, js.Promise[Boolean]]] = js.undefined
    
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
    var denyInboundEncryptedConnection: js.UndefOr[
        js.Function2[/* peerId */ PeerId, /* maConn */ MultiaddrConnection, js.Promise[Boolean]]
      ] = js.undefined
    
    /**
      * denyInboundRelayReservation tests whether a remote peer is allowed make a
      * relay reservation on this node.
      *
      * Return true to deny the relay reservation.
      */
    var denyInboundRelayReservation: js.UndefOr[js.Function1[/* source */ PeerId, js.Promise[Boolean]]] = js.undefined
    
    /**
      * denyInboundRelayedConnection tests whether a remote peer is allowed to open a relayed
      * connection to this node.
      *
      * This is invoked on the relay client when a remote relay has received an instruction to
      * relay a connection to the client.
      *
      * Return true to deny the relayed connection.
      */
    var denyInboundRelayedConnection: js.UndefOr[js.Function2[/* relay */ PeerId, /* remotePeer */ PeerId, js.Promise[Boolean]]] = js.undefined
    
    /**
      * denyInboundUpgradedConnection tests whether a fully capable connection is allowed.
      *
      * This is called after encryption has been negotiated and the connection has been
      * multiplexed, if a multiplexer is configured.
      *
      * Return true to deny the passed upgraded connection.
      */
    var denyInboundUpgradedConnection: js.UndefOr[
        js.Function2[/* peerId */ PeerId, /* maConn */ MultiaddrConnection, js.Promise[Boolean]]
      ] = js.undefined
    
    /**
      * denyOutboundConnection tests whether an incipient outbound connection is allowed.
      *
      * This is called by the upgrader, or by the transport directly (e.g. QUIC,
      * Bluetooth), straight after it has created a connection with its socket.
      *
      * Return true to deny the incoming passed connection.
      */
    var denyOutboundConnection: js.UndefOr[
        js.Function2[/* peerId */ PeerId, /* maConn */ MultiaddrConnection, js.Promise[Boolean]]
      ] = js.undefined
    
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
    var denyOutboundEncryptedConnection: js.UndefOr[
        js.Function2[/* peerId */ PeerId, /* maConn */ MultiaddrConnection, js.Promise[Boolean]]
      ] = js.undefined
    
    /**
      * denyOutboundRelayedConnection tests whether a remote peer is allowed to open a relayed
      * connection to the destination node.
      *
      * This is invoked on the relay server when a source client with a reservation instructs
      * the server to relay a connection to a destination peer.
      *
      * Return true to deny the relayed connection.
      */
    var denyOutboundRelayedConnection: js.UndefOr[js.Function2[/* source */ PeerId, /* destination */ PeerId, js.Promise[Boolean]]] = js.undefined
    
    /**
      * denyOutboundUpgradedConnection tests whether a fully capable connection is allowed.
      *
      * This is called after encryption has been negotiated and the connection has been
      * multiplexed, if a multiplexer is configured.
      *
      * Return true to deny the passed upgraded connection.
      */
    var denyOutboundUpgradedConnection: js.UndefOr[
        js.Function2[/* peerId */ PeerId, /* maConn */ MultiaddrConnection, js.Promise[Boolean]]
      ] = js.undefined
    
    /**
      * Used by the address book to filter passed addresses.
      *
      * Return true to allow storing the passed multiaddr for the passed peer.
      */
    var filterMultiaddrForPeer: js.UndefOr[js.Function2[/* peer */ PeerId, /* multiaddr */ Multiaddr_, js.Promise[Boolean]]] = js.undefined
  }
  object ConnectionGater {
    
    inline def apply(): ConnectionGater = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionGater]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionGater] (val x: Self) extends AnyVal {
      
      inline def setDenyDialMultiaddr(value: /* multiaddr */ Multiaddr_ => js.Promise[Boolean]): Self = StObject.set(x, "denyDialMultiaddr", js.Any.fromFunction1(value))
      
      inline def setDenyDialMultiaddrUndefined: Self = StObject.set(x, "denyDialMultiaddr", js.undefined)
      
      inline def setDenyDialPeer(value: /* peerId */ PeerId => js.Promise[Boolean]): Self = StObject.set(x, "denyDialPeer", js.Any.fromFunction1(value))
      
      inline def setDenyDialPeerUndefined: Self = StObject.set(x, "denyDialPeer", js.undefined)
      
      inline def setDenyInboundConnection(value: /* maConn */ MultiaddrConnection => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundConnection", js.Any.fromFunction1(value))
      
      inline def setDenyInboundConnectionUndefined: Self = StObject.set(x, "denyInboundConnection", js.undefined)
      
      inline def setDenyInboundEncryptedConnection(value: (/* peerId */ PeerId, /* maConn */ MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundEncryptedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyInboundEncryptedConnectionUndefined: Self = StObject.set(x, "denyInboundEncryptedConnection", js.undefined)
      
      inline def setDenyInboundRelayReservation(value: /* source */ PeerId => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundRelayReservation", js.Any.fromFunction1(value))
      
      inline def setDenyInboundRelayReservationUndefined: Self = StObject.set(x, "denyInboundRelayReservation", js.undefined)
      
      inline def setDenyInboundRelayedConnection(value: (/* relay */ PeerId, /* remotePeer */ PeerId) => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundRelayedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyInboundRelayedConnectionUndefined: Self = StObject.set(x, "denyInboundRelayedConnection", js.undefined)
      
      inline def setDenyInboundUpgradedConnection(value: (/* peerId */ PeerId, /* maConn */ MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyInboundUpgradedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyInboundUpgradedConnectionUndefined: Self = StObject.set(x, "denyInboundUpgradedConnection", js.undefined)
      
      inline def setDenyOutboundConnection(value: (/* peerId */ PeerId, /* maConn */ MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundConnectionUndefined: Self = StObject.set(x, "denyOutboundConnection", js.undefined)
      
      inline def setDenyOutboundEncryptedConnection(value: (/* peerId */ PeerId, /* maConn */ MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundEncryptedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundEncryptedConnectionUndefined: Self = StObject.set(x, "denyOutboundEncryptedConnection", js.undefined)
      
      inline def setDenyOutboundRelayedConnection(value: (/* source */ PeerId, /* destination */ PeerId) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundRelayedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundRelayedConnectionUndefined: Self = StObject.set(x, "denyOutboundRelayedConnection", js.undefined)
      
      inline def setDenyOutboundUpgradedConnection(value: (/* peerId */ PeerId, /* maConn */ MultiaddrConnection) => js.Promise[Boolean]): Self = StObject.set(x, "denyOutboundUpgradedConnection", js.Any.fromFunction2(value))
      
      inline def setDenyOutboundUpgradedConnectionUndefined: Self = StObject.set(x, "denyOutboundUpgradedConnection", js.undefined)
      
      inline def setFilterMultiaddrForPeer(value: (/* peer */ PeerId, /* multiaddr */ Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "filterMultiaddrForPeer", js.Any.fromFunction2(value))
      
      inline def setFilterMultiaddrForPeerUndefined: Self = StObject.set(x, "filterMultiaddrForPeer", js.undefined)
    }
  }
}
