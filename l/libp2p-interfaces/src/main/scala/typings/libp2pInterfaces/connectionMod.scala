package typings.libp2pInterfaces

import typings.libp2pInterfaces.anon.Close
import typings.libp2pInterfaces.anon.Encryption
import typings.libp2pInterfaces.anon.Metadata
import typings.libp2pInterfaces.anon.Protocol
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  /**
    * An implementation of the js-libp2p connection.
    * Any libp2p transport should use an upgrader to return this connection.
    */
  /* was `typeof Connection` */
  @JSImport("libp2p-interfaces/src/connection/connection", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Connection {
    /**
      * Creates an instance of Connection.
      * @param {object} properties properties of the connection.
      * @param {multiaddr} [properties.localAddr] local multiaddr of the connection if known.
      * @param {multiaddr} [properties.remoteAddr] remote multiaddr of the connection.
      * @param {PeerId} properties.localPeer local peer-id.
      * @param {PeerId} properties.remotePeer remote peer-id.
      * @param {function} properties.newStream new stream muxer function.
      * @param {function} properties.close close raw connection function.
      * @param {function(): Stream[]} properties.getStreams get streams from muxer function.
      * @param {object} properties.stat metadata of the connection.
      * @param {string} properties.stat.direction connection establishment direction ("inbound" or "outbound").
      * @param {object} properties.stat.timeline connection relevant events timestamp.
      * @param {string} properties.stat.timeline.open connection opening timestamp.
      * @param {string} properties.stat.timeline.upgraded connection upgraded timestamp.
      * @param {string} [properties.stat.multiplexer] connection multiplexing identifier.
      * @param {string} [properties.stat.encryption] connection encryption method identifier.
      */
    def this(hasLocalAddrRemoteAddrLocalPeerRemotePeerNewStreamCloseGetStreamsStat: Close) = this()
  }
  
  /**
    * An implementation of the js-libp2p connection.
    * Any libp2p transport should use an upgrader to return this connection.
    */
  @js.native
  trait Connection extends StObject {
    
    /**
      * Reference to the close function of the raw connection
      */
    var _close: js.Function = js.native
    
    var _closing: js.Any = js.native
    
    /**
      * Reference to the getStreams function of the muxer
      */
    def _getStreams(): js.Array[js.Any] = js.native
    
    /**
      * Reference to the new stream function of the multiplexer
      */
    var _newStream: js.Function = js.native
    
    /**
      * Connection metadata.
      */
    var _stat: Encryption = js.native
    
    /**
      * Add a stream when it is opened to the registry.
      * @param {*} muxedStream a muxed stream
      * @param {object} properties the stream properties to be registered
      * @param {string} properties.protocol the protocol used by the stream
      * @param {object} properties.metadata metadata of the stream
      * @return {void}
      */
    def addStream(muxedStream: js.Any, hasProtocolMetadata: Metadata): Unit = js.native
    
    /**
      * Close the connection.
      * @return {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Connection identifier.
      */
    var id: js.Any = js.native
    
    /**
      * Observed multiaddr of the local peer
      */
    var localAddr: typings.multiaddr.mod.^ = js.native
    
    /**
      * Local peer id.
      */
    var localPeer: typings.peerId.mod.^ = js.native
    
    /**
      * Create a new stream from this connection
      * @param {string[]} protocols intended protocol for the stream
      * @return {Promise<{stream: Stream, protocol: string}>} with muxed+multistream-selected stream and selected protocol
      */
    def newStream(protocols: js.Array[String]): js.Promise[Protocol] = js.native
    
    /**
      * Connection streams registry
      */
    var registry: Map[js.Any, js.Any] = js.native
    
    /**
      * Observed multiaddr of the remote peer
      */
    var remoteAddr: typings.multiaddr.mod.^ = js.native
    
    /**
      * Remote peer id.
      */
    var remotePeer: typings.peerId.mod.^ = js.native
    
    /**
      * Remove stream registry after it is closed.
      * @param {string} id identifier of the stream
      */
    def removeStream(id: String): Unit = js.native
    
    /**
      * Get connection metadata
      * @this {Connection}
      */
    def stat: Encryption = js.native
    
    /**
      * Get all the streams of the muxer.
      * @this {Connection}
      */
    def streams: js.Array[js.Any] = js.native
    
    /**
      * User provided tags
      * @type {string[]}
      */
    var tags: js.Array[String] = js.native
  }
  
  /**
    * An implementation of the js-libp2p connection.
    * Any libp2p transport should use an upgrader to return this connection.
    */
  /* was `typeof Connection` */
  type exports = Connection
}
