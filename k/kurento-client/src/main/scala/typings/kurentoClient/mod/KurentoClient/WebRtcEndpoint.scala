package typings.kurentoClient.mod.KurentoClient

import typings.std.RTCIceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRtcEndpoint
  extends ClientInstance
     with MediaObject
     with MediaElement {
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidate, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def closeDataChannel(channelId: Double): js.Promise[Unit] = js.native
  def closeDataChannel(channelId: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def createDataChannel(
    label: js.UndefOr[String],
    ordered: js.UndefOr[Boolean],
    maxPacketLifeTime: js.UndefOr[Double],
    maxRetransmits: js.UndefOr[Double],
    protocol: js.UndefOr[String],
    callback: js.UndefOr[Callback[Unit]]
  ): js.Promise[Unit] = js.native
  def gatherCandidates(): js.Promise[Unit] = js.native
  def gatherCandidates(callback: Callback[Unit]): js.Promise[Unit] = js.native
  def getConnectionState(): js.Promise[_] = js.native
  def getConnectionState(callback: Callback[_]): js.Promise[_] = js.native
  def getICECandidatePairs(): js.Promise[_] = js.native
  def getICECandidatePairs(callback: Callback[_]): js.Promise[_] = js.native
  def getIceConnectionState(): js.Promise[IceConnection] = js.native
  def getIceConnectionState(callback: Callback[IceConnection]): js.Promise[IceConnection] = js.native
  def getMaxAudioRecvBandwidth(): js.Promise[Double] = js.native
  def getMaxAudioRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMaxOutputBitrate(): js.Promise[Double] = js.native
  def getMaxOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMaxVideoRecvBandwidth(): js.Promise[Double] = js.native
  def getMaxVideoRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMaxVideoSendBandwidth(): js.Promise[Double] = js.native
  def getMaxVideoSendBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMediaState(): js.Promise[_] = js.native
  def getMediaState(callback: Callback[Double]): js.Promise[_] = js.native
  def getMinOutputBitrate(): js.Promise[Double] = js.native
  def getMinOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMinVideoRecvBandwidth(): js.Promise[Double] = js.native
  def getMinVideoRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMinVideoSendBandwidth(): js.Promise[Double] = js.native
  def getMinVideoSendBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  def getStunServerAddress(): js.Promise[String] = js.native
  def getStunServerAddress(callback: Callback[String]): js.Promise[String] = js.native
  def getStunServerPort(): js.Promise[Double] = js.native
  def getStunServerPort(callback: Callback[Double]): js.Promise[Double] = js.native
  def getTurnUrl(): js.Promise[String] = js.native
  def getTurnUrl(callback: Callback[String]): js.Promise[String] = js.native
  def processOffer(offer: String): js.Promise[String] = js.native
  def processOffer(offer: String, callback: Callback[String]): js.Promise[String] = js.native
  def setMaxAudioRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxAudioRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMaxOutputBitrate(value: Double): js.Promise[Unit] = js.native
  def setMaxOutputBitrate(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMaxVideoRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxVideoRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMaxVideoSendBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxVideoSendBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMinOutputBitrate(value: Double): js.Promise[Unit] = js.native
  def setMinOutputBitrate(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMinVideoRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMinVideoRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMinVideoSendBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMinVideoSendBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setStunServerAddress(server: String): js.Promise[Unit] = js.native
  def setStunServerAddress(server: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setStunServerPort(port: Double): js.Promise[Unit] = js.native
  def setStunServerPort(port: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setTurnUrl(url: String): js.Promise[Unit] = js.native
  def setTurnUrl(url: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
}

