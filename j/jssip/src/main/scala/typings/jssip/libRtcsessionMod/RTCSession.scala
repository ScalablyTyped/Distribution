package typings.jssip.libRtcsessionMod

import typings.events.mod.EventEmitter
import typings.events.mod.Listener
import typings.jssip.jssipStrings.accepted
import typings.jssip.jssipStrings.confirmed
import typings.jssip.jssipStrings.connecting
import typings.jssip.jssipStrings.ended
import typings.jssip.jssipStrings.failed
import typings.jssip.jssipStrings.getusermediafailed
import typings.jssip.jssipStrings.hold
import typings.jssip.jssipStrings.icecandidate
import typings.jssip.jssipStrings.muted
import typings.jssip.jssipStrings.newDTMF
import typings.jssip.jssipStrings.newInfo
import typings.jssip.jssipStrings.peerconnection
import typings.jssip.jssipStrings.peerconnectionColoncreateanswerfailed
import typings.jssip.jssipStrings.peerconnectionColoncreateofferfailed
import typings.jssip.jssipStrings.peerconnectionColonsetlocaldescriptionfailed
import typings.jssip.jssipStrings.peerconnectionColonsetremotedescriptionfailed
import typings.jssip.jssipStrings.progress
import typings.jssip.jssipStrings.refer
import typings.jssip.jssipStrings.reinvite
import typings.jssip.jssipStrings.replaces
import typings.jssip.jssipStrings.sdp
import typings.jssip.jssipStrings.sending
import typings.jssip.jssipStrings.unhold
import typings.jssip.jssipStrings.unmuted
import typings.jssip.jssipStrings.update
import typings.jssip.libNameAddrHeaderMod.NameAddrHeader
import typings.jssip.libUriMod.URI
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip/lib/RTCSession", "RTCSession")
@js.native
open class RTCSession () extends EventEmitter {
  
  def C: Any = js.native
  
  def answer(): Unit = js.native
  def answer(options: AnswerOptions): Unit = js.native
  
  def causes: Any = js.native
  
  def connection: RTCPeerConnectionDeprecated = js.native
  
  def contact: String = js.native
  
  def data: Any = js.native
  def data_=(_data: Any): Unit = js.native
  
  def direction: SessionDirection = js.native
  
  def end_time: js.Date = js.native
  
  def hold(): Boolean = js.native
  def hold(options: Unit, done: VoidFunction): Boolean = js.native
  def hold(options: HoldOptions): Boolean = js.native
  def hold(options: HoldOptions, done: VoidFunction): Boolean = js.native
  
  def id: String = js.native
  
  def isEnded(): Boolean = js.native
  
  def isEstablished(): Boolean = js.native
  
  def isInProgress(): Boolean = js.native
  
  def isMuted(): MediaConstraints = js.native
  
  def isOnHold(): OnHoldResult = js.native
  
  def isReadyToReOffer(): Boolean = js.native
  
  def local_identity: NameAddrHeader = js.native
  
  def mute(): Unit = js.native
  def mute(options: MediaConstraints): Unit = js.native
  
