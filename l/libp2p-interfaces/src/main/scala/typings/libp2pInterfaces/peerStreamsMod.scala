package typings.libp2pInterfaces

import typings.itPushable.mod.Pushable
import typings.libp2pInterfaces.anon.Id
import typings.std.AsyncIterator
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerStreamsMod {
  
  /**
    * @callback Sink
    * @param {Uint8Array} source
    * @returns {Promise<Uint8Array>}
    *
    * @typedef {object} DuplexIterableStream
    * @property {Sink} sink
    * @property {() AsyncIterator<Uint8Array>} source
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
    * Thin wrapper around a peer's inbound / outbound pubsub streams
    */
  @JSImport("libp2p-interfaces/src/pubsub/peer-streams", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PeerStreams {
    /**
      * @param {object} properties properties of the PeerStreams.
      * @param {PeerId} properties.id
      * @param {string} properties.protocol
      */
    def this(hasIdProtocol: Id) = this()
  }
  
  trait DuplexIterableStream extends StObject {
    
    def sink(source: Uint8Array): js.Promise[Uint8Array]
    @JSName("sink")
    var sink_Original: Sink
    
    def source(): AsyncIterator[Uint8Array, js.Any, Unit]
  }
  object DuplexIterableStream {
    
    inline def apply(
      sink: /* source */ Uint8Array => js.Promise[Uint8Array],
      source: () => AsyncIterator[Uint8Array, js.Any, Unit]
    ): DuplexIterableStream = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = js.Any.fromFunction0(source))
      __obj.asInstanceOf[DuplexIterableStream]
    }
    
    extension [Self <: DuplexIterableStream](x: Self) {
      
      inline def setSink(value: /* source */ Uint8Array => js.Promise[Uint8Array]): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      inline def setSource(value: () => AsyncIterator[Uint8Array, js.Any, Unit]): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
    }
  }
  
  type PeerId = typings.peerId.mod.^
  
  /**
    * @callback Sink
    * @param {Uint8Array} source
    * @returns {Promise<Uint8Array>}
    *
    * @typedef {object} DuplexIterableStream
    * @property {Sink} sink
    * @property {() AsyncIterator<Uint8Array>} source
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
    * Thin wrapper around a peer's inbound / outbound pubsub streams
    */
  @js.native
  trait PeerStreams extends StObject {
    
    /**
      * An AbortController for controlled shutdown of the inbound stream
      * @private
      * @type {typeof AbortController}
      */
    var _inboundAbortController: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_abort-controller */ js.Any = js.native
    
    /**
      * The raw inbound stream, as retrieved from the callback from libp2p.handle
      * @private
      * @type {DuplexIterableStream}
      */
    var _rawInboundStream: DuplexIterableStream = js.native
    
    /**
      * The raw outbound stream, as retrieved from conn.newStream
      * @private
      * @type {DuplexIterableStream}
      */
    var _rawOutboundStream: DuplexIterableStream = js.native
    
    /**
      * Attach a raw inbound stream and setup a read stream
      *
      * @param {DuplexIterableStream} stream
      * @returns {void}
      */
    def attachInboundStream(stream: DuplexIterableStream): Unit = js.native
    
    /**
      * Attach a raw outbound stream and setup a write stream
      *
      * @param {Stream} stream
      * @returns {Promise<void>}
      */
    def attachOutboundStream(stream: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Closes the open connection to peer
      * @returns {void}
      */
    def close(): Unit = js.native
    
    /**
      * @type {import('peer-id')}
      */
    var id: typings.peerId.mod.^ = js.native
    
    /**
      * Read stream
      * @type {DuplexIterableStream}
      */
    var inboundStream: DuplexIterableStream = js.native
    
    /**
      * Do we have a connection to read from?
      *
      * @type {boolean}
      */
    def isReadable: Boolean = js.native
    
    /**
      * Do we have a connection to write on?
      *
      * @type {boolean}
      */
    def isWritable: Boolean = js.native
    
    /**
      * Write stream -- its preferable to use the write method
      * @type {import('it-pushable').Pushable<Uint8Array>>}
      */
    var outboundStream: Pushable[Uint8Array] = js.native
    
    /**
      * Established protocol
      * @type {string}
      */
    var protocol: String = js.native
    
    /**
      * Send a message to this peer.
      * Throws if there is no `stream` to write to available.
      *
      * @param {Uint8Array} data
      * @returns {void}
      */
    def write(data: Uint8Array): Unit = js.native
  }
  
  type Sink = js.Function1[/* source */ Uint8Array, js.Promise[Uint8Array]]
}
