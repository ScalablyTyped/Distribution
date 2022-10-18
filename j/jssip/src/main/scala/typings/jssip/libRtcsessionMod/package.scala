package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CallListener = IncomingListener | OutgoingListener

type ConfirmedListener = IncomingConfirmedListener | OutgoingConfirmedListener

type ConnectingListener = js.Function1[/* event */ ConnectingEvent, Unit]

type DTMFListener = IncomingDTMFListener | OutgoingDTMFListener

type EndListener = js.Function1[/* event */ EndEvent, Unit]

type HoldListener = js.Function1[/* event */ HoldEvent, Unit]

type IceCandidateListener = js.Function1[/* event */ IceCandidateEvent, Unit]

type IncomingConfirmedListener = js.Function1[/* event */ IncomingAckEvent, Unit]

type IncomingDTMFListener = js.Function1[/* event */ IncomingDTMFEvent, Unit]

type IncomingInfoListener = js.Function1[/* event */ IncomingInfoEvent, Unit]

type IncomingListener = js.Function1[/* event */ IncomingEvent, Unit]

type InfoListener = IncomingInfoListener | OutgoingInfoListener

type MuteListener = js.Function1[/* event */ MediaConstraints, Unit]

type OutgoingConfirmedListener = js.Function1[/* event */ OutgoingAckEvent, Unit]

type OutgoingDTMFListener = js.Function1[/* event */ OutgoingDTMFEvent, Unit]

type OutgoingInfoListener = js.Function1[/* event */ OutgoingInfoEvent, Unit]

type OutgoingListener = js.Function1[/* event */ OutgoingEvent, Unit]

type PeerConnectionListener = js.Function1[/* event */ PeerConnectionEvent, Unit]

type ReInviteListener = js.Function1[/* event */ ReInviteEvent, Unit]

type ReferListener = js.Function1[/* event */ ReferEvent, Unit]

type SDPListener = js.Function1[/* event */ SDPEvent, Unit]

type SendingListener = js.Function1[/* event */ SendingEvent, Unit]

type UpdateListener = ReInviteListener