  @JSName("on")
  def on_accepted(`type`: accepted, listener: CallListener): this.type = js.native
  @JSName("on")
  def on_confirmed(`type`: confirmed, listener: ConfirmedListener): this.type = js.native
  @JSName("on")
  def on_connecting(`type`: connecting, listener: ConnectingListener): this.type = js.native
  @JSName("on")
  def on_ended(`type`: ended, listener: EndListener): this.type = js.native
  @JSName("on")
  def on_failed(`type`: failed, listener: EndListener): this.type = js.native
  @JSName("on")
  def on_getusermediafailed(`type`: getusermediafailed, listener: Listener): this.type = js.native
  @JSName("on")
  def on_hold(`type`: hold, listener: HoldListener): this.type = js.native
  @JSName("on")
  def on_icecandidate(`type`: icecandidate, listener: IceCandidateListener): this.type = js.native
  @JSName("on")
  def on_muted(`type`: muted, listener: MuteListener): this.type = js.native
  @JSName("on")
  def on_newDTMF(`type`: newDTMF, listener: DTMFListener): this.type = js.native
  @JSName("on")
  def on_newInfo(`type`: newInfo, listener: InfoListener): this.type = js.native
  @JSName("on")
  def on_peerconnection(`type`: peerconnection, listener: PeerConnectionListener): this.type = js.native
  @JSName("on")
  def on_peerconnectioncreateanswerfailed(`type`: peerconnectionColoncreateanswerfailed, listener: Listener): this.type = js.native
  @JSName("on")
  def on_peerconnectioncreateofferfailed(`type`: peerconnectionColoncreateofferfailed, listener: Listener): this.type = js.native
  @JSName("on")
  def on_peerconnectionsetlocaldescriptionfailed(`type`: peerconnectionColonsetlocaldescriptionfailed, listener: Listener): this.type = js.native
  @JSName("on")
  def on_peerconnectionsetremotedescriptionfailed(`type`: peerconnectionColonsetremotedescriptionfailed, listener: Listener): this.type = js.native
  @JSName("on")
  def on_progress(`type`: progress, listener: CallListener): this.type = js.native
  @JSName("on")
  def on_refer(`type`: refer, listener: ReferListener): this.type = js.native
  @JSName("on")
  def on_reinvite(`type`: reinvite, listener: ReInviteListener): this.type = js.native
  @JSName("on")
  def on_replaces(`type`: replaces, listener: ReferListener): this.type = js.native
  @JSName("on")
  def on_sdp(`type`: sdp, listener: SDPListener): this.type = js.native
  @JSName("on")
  def on_sending(`type`: sending, listener: SendingListener): this.type = js.native
  @JSName("on")
  def on_unhold(`type`: unhold, listener: HoldListener): this.type = js.native
  @JSName("on")
  def on_unmuted(`type`: unmuted, listener: MuteListener): this.type = js.native
  @JSName("on")
  def on_update(`type`: update, listener: UpdateListener): this.type = js.native
  
  def refer(target: String): Unit = js.native
  def refer(target: String, options: ReferOptions): Unit = js.native
  def refer(target: URI): Unit = js.native
  def refer(target: URI, options: ReferOptions): Unit = js.native
  
  def remote_identity: NameAddrHeader = js.native
  
  def renegotiate(): Boolean = js.native
  def renegotiate(options: Unit, done: VoidFunction): Boolean = js.native
  def renegotiate(options: RenegotiateOptions): Boolean = js.native
  def renegotiate(options: RenegotiateOptions, done: VoidFunction): Boolean = js.native
  
  def resetLocalMedia(): Unit = js.native
  
  def sendDTMF(tones: String): Unit = js.native
  def sendDTMF(tones: String, options: DTFMOptions): Unit = js.native
  def sendDTMF(tones: Double): Unit = js.native
  def sendDTMF(tones: Double, options: DTFMOptions): Unit = js.native
  
  def sendInfo(contentType: String): Unit = js.native
  def sendInfo(contentType: String, body: String): Unit = js.native
  def sendInfo(contentType: String, body: String, options: ExtraHeaders): Unit = js.native
  def sendInfo(contentType: String, body: Unit, options: ExtraHeaders): Unit = js.native
  
  def start_time: js.Date = js.native
  
  def status: SessionStatus = js.native
  
  def terminate(): Unit = js.native
  def terminate(options: TerminateOptions): Unit = js.native
  
  def unhold(): Boolean = js.native
  def unhold(options: Unit, done: VoidFunction): Boolean = js.native
  def unhold(options: HoldOptions): Boolean = js.native
  def unhold(options: HoldOptions, done: VoidFunction): Boolean = js.native
  
  def unmute(): Unit = js.native
  def unmute(options: MediaConstraints): Unit = js.native
}
