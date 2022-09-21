package typings.libp2pWebrtcPeer

import typings.itPushable.mod.Pushable_
import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Sink
import typings.itStreamTypes.mod.Source
import typings.libp2pLogger.mod.Logger_
import typings.libp2pWebrtcPeer.anon.Channel
import typings.libp2pWebrtcPeer.anon.WebRTCPeerInitlogPrefixst
import typings.libp2pWebrtcPeer.channelMod.WebRTCDataChannel
import typings.libp2pWebrtcPeer.mod.WRTC
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter<WebRTCPeerEvents> * / any */ @JSImport("@libp2p/webrtc-peer/dist/src/peer", "WebRTCPeer")
  @js.native
  open class WebRTCPeer protected ()
    extends StObject
       with Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]] {
    def this(opts: WebRTCPeerInitlogPrefixst) = this()
    
    /* protected */ var channel: js.UndefOr[WebRTCDataChannel] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    var closed: Boolean = js.native
    
    /* private */ val connected: Any = js.native
    
    /* protected */ def handleDataChannelEvent(event: Channel): Unit = js.native
    
    var id: String = js.native
    
    /* protected */ def log(formatter: Any, args: Any*): Unit = js.native
    /* protected */ @JSName("log")
    var log_Original: Logger_ = js.native
    
    /* protected */ var peerConnection: RTCPeerConnection = js.native
    
    /* CompleteClass */
    override def sink(source: Source[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("sink")
    var sink_Original: Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /* CompleteClass */
    var source: Source[js.typedarray.Uint8Array] = js.native
    @JSName("source")
    var source_WebRTCPeer: Pushable_[js.typedarray.Uint8Array] = js.native
    
    /* protected */ var wrtc: WRTC = js.native
  }
}
