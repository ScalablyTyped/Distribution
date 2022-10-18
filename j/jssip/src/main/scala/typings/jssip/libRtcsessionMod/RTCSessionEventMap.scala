package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSessionEventMap extends StObject {
  
  var accepted: CallListener
  
  var confirmed: ConfirmedListener
  
  def connecting(event: ConnectingEvent): Unit
  @JSName("connecting")
  var connecting_Original: ConnectingListener
  
  def ended(event: EndEvent): Unit
  @JSName("ended")
  var ended_Original: EndListener
  
  def failed(event: EndEvent): Unit
  @JSName("failed")
  var failed_Original: EndListener
  
  def getusermediafailed(args: Any*): Unit
  @JSName("getusermediafailed")
  var getusermediafailed_Original: AnyListener
  
  def hold(event: HoldEvent): Unit
  @JSName("hold")
  var hold_Original: HoldListener
  
  def icecandidate(event: IceCandidateEvent): Unit
  @JSName("icecandidate")
  var icecandidate_Original: IceCandidateListener
  
  def muted(event: MediaConstraints): Unit
  @JSName("muted")
  var muted_Original: MuteListener
  
  var newDTMF: DTMFListener
  
  var newInfo: InfoListener
  
  def peerconnection(event: PeerConnectionEvent): Unit
  
  @JSName("peerconnection:createanswerfailed")
  def peerconnectionColoncreateanswerfailed(args: Any*): Unit
  @JSName("peerconnection:createanswerfailed")
  var peerconnectionColoncreateanswerfailed_Original: AnyListener
  
  @JSName("peerconnection:createofferfailed")
  def peerconnectionColoncreateofferfailed(args: Any*): Unit
  @JSName("peerconnection:createofferfailed")
  var peerconnectionColoncreateofferfailed_Original: AnyListener
  
  @JSName("peerconnection:setlocaldescriptionfailed")
  def peerconnectionColonsetlocaldescriptionfailed(args: Any*): Unit
  @JSName("peerconnection:setlocaldescriptionfailed")
  var peerconnectionColonsetlocaldescriptionfailed_Original: AnyListener
  
  @JSName("peerconnection:setremotedescriptionfailed")
  def peerconnectionColonsetremotedescriptionfailed(args: Any*): Unit
  @JSName("peerconnection:setremotedescriptionfailed")
  var peerconnectionColonsetremotedescriptionfailed_Original: AnyListener
  
  @JSName("peerconnection")
  var peerconnection_Original: PeerConnectionListener
  
  var progress: CallListener
  
  def refer(event: ReferEvent): Unit
  @JSName("refer")
  var refer_Original: ReferListener
  
  def reinvite(event: ReInviteEvent): Unit
  @JSName("reinvite")
  var reinvite_Original: ReInviteListener
  
  def replaces(event: ReferEvent): Unit
  @JSName("replaces")
  var replaces_Original: ReferListener
  
  def sdp(event: SDPEvent): Unit
  @JSName("sdp")
  var sdp_Original: SDPListener
  
  def sending(event: SendingEvent): Unit
  @JSName("sending")
  var sending_Original: SendingListener
  
  def unhold(event: HoldEvent): Unit
  @JSName("unhold")
  var unhold_Original: HoldListener
  
  def unmuted(event: MediaConstraints): Unit
  @JSName("unmuted")
  var unmuted_Original: MuteListener
  
  def update(event: ReInviteEvent): Unit
  @JSName("update")
  var update_Original: UpdateListener
}
object RTCSessionEventMap {
  
