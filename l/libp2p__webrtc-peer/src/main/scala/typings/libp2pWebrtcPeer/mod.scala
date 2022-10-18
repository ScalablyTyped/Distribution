package typings.libp2pWebrtcPeer

import typings.libp2pWebrtcPeer.anon.Candidate
import typings.libp2pWebrtcPeer.anon.TypeofRTCPeerConnection
import typings.libp2pWebrtcPeer.anon.WebRTCPeerInitlogPrefixst
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.answer
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.candidate
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.goodbye
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.offer
import typings.libp2pWebrtcPeer.libp2pWebrtcPeerStrings.renegotiate
import typings.std.CustomEvent
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCDataChannelInit
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/webrtc-peer", "WebRTCInitiator")
  @js.native
  open class WebRTCInitiator ()
    extends typings.libp2pWebrtcPeer.distSrcInitiatorMod.WebRTCInitiator {
    def this(opts: WebRTCInitiatorInit) = this()
  }
  
  @JSImport("@libp2p/webrtc-peer", "WebRTCPeer")
  @js.native
  open class WebRTCPeer protected ()
    extends typings.libp2pWebrtcPeer.distSrcPeerMod.WebRTCPeer {
    def this(opts: WebRTCPeerInitlogPrefixst) = this()
  }
  
  @JSImport("@libp2p/webrtc-peer", "WebRTCReceiver")
  @js.native
  open class WebRTCReceiver ()
    extends typings.libp2pWebrtcPeer.distSrcReceiverMod.WebRTCReceiver {
    def this(opts: WebRTCReceiverInit) = this()
  }
  
  trait AnswerSignal
    extends StObject
       with Signal {
    
    var sdp: String
    
    var `type`: answer
  }
  object AnswerSignal {
    
    inline def apply(sdp: String): AnswerSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("answer")
      __obj.asInstanceOf[AnswerSignal]
    }
    
    extension [Self <: AnswerSignal](x: Self) {
      
      inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      inline def setType(value: answer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CandidateSignal
    extends StObject
       with Signal {
    
    var candidate: Candidate
    
    var `type`: candidate
  }
  object CandidateSignal {
    
    inline def apply(candidate: Candidate): CandidateSignal = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[CandidateSignal]
    }
    
    extension [Self <: CandidateSignal](x: Self) {
      
      inline def setCandidate(value: Candidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setType(value: candidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoodbyeSignal
    extends StObject
       with Signal {
    
    var `type`: goodbye
  }
  object GoodbyeSignal {
    
    inline def apply(): GoodbyeSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("goodbye")
      __obj.asInstanceOf[GoodbyeSignal]
    }
    
    extension [Self <: GoodbyeSignal](x: Self) {
      
      inline def setType(value: goodbye): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OfferSignal
    extends StObject
       with Signal {
    
    var sdp: String
    
    var `type`: offer
  }
  object OfferSignal {
    
    inline def apply(sdp: String): OfferSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("offer")
      __obj.asInstanceOf[OfferSignal]
    }
    
    extension [Self <: OfferSignal](x: Self) {
      
      inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      inline def setType(value: offer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenegotiateSignal
    extends StObject
       with Signal {
    
    var `type`: renegotiate
  }
  object RenegotiateSignal {
    
    inline def apply(): RenegotiateSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[RenegotiateSignal]
    }
    
    extension [Self <: RenegotiateSignal](x: Self) {
      
      inline def setType(value: renegotiate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pWebrtcPeer.mod.OfferSignal
    - typings.libp2pWebrtcPeer.mod.AnswerSignal
    - typings.libp2pWebrtcPeer.mod.CandidateSignal
    - typings.libp2pWebrtcPeer.mod.RenegotiateSignal
    - typings.libp2pWebrtcPeer.mod.GoodbyeSignal
  */
  trait Signal extends StObject
  object Signal {
    
    inline def AnswerSignal(sdp: String): typings.libp2pWebrtcPeer.mod.AnswerSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("answer")
      __obj.asInstanceOf[typings.libp2pWebrtcPeer.mod.AnswerSignal]
    }
    
    inline def CandidateSignal(candidate: Candidate): typings.libp2pWebrtcPeer.mod.CandidateSignal = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[typings.libp2pWebrtcPeer.mod.CandidateSignal]
    }
    
    inline def GoodbyeSignal(): typings.libp2pWebrtcPeer.mod.GoodbyeSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("goodbye")
      __obj.asInstanceOf[typings.libp2pWebrtcPeer.mod.GoodbyeSignal]
    }
    
    inline def OfferSignal(sdp: String): typings.libp2pWebrtcPeer.mod.OfferSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("offer")
      __obj.asInstanceOf[typings.libp2pWebrtcPeer.mod.OfferSignal]
    }
    
    inline def RenegotiateSignal(): typings.libp2pWebrtcPeer.mod.RenegotiateSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[typings.libp2pWebrtcPeer.mod.RenegotiateSignal]
    }
  }
  
  trait WRTC extends StObject {
    
    var RTCIceCandidate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any
    
    var RTCPeerConnection: TypeofRTCPeerConnection
    
    var RTCSessionDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
  }
  object WRTC {
    
    inline def apply(
      RTCIceCandidate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any,
      RTCPeerConnection: TypeofRTCPeerConnection,
      RTCSessionDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
    ): WRTC = {
      val __obj = js.Dynamic.literal(RTCIceCandidate = RTCIceCandidate.asInstanceOf[js.Any], RTCPeerConnection = RTCPeerConnection.asInstanceOf[js.Any], RTCSessionDescription = RTCSessionDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[WRTC]
    }
    
    extension [Self <: WRTC](x: Self) {
      
      inline def setRTCIceCandidate(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any
      ): Self = StObject.set(x, "RTCIceCandidate", value.asInstanceOf[js.Any])
      
      inline def setRTCPeerConnection(value: TypeofRTCPeerConnection): Self = StObject.set(x, "RTCPeerConnection", value.asInstanceOf[js.Any])
      
      inline def setRTCSessionDescription(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
      ): Self = StObject.set(x, "RTCSessionDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebRTCInitiatorInit
    extends StObject
       with WebRTCPeerInit {
    
    var dataChannelInit: js.UndefOr[RTCDataChannelInit] = js.undefined
    
    var dataChannelLabel: js.UndefOr[String] = js.undefined
    
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.undefined
  }
  object WebRTCInitiatorInit {
    
    inline def apply(): WebRTCInitiatorInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebRTCInitiatorInit]
    }
    
    extension [Self <: WebRTCInitiatorInit](x: Self) {
      
      inline def setDataChannelInit(value: RTCDataChannelInit): Self = StObject.set(x, "dataChannelInit", value.asInstanceOf[js.Any])
      
      inline def setDataChannelInitUndefined: Self = StObject.set(x, "dataChannelInit", js.undefined)
      
      inline def setDataChannelLabel(value: String): Self = StObject.set(x, "dataChannelLabel", value.asInstanceOf[js.Any])
      
      inline def setDataChannelLabelUndefined: Self = StObject.set(x, "dataChannelLabel", js.undefined)
      
      inline def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      inline def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
    }
  }
  
  trait WebRTCPeerEvents extends StObject {
    
    var close: CustomEvent[Any]
    
    var error: CustomEvent[js.Error]
    
    var `ice-candidate`: CustomEvent[Any]
    
    var ready: CustomEvent[Any]
    
    var signal: CustomEvent[Signal]
  }
  object WebRTCPeerEvents {
    
    inline def apply(
      close: CustomEvent[Any],
      error: CustomEvent[js.Error],
      `ice-candidate`: CustomEvent[Any],
      ready: CustomEvent[Any],
      signal: CustomEvent[Signal]
    ): WebRTCPeerEvents = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.updateDynamic("ice-candidate")(`ice-candidate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCPeerEvents]
    }
    
    extension [Self <: WebRTCPeerEvents](x: Self) {
      
      inline def setClose(value: CustomEvent[Any]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setError(value: CustomEvent[js.Error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def `setIce-candidate`(value: CustomEvent[Any]): Self = StObject.set(x, "ice-candidate", value.asInstanceOf[js.Any])
      
      inline def setReady(value: CustomEvent[Any]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: CustomEvent[Signal]): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebRTCPeerInit extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var peerConnectionConfig: js.UndefOr[RTCConfiguration] = js.undefined
    
    var wrtc: js.UndefOr[WRTC] = js.undefined
  }
  object WebRTCPeerInit {
    
    inline def apply(): WebRTCPeerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebRTCPeerInit]
    }
    
    extension [Self <: WebRTCPeerInit](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPeerConnectionConfig(value: RTCConfiguration): Self = StObject.set(x, "peerConnectionConfig", value.asInstanceOf[js.Any])
      
      inline def setPeerConnectionConfigUndefined: Self = StObject.set(x, "peerConnectionConfig", js.undefined)
      
      inline def setWrtc(value: WRTC): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  trait WebRTCReceiverInit
    extends StObject
       with WebRTCPeerInit {
    
    var answerOptions: js.UndefOr[RTCAnswerOptions] = js.undefined
  }
  object WebRTCReceiverInit {
    
    inline def apply(): WebRTCReceiverInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebRTCReceiverInit]
    }
    
    extension [Self <: WebRTCReceiverInit](x: Self) {
      
      inline def setAnswerOptions(value: RTCAnswerOptions): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
      
      inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
    }
  }
}
