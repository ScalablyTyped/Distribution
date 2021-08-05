package typings.kurentoUtils

import typings.kurentoUtils.kurentoUtilsStrings.recv
import typings.kurentoUtils.kurentoUtilsStrings.send
import typings.kurentoUtils.kurentoUtilsStrings.sendRecv
import typings.node.eventsMod.EventEmitter
import typings.std.MediaStream
import typings.std.RTCIceCandidate
import typings.std.RTCPeerConnection
import typings.std.RTCSessionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kurento-utils", "WebRtcPeer")
  @js.native
  class WebRtcPeer protected () extends EventEmitter {
    def this(mode: recv) = this()
    def this(mode: send) = this()
    def this(mode: sendRecv) = this()
    def this(mode: recv, options: js.Object) = this()
    def this(mode: sendRecv, options: js.Object) = this()
    def this(mode: send, options: js.Object) = this()
    def this(mode: recv, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    def this(mode: recv, options: Unit, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    def this(mode: sendRecv, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    def this(mode: sendRecv, options: Unit, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    def this(mode: send, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    def this(mode: send, options: Unit, callback: js.Function1[/* error */ js.UndefOr[String], Unit]) = this()
    
    /**
      * Callback function invoked when an ICE candidate is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
      *
      * @param iceCandidate Literal object with the ICE candidate description
      * @param callback It is a function with error like parameter. It is called when the ICE candidate has been added.
      */
    def addIceCandidate(iceCandidate: RTCIceCandidate): Unit = js.native
    def addIceCandidate(iceCandidate: RTCIceCandidate, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): Unit = js.native
    
    /**
      * This method frees the resources used by WebRtcPeer.
      */
    def dispose(): Unit = js.native
    
    /**
      * Creates an offer that is a request to find a remote peer with a specific configuration.
      */
    def generateOffer(callback: js.Function2[/* error */ js.UndefOr[String], /* sdp */ String, Unit]): Unit = js.native
    
    /**
      * Using this method the user can get peerconnection’s local session descriptor.
      */
    def getLocalSessionDescriptor(): RTCSessionDescription = js.native
    
    /**
      * Using this method the user can get the local stream. You can use muted property to silence the audio, if this property is true.
      */
    def getLocalStream(): MediaStream = js.native
    
    /**
      * Using this method the user can get peerconnection’s remote session descriptor.
      */
    def getRemoteSessionDescriptor(): RTCSessionDescription = js.native
    
    /**
      * Using this method the user can get the remote stream.
      */
    def getRemoteStream(): MediaStream = js.native
    
    /**
      * Using this property the user can get the peerConnection and use it directly.
      */
    var peerConnection: RTCPeerConnection = js.native
    
    /**
      * Callback function invoked when a SDP answer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
      *
      * @param sdpAnswer Description of sdpAnswer
      * @param callback It is a function with error like parameter. It is called when the remote description has been set successfully.
      */
    def processAnswer(sdpAnswer: String): Unit = js.native
    def processAnswer(sdpAnswer: String, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): Unit = js.native
    
    /**
      * Callback function invoked when a SDP offer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
      *
      * @param sdpOffer Description of sdpOffer
      * @param callback It is a function with error and sdpAnswer like parameters. It is called when the remote description has been set successfully.
      */
    def processOffer(sdpOffer: String): Unit = js.native
    def processOffer(sdpOffer: String, callback: js.Function2[/* error */ js.UndefOr[String], /* sdp */ String, Unit]): Unit = js.native
    
    /**
      * Use this method for showing the local video.
      */
    def showLocalVideo(): Unit = js.native
  }
  /* static members */
  object WebRtcPeer {
    
    @JSImport("kurento-utils", "WebRtcPeer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a WebRtcPeer as receive only.
      */
    inline def WebRtcPeerRecvonly(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): WebRtcPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("WebRtcPeerRecvonly")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebRtcPeer]
    
    /**
      * Create a WebRtcPeer as send only.
      */
    inline def WebRtcPeerSendonly(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): WebRtcPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("WebRtcPeerSendonly")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebRtcPeer]
    
    /**
      * Create a WebRtcPeer as send and receive.
      */
    inline def WebRtcPeerSendrecv(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): WebRtcPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("WebRtcPeerSendrecv")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebRtcPeer]
  }
}
