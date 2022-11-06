package typings.jssip.libUAMod

import typings.jssip.anon.Event
import typings.jssip.libWebSocketInterfaceMod.DisconnectEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ConnectedListener = js.Function1[/* event */ ConnectedEvent, Unit]

type DisconnectedListener = js.Function1[/* event */ DisconnectEvent, Unit]

type IncomingMessageListener = js.Function1[/* event */ IncomingMessageEvent, Unit]

type IncomingOptionsListener = js.Function1[/* event */ IncomingOptionsEvent, Unit]

type IncomingRTCSessionListener = js.Function1[/* event */ IncomingRTCSessionEvent, Unit]

type MessageListener = IncomingMessageListener | OutgoingMessageListener

type OptionsListener = IncomingOptionsListener | OutgoingOptionsListener

type OutgoingMessageListener = js.Function1[/* event */ OutgoingMessageEvent, Unit]

type OutgoingOptionsListener = js.Function1[/* event */ OutgoingOptionsEvent, Unit]

type OutgoingRTCSessionListener = js.Function1[/* event */ OutgoingRTCSessionEvent, Unit]

type RTCSessionListener = IncomingRTCSessionListener | OutgoingRTCSessionListener

type RegisteredListener = js.Function1[/* event */ RegisteredEvent, Unit]

type RegistrationFailedListener = UnRegisteredListener

type SipEventListener = js.Function1[/* event */ Event[Any], Unit]

type UAConnectingListener = js.Function1[/* event */ UAConnectingEvent, Unit]

type UnRegisteredListener = js.Function1[/* event */ UnRegisteredEvent, Unit]
