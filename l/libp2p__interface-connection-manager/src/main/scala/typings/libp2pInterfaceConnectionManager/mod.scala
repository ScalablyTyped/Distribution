package typings.libp2pInterfaceConnectionManager

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ConnectionManager extends EventEmitter[ConnectionManagerEvents] {
    
    /**
      * Invoked after an incoming connection is opened but before PeerIds are
      * exchanged, this lets the ConnectionManager check we have sufficient
      * resources to accept the connection in which case it will return true,
      * otherwise it will return false.
      */
    def acceptIncomingConnection(maConn: MultiaddrConnection): js.Promise[Boolean] = js.native
    
    /**
      * Invoked after upgrading a multiaddr connection has finished
      */
    def afterUpgradeInbound(): Unit = js.native
    
    /**
      * Close our connections to a peer
      */
    def closeConnections(peer: PeerId): js.Promise[Unit] = js.native
    
    /**
      * Return connections, optionally filtering by a PeerId
      */
    def getConnections(): js.Array[Connection] = js.native
    def getConnections(peerId: PeerId): js.Array[Connection] = js.native
    
    /**
      * Open a connection to a remote peer
      */
    def openConnection(peer: PeerId): js.Promise[Connection] = js.native
    def openConnection(peer: PeerId, options: AbortOptions): js.Promise[Connection] = js.native
  }
  
  trait ConnectionManagerEvents extends StObject {
    
    @JSName("peer:connect")
    var peerColonconnect: CustomEvent[Connection]
    
    @JSName("peer:disconnect")
    var peerColondisconnect: CustomEvent[Connection]
  }
  object ConnectionManagerEvents {
    
    inline def apply(peerColonconnect: CustomEvent[Connection], peerColondisconnect: CustomEvent[Connection]): ConnectionManagerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("peer:connect")(peerColonconnect.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:disconnect")(peerColondisconnect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionManagerEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionManagerEvents] (val x: Self) extends AnyVal {
      
      inline def setPeerColonconnect(value: CustomEvent[Connection]): Self = StObject.set(x, "peer:connect", value.asInstanceOf[js.Any])
      
      inline def setPeerColondisconnect(value: CustomEvent[Connection]): Self = StObject.set(x, "peer:disconnect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dialer extends StObject {
    
    /**
      * Dial a peer or multiaddr and return the promise of a connection
      */
    def dial(peer: PeerId): js.Promise[Connection] = js.native
    def dial(peer: PeerId, options: AbortOptions): js.Promise[Connection] = js.native
    def dial(peer: Multiaddr_): js.Promise[Connection] = js.native
    def dial(peer: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    /**
      * Request `num` dial tokens. Only the returned number of dials may be attempted.
      */
    def getTokens(num: Double): js.Array[Double] = js.native
    
    /**
      * After a dial attempt succeeds or fails, return the passed token to the pool
      */
    def releaseToken(token: Double): Unit = js.native
  }
}
