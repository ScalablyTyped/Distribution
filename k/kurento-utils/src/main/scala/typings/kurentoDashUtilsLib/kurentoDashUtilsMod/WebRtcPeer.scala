package typings
package kurentoDashUtilsLib.kurentoDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kurento-utils", "WebRtcPeer")
@js.native
class WebRtcPeer protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.recv) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.send) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.sendRecv) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.recv, options: js.Object) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.sendRecv, options: js.Object) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.send, options: js.Object) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.recv, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.sendRecv, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]) = this()
  def this(mode: kurentoDashUtilsLib.kurentoDashUtilsLibStrings.send, options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]) = this()
  /**
       * Using this property the user can get the peerConnection and use it directly.
       */
  var peerConnection: stdLib.RTCPeerConnection = js.native
  /**
       * Callback function invoked when an ICE candidate is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param iceCandidate Literal object with the ICE candidate description
       * @param callback It is a function with error like parameter. It is called when the ICE candidate has been added.
       */
  def addIceCandidate(iceCandidate: stdLib.RTCIceCandidate): scala.Unit = js.native
  /**
       * Callback function invoked when an ICE candidate is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param iceCandidate Literal object with the ICE candidate description
       * @param callback It is a function with error like parameter. It is called when the ICE candidate has been added.
       */
  def addIceCandidate(
    iceCandidate: stdLib.RTCIceCandidate,
    callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
       * This method frees the resources used by WebRtcPeer.
       */
  def dispose(): scala.Unit = js.native
  /**
       * Creates an offer that is a request to find a remote peer with a specific configuration.
       */
  def generateOffer(
    callback: js.Function2[/* error */ js.UndefOr[java.lang.String], /* sdp */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Using this method the user can get peerconnection’s local session descriptor.
       */
  def getLocalSessionDescriptor(): stdLib.RTCSessionDescription = js.native
  /**
       * Using this method the user can get the local stream. You can use muted property to silence the audio, if this property is true.
       */
  def getLocalStream(): stdLib.MediaStream = js.native
  /**
       * Using this method the user can get peerconnection’s remote session descriptor.
       */
  def getRemoteSessionDescriptor(): stdLib.RTCSessionDescription = js.native
  /**
       * Using this method the user can get the remote stream.
       */
  def getRemoteStream(): stdLib.MediaStream = js.native
  /**
       * Callback function invoked when a SDP answer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param sdpAnswer Description of sdpAnswer
       * @param callback It is a function with error like parameter. It is called when the remote description has been set successfully.
       */
  def processAnswer(sdpAnswer: java.lang.String): scala.Unit = js.native
  /**
       * Callback function invoked when a SDP answer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param sdpAnswer Description of sdpAnswer
       * @param callback It is a function with error like parameter. It is called when the remote description has been set successfully.
       */
  def processAnswer(
    sdpAnswer: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Callback function invoked when a SDP offer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param sdpOffer Description of sdpOffer
       * @param callback It is a function with error and sdpAnswer like parameters. It is called when the remote description has been set successfully.
       */
  def processOffer(sdpOffer: java.lang.String): scala.Unit = js.native
  /**
       * Callback function invoked when a SDP offer is received. Developers are expected to invoke this function in order to complete the SDP negotiation. This method has two parameters:
       *
       * @param sdpOffer Description of sdpOffer
       * @param callback It is a function with error and sdpAnswer like parameters. It is called when the remote description has been set successfully.
       */
  def processOffer(
    sdpOffer: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[java.lang.String], /* sdp */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Use this method for showing the local video.
       */
  def showLocalVideo(): scala.Unit = js.native
}

@JSImport("kurento-utils", "WebRtcPeer")
@js.native
object WebRtcPeer extends js.Object {
  /**
       * Create a WebRtcPeer as receive only.
       */
  def WebRtcPeerRecvonly(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]): kurentoDashUtilsLib.kurentoDashUtilsMod.WebRtcPeer = js.native
  /**
       * Create a WebRtcPeer as send only.
       */
  def WebRtcPeerSendonly(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]): kurentoDashUtilsLib.kurentoDashUtilsMod.WebRtcPeer = js.native
  /**
       * Create a WebRtcPeer as send and receive.
       */
  def WebRtcPeerSendrecv(options: js.Object, callback: js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]): kurentoDashUtilsLib.kurentoDashUtilsMod.WebRtcPeer = js.native
}