  inline def apply(
    accepted: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Unit,
    confirmed: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent) => Unit,
    connecting: /* event */ ConnectingEvent => Unit,
    ended: /* event */ EndEvent => Unit,
    failed: /* event */ EndEvent => Unit,
    getusermediafailed: AnyListener,
    hold: /* event */ HoldEvent => Unit,
    icecandidate: /* event */ IceCandidateEvent => Unit,
    muted: /* event */ MediaConstraints => Unit,
    newDTMF: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent) => Unit,
    newInfo: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent) => Unit,
    peerconnection: /* event */ PeerConnectionEvent => Unit,
    peerconnectionColoncreateanswerfailed: AnyListener,
    peerconnectionColoncreateofferfailed: AnyListener,
    peerconnectionColonsetlocaldescriptionfailed: AnyListener,
    peerconnectionColonsetremotedescriptionfailed: AnyListener,
    progress: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Unit,
    refer: /* event */ ReferEvent => Unit,
    reinvite: /* event */ ReInviteEvent => Unit,
    replaces: /* event */ ReferEvent => Unit,
    sdp: /* event */ SDPEvent => Unit,
    sending: /* event */ SendingEvent => Unit,
    unhold: /* event */ HoldEvent => Unit,
    unmuted: /* event */ MediaConstraints => Unit,
    update: /* event */ ReInviteEvent => Unit
  ): RTCSessionEventMap = {
    val __obj = js.Dynamic.literal(accepted = js.Any.fromFunction1(accepted), confirmed = js.Any.fromFunction1(confirmed), connecting = js.Any.fromFunction1(connecting), ended = js.Any.fromFunction1(ended), failed = js.Any.fromFunction1(failed), getusermediafailed = getusermediafailed.asInstanceOf[js.Any], hold = js.Any.fromFunction1(hold), icecandidate = js.Any.fromFunction1(icecandidate), muted = js.Any.fromFunction1(muted), newDTMF = js.Any.fromFunction1(newDTMF), newInfo = js.Any.fromFunction1(newInfo), peerconnection = js.Any.fromFunction1(peerconnection), progress = js.Any.fromFunction1(progress), refer = js.Any.fromFunction1(refer), reinvite = js.Any.fromFunction1(reinvite), replaces = js.Any.fromFunction1(replaces), sdp = js.Any.fromFunction1(sdp), sending = js.Any.fromFunction1(sending), unhold = js.Any.fromFunction1(unhold), unmuted = js.Any.fromFunction1(unmuted), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("peerconnection:createanswerfailed")(peerconnectionColoncreateanswerfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:createofferfailed")(peerconnectionColoncreateofferfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:setlocaldescriptionfailed")(peerconnectionColonsetlocaldescriptionfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:setremotedescriptionfailed")(peerconnectionColonsetremotedescriptionfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionEventMap]
  }
  
  extension [Self <: RTCSessionEventMap](x: Self) {
    
    inline def setAccepted(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Unit): Self = StObject.set(x, "accepted", js.Any.fromFunction1(value))
    
    inline def setConfirmed(value: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent) => Unit): Self = StObject.set(x, "confirmed", js.Any.fromFunction1(value))
    
    inline def setConnecting(value: /* event */ ConnectingEvent => Unit): Self = StObject.set(x, "connecting", js.Any.fromFunction1(value))
    
    inline def setEnded(value: /* event */ EndEvent => Unit): Self = StObject.set(x, "ended", js.Any.fromFunction1(value))
    
    inline def setFailed(value: /* event */ EndEvent => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction1(value))
    
    inline def setGetusermediafailed(value: AnyListener): Self = StObject.set(x, "getusermediafailed", value.asInstanceOf[js.Any])
    
    inline def setHold(value: /* event */ HoldEvent => Unit): Self = StObject.set(x, "hold", js.Any.fromFunction1(value))
    
    inline def setIcecandidate(value: /* event */ IceCandidateEvent => Unit): Self = StObject.set(x, "icecandidate", js.Any.fromFunction1(value))
    
    inline def setMuted(value: /* event */ MediaConstraints => Unit): Self = StObject.set(x, "muted", js.Any.fromFunction1(value))
    
    inline def setNewDTMF(value: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent) => Unit): Self = StObject.set(x, "newDTMF", js.Any.fromFunction1(value))
    
    inline def setNewInfo(value: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent) => Unit): Self = StObject.set(x, "newInfo", js.Any.fromFunction1(value))
    
    inline def setPeerconnection(value: /* event */ PeerConnectionEvent => Unit): Self = StObject.set(x, "peerconnection", js.Any.fromFunction1(value))
    
    inline def setPeerconnectionColoncreateanswerfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createanswerfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColoncreateofferfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createofferfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColonsetlocaldescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setlocaldescriptionfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColonsetremotedescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setremotedescriptionfailed", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setRefer(value: /* event */ ReferEvent => Unit): Self = StObject.set(x, "refer", js.Any.fromFunction1(value))
    
    inline def setReinvite(value: /* event */ ReInviteEvent => Unit): Self = StObject.set(x, "reinvite", js.Any.fromFunction1(value))
    
    inline def setReplaces(value: /* event */ ReferEvent => Unit): Self = StObject.set(x, "replaces", js.Any.fromFunction1(value))
    
    inline def setSdp(value: /* event */ SDPEvent => Unit): Self = StObject.set(x, "sdp", js.Any.fromFunction1(value))
    
    inline def setSending(value: /* event */ SendingEvent => Unit): Self = StObject.set(x, "sending", js.Any.fromFunction1(value))
    
    inline def setUnhold(value: /* event */ HoldEvent => Unit): Self = StObject.set(x, "unhold", js.Any.fromFunction1(value))
    
    inline def setUnmuted(value: /* event */ MediaConstraints => Unit): Self = StObject.set(x, "unmuted", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: /* event */ ReInviteEvent => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
