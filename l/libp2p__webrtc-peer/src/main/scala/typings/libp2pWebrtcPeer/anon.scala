package typings.libp2pWebrtcPeer

import typings.libp2pWebrtcPeer.mod.WRTC
import typings.std.AlgorithmIdentifier
import typings.std.RTCCertificate
import typings.std.RTCConfiguration
import typings.std.RTCDataChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Candidate extends StObject {
    
    var candidate: String
    
    var sdpMLineIndex: js.UndefOr[Double] = js.undefined
    
    var sdpMid: js.UndefOr[String] = js.undefined
  }
  object Candidate {
    
    inline def apply(candidate: String): Candidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Candidate]
    }
    
    extension [Self <: Candidate](x: Self) {
      
      inline def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
      
      inline def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
      
      inline def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    }
  }
  
  trait Channel extends StObject {
    
    var channel: js.UndefOr[RTCDataChannel] = js.undefined
  }
  object Channel {
    
    inline def apply(): Channel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    }
  }
  
  trait TypeofRTCPeerConnection extends StObject {
    
    /* standard dom */
    def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[RTCCertificate]
  }
  object TypeofRTCPeerConnection {
    
    inline def apply(generateCertificate: AlgorithmIdentifier => js.Promise[RTCCertificate]): TypeofRTCPeerConnection = {
      val __obj = js.Dynamic.literal(generateCertificate = js.Any.fromFunction1(generateCertificate))
      __obj.asInstanceOf[TypeofRTCPeerConnection]
    }
    
    extension [Self <: TypeofRTCPeerConnection](x: Self) {
      
      inline def setGenerateCertificate(value: AlgorithmIdentifier => js.Promise[RTCCertificate]): Self = StObject.set(x, "generateCertificate", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined @libp2p/webrtc-peer.@libp2p/webrtc-peer.WebRTCPeerInit & {  logPrefix :string} */
  trait WebRTCPeerInitlogPrefixst extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var logPrefix: String
    
    var peerConnectionConfig: js.UndefOr[RTCConfiguration] = js.undefined
    
    var wrtc: js.UndefOr[WRTC] = js.undefined
  }
  object WebRTCPeerInitlogPrefixst {
    
    inline def apply(logPrefix: String): WebRTCPeerInitlogPrefixst = {
      val __obj = js.Dynamic.literal(logPrefix = logPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCPeerInitlogPrefixst]
    }
    
    extension [Self <: WebRTCPeerInitlogPrefixst](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLogPrefix(value: String): Self = StObject.set(x, "logPrefix", value.asInstanceOf[js.Any])
      
      inline def setPeerConnectionConfig(value: RTCConfiguration): Self = StObject.set(x, "peerConnectionConfig", value.asInstanceOf[js.Any])
      
      inline def setPeerConnectionConfigUndefined: Self = StObject.set(x, "peerConnectionConfig", js.undefined)
      
      inline def setWrtc(value: WRTC): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
}
