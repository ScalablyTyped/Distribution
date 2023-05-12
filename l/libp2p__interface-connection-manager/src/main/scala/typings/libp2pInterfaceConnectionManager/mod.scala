package typings.libp2pInterfaceConnectionManager

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pPeerCollections.mod.PeerMap
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ConnectionManager extends StObject {
    
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
      *
      * @example
      *
      * ```js
      * const connections = libp2p.connectionManager.get(peerId)
      * // []
      * ```
      */
    def getConnections(): js.Array[Connection] = js.native
    def getConnections(peerId: PeerId): js.Array[Connection] = js.native
    
    /**
      * Return a map of all connections with their associated PeerIds
      *
      * @example
      *
      * ```js
      * const connectionsMap = libp2p.connectionManager.getConnectionsMap()
      * ```
      */
    def getConnectionsMap(): PeerMap[js.Array[Connection]] = js.native
    
    /**
      * Return the list of in-progress or queued dials
      *
      * @example
      *
      * ```js
      * const dials = libp2p.connectionManager.getDialQueue()
      * ```
      */
    def getDialQueue(): js.Array[PendingDial] = js.native
    
    def openConnection(peer: js.Array[Multiaddr_]): js.Promise[Connection] = js.native
    def openConnection(peer: js.Array[Multiaddr_], options: AbortOptions): js.Promise[Connection] = js.native
    /**
      * Open a connection to a remote peer
      *
      * @example
      *
      * ```js
      * const connection = await libp2p.connectionManager.openConnection(peerId)
      * ```
      */
    def openConnection(peer: PeerId): js.Promise[Connection] = js.native
    def openConnection(peer: PeerId, options: AbortOptions): js.Promise[Connection] = js.native
    def openConnection(peer: Multiaddr_): js.Promise[Connection] = js.native
    def openConnection(peer: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
  }
  
  trait PendingDial extends StObject {
    
    var id: String
    
    var multiaddrs: js.Array[Multiaddr_]
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var status: PendingDialStatus
  }
  object PendingDial {
    
    inline def apply(id: String, multiaddrs: js.Array[Multiaddr_], status: PendingDialStatus): PendingDial = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingDial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingDial] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setStatus(value: PendingDialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.queued
    - typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.active
    - typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.error
    - typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.success
  */
  trait PendingDialStatus extends StObject
  object PendingDialStatus {
    
    inline def active: typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.active = "active".asInstanceOf[typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.active]
    
    inline def error: typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.error = "error".asInstanceOf[typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.error]
    
    inline def queued: typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.queued = "queued".asInstanceOf[typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.queued]
    
    inline def success: typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.success = "success".asInstanceOf[typings.libp2pInterfaceConnectionManager.libp2pInterfaceConnectionManagerStrings.success]
  }
}
