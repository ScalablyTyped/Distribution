package typings.libp2pPubsub

import typings.itPushable.mod.Pushable_
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.PeerStreamEvents
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerStreamsMod {
  
  @JSImport("@libp2p/pubsub/dist/src/peer-streams", "PeerStreams")
  @js.native
  open class PeerStreams protected () extends EventEmitter[PeerStreamEvents] {
    def this(init: PeerStreamsInit) = this()
    
    /**
      * An AbortController for controlled shutdown of the inbound stream
      */
    /* private */ val _inboundAbortController: Any = js.native
    
    /**
      * The raw inbound stream, as retrieved from the callback from libp2p.handle
      */
    /* private */ var _rawInboundStream: Any = js.native
    
    /**
      * The raw outbound stream, as retrieved from conn.newStream
      */
    /* private */ var _rawOutboundStream: Any = js.native
    
    /**
      * Attach a raw inbound stream and setup a read stream
      */
    def attachInboundStream(stream: Stream): AsyncIterable[Uint8ArrayList] = js.native
    
    /**
      * Attach a raw outbound stream and setup a write stream
      */
    def attachOutboundStream(stream: Stream): js.Promise[Pushable_[Uint8ArrayList, Unit, Any]] = js.native
    
    /**
      * Closes the open connection to peer
      */
    def close(): Unit = js.native
    
    /* private */ var closed: Any = js.native
    
    val id: PeerId = js.native
    
    /**
      * Read stream
      */
    var inboundStream: js.UndefOr[AsyncIterable[Uint8ArrayList]] = js.native
    
    /**
      * Do we have a connection to read from?
      */
    def isReadable: Boolean = js.native
    
    /**
      * Do we have a connection to write on?
      */
    def isWritable: Boolean = js.native
    
    /**
      * Write stream - it's preferable to use the write method
      */
    var outboundStream: js.UndefOr[Pushable_[Uint8ArrayList, Unit, Any]] = js.native
    
    val protocol: String = js.native
    
    /**
      * Send a message to this peer.
      * Throws if there is no `stream` to write to available.
      */
    def write(data: js.typedarray.Uint8Array): Unit = js.native
    def write(data: Uint8ArrayList): Unit = js.native
  }
  
  trait PeerStreamsInit extends StObject {
    
    var id: PeerId
    
    var protocol: String
  }
  object PeerStreamsInit {
    
    inline def apply(id: PeerId, protocol: String): PeerStreamsInit = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerStreamsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerStreamsInit] (val x: Self) extends AnyVal {
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
