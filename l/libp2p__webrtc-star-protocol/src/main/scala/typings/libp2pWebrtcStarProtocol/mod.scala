package typings.libp2pWebrtcStarProtocol

import typings.libp2pWebrtcStarProtocol.anon.Candidate
import typings.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.answer
import typings.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.candidate
import typings.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.goodbye
import typings.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.offer
import typings.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.renegotiate
import typings.socketIoClient.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  trait HandshakeSignal extends StObject {
    
    var answer: js.UndefOr[Boolean] = js.undefined
    
    var dstMultiaddr: String
    
    var err: js.UndefOr[String] = js.undefined
    
    var intentId: String
    
    var signal: Signal
    
    var srcMultiaddr: String
  }
  object HandshakeSignal {
    
    inline def apply(dstMultiaddr: String, intentId: String, signal: Signal, srcMultiaddr: String): HandshakeSignal = {
      val __obj = js.Dynamic.literal(dstMultiaddr = dstMultiaddr.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], srcMultiaddr = srcMultiaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakeSignal]
    }
    
    extension [Self <: HandshakeSignal](x: Self) {
      
      inline def setAnswer(value: Boolean): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
      
      inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      
      inline def setDstMultiaddr(value: String): Self = StObject.set(x, "dstMultiaddr", value.asInstanceOf[js.Any])
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setIntentId(value: String): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: Signal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSrcMultiaddr(value: String): Self = StObject.set(x, "srcMultiaddr", value.asInstanceOf[js.Any])
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
    - typings.libp2pWebrtcStarProtocol.mod.OfferSignal
    - typings.libp2pWebrtcStarProtocol.mod.AnswerSignal
    - typings.libp2pWebrtcStarProtocol.mod.CandidateSignal
    - typings.libp2pWebrtcStarProtocol.mod.RenegotiateSignal
    - typings.libp2pWebrtcStarProtocol.mod.GoodbyeSignal
  */
  trait Signal extends StObject
  object Signal {
    
    inline def AnswerSignal(sdp: String): typings.libp2pWebrtcStarProtocol.mod.AnswerSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("answer")
      __obj.asInstanceOf[typings.libp2pWebrtcStarProtocol.mod.AnswerSignal]
    }
    
    inline def CandidateSignal(candidate: Candidate): typings.libp2pWebrtcStarProtocol.mod.CandidateSignal = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[typings.libp2pWebrtcStarProtocol.mod.CandidateSignal]
    }
    
    inline def GoodbyeSignal(): typings.libp2pWebrtcStarProtocol.mod.GoodbyeSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("goodbye")
      __obj.asInstanceOf[typings.libp2pWebrtcStarProtocol.mod.GoodbyeSignal]
    }
    
    inline def OfferSignal(sdp: String): typings.libp2pWebrtcStarProtocol.mod.OfferSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("offer")
      __obj.asInstanceOf[typings.libp2pWebrtcStarProtocol.mod.OfferSignal]
    }
    
    inline def RenegotiateSignal(): typings.libp2pWebrtcStarProtocol.mod.RenegotiateSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[typings.libp2pWebrtcStarProtocol.mod.RenegotiateSignal]
    }
  }
  
  trait SocketEvents extends StObject {
    
    def close(): Unit
    
    def error(err: js.Error): Unit
    
    def listening(): Unit
    
    def `ss-handshake`(offer: HandshakeSignal): Unit
    
    def `ss-join`(maStr: String): Unit
    
    def `ss-leave`(maStr: String): Unit
    
    def `ws-handshake`(offer: HandshakeSignal): Unit
    
    def `ws-peer`(maStr: String): Unit
  }
  object SocketEvents {
    
    inline def apply(
      close: () => Unit,
      error: js.Error => Unit,
      listening: () => Unit,
      `ss-handshake`: HandshakeSignal => Unit,
      `ss-join`: String => Unit,
      `ss-leave`: String => Unit,
      `ws-handshake`: HandshakeSignal => Unit,
      `ws-peer`: String => Unit
    ): SocketEvents = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), error = js.Any.fromFunction1(error), listening = js.Any.fromFunction0(listening))
      __obj.updateDynamic("ss-handshake")(js.Any.fromFunction1(`ss-handshake`))
      __obj.updateDynamic("ss-join")(js.Any.fromFunction1(`ss-join`))
      __obj.updateDynamic("ss-leave")(js.Any.fromFunction1(`ss-leave`))
      __obj.updateDynamic("ws-handshake")(js.Any.fromFunction1(`ws-handshake`))
      __obj.updateDynamic("ws-peer")(js.Any.fromFunction1(`ws-peer`))
      __obj.asInstanceOf[SocketEvents]
    }
    
    extension [Self <: SocketEvents](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setListening(value: () => Unit): Self = StObject.set(x, "listening", js.Any.fromFunction0(value))
      
      inline def `setSs-handshake`(value: HandshakeSignal => Unit): Self = StObject.set(x, "ss-handshake", js.Any.fromFunction1(value))
      
      inline def `setSs-join`(value: String => Unit): Self = StObject.set(x, "ss-join", js.Any.fromFunction1(value))
      
      inline def `setSs-leave`(value: String => Unit): Self = StObject.set(x, "ss-leave", js.Any.fromFunction1(value))
      
      inline def `setWs-handshake`(value: HandshakeSignal => Unit): Self = StObject.set(x, "ws-handshake", js.Any.fromFunction1(value))
      
      inline def `setWs-peer`(value: String => Unit): Self = StObject.set(x, "ws-peer", js.Any.fromFunction1(value))
    }
  }
  
  type WebRTCStarSocket = Socket[SocketEvents, SocketEvents]
}
