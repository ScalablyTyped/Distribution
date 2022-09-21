package typings.libp2pWebrtcPeer

import typings.libp2pLogger.mod.Logger_
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.idle
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.negotiating
import typings.libp2pWebrtcPeer.mod.AnswerSignal
import typings.libp2pWebrtcPeer.mod.CandidateSignal
import typings.libp2pWebrtcPeer.mod.GoodbyeSignal
import typings.libp2pWebrtcPeer.mod.OfferSignal
import typings.libp2pWebrtcPeer.mod.RenegotiateSignal
import typings.libp2pWebrtcPeer.mod.Signal
import typings.libp2pWebrtcPeer.mod.WRTC
import typings.std.RTCOfferOptions
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter<WebRTCPeerEvents> * / any */ @JSImport("@libp2p/webrtc-peer/dist/src/handshake", "WebRTCHandshake")
  @js.native
  open class WebRTCHandshake protected () extends StObject {
    def this(options: WebRTCHandshakeOptions) = this()
    
    def handleAnswer(signal: AnswerSignal): js.Promise[Unit] = js.native
    
    def handleCandidate(signal: CandidateSignal): js.Promise[Unit] = js.native
    
    def handleGoodye(signal: GoodbyeSignal): js.Promise[Unit] = js.native
    
    def handleOffer(signal: OfferSignal): js.Promise[Unit] = js.native
    
    def handleRenegotiate(signal: RenegotiateSignal): js.Promise[Unit] = js.native
    
    def handleSignal(signal: Signal): js.Promise[Unit] = js.native
    
    /* protected */ def log(formatter: Any, args: Any*): Unit = js.native
    /* protected */ @JSName("log")
    var log_Original: Logger_ = js.native
    
    /* protected */ var peerConnection: RTCPeerConnection = js.native
    
    /* protected */ var status: idle | negotiating = js.native
    
    /* protected */ var wrtc: WRTC = js.native
  }
  
  trait WebRTCHandshakeOptions extends StObject {
    
    def log(formatter: Any, args: Any*): Unit
    @JSName("log")
    var log_Original: Logger_
    
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.undefined
    
    var peerConnection: RTCPeerConnection
    
    var wrtc: WRTC
  }
  object WebRTCHandshakeOptions {
    
    inline def apply(log: Logger_, peerConnection: RTCPeerConnection, wrtc: WRTC): WebRTCHandshakeOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], peerConnection = peerConnection.asInstanceOf[js.Any], wrtc = wrtc.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCHandshakeOptions]
    }
    
    extension [Self <: WebRTCHandshakeOptions](x: Self) {
      
      inline def setLog(value: Logger_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      inline def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
      
      inline def setPeerConnection(value: RTCPeerConnection): Self = StObject.set(x, "peerConnection", value.asInstanceOf[js.Any])
      
      inline def setWrtc(value: WRTC): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
    }
  }
}
