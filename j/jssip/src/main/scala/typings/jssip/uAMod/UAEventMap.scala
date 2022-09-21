package typings.jssip.uAMod

import typings.jssip.anon.Event
import typings.jssip.rtcsessionMod.AnyListener
import typings.jssip.webSocketInterfaceMod.DisconnectEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UAEventMap extends StObject {
  
  def connected(event: ConnectedEvent): Unit
  @JSName("connected")
  var connected_Original: ConnectedListener
  
  def connecting(event: UAConnectingEvent): Unit
  @JSName("connecting")
  var connecting_Original: UAConnectingListener
  
  def disconnected(event: DisconnectEvent): Unit
  @JSName("disconnected")
  var disconnected_Original: DisconnectedListener
  
  var newMessage: MessageListener
  
  var newRTCSession: RTCSessionListener
  
  def registered(event: RegisteredEvent): Unit
  @JSName("registered")
  var registered_Original: RegisteredListener
  
  def registrationExpiring(args: Any*): Unit
  @JSName("registrationExpiring")
  var registrationExpiring_Original: AnyListener
  
  def registrationFailed(event: UnRegisteredEvent): Unit
  @JSName("registrationFailed")
  var registrationFailed_Original: RegistrationFailedListener
  
  def sipEvent[T](event: Event[T]): Unit
  @JSName("sipEvent")
  var sipEvent_Original: SipEventListener
  
  def unregistered(event: UnRegisteredEvent): Unit
  @JSName("unregistered")
  var unregistered_Original: UnRegisteredListener
}
object UAEventMap {
  
  inline def apply(
    connected: /* event */ ConnectedEvent => Unit,
    connecting: /* event */ UAConnectingEvent => Unit,
    disconnected: /* event */ DisconnectEvent => Unit,
    newMessage: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent) => Unit,
    newRTCSession: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent) => Unit,
    registered: /* event */ RegisteredEvent => Unit,
    registrationExpiring: AnyListener,
    registrationFailed: /* event */ UnRegisteredEvent => Unit,
    sipEvent: /* event */ Event[Any] => Unit,
    unregistered: /* event */ UnRegisteredEvent => Unit
  ): UAEventMap = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1(connected), connecting = js.Any.fromFunction1(connecting), disconnected = js.Any.fromFunction1(disconnected), newMessage = js.Any.fromFunction1(newMessage), newRTCSession = js.Any.fromFunction1(newRTCSession), registered = js.Any.fromFunction1(registered), registrationExpiring = registrationExpiring.asInstanceOf[js.Any], registrationFailed = js.Any.fromFunction1(registrationFailed), sipEvent = js.Any.fromFunction1(sipEvent), unregistered = js.Any.fromFunction1(unregistered))
    __obj.asInstanceOf[UAEventMap]
  }
  
  extension [Self <: UAEventMap](x: Self) {
    
    inline def setConnected(value: /* event */ ConnectedEvent => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    
    inline def setConnecting(value: /* event */ UAConnectingEvent => Unit): Self = StObject.set(x, "connecting", js.Any.fromFunction1(value))
    
    inline def setDisconnected(value: /* event */ DisconnectEvent => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    
    inline def setNewMessage(value: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent) => Unit): Self = StObject.set(x, "newMessage", js.Any.fromFunction1(value))
    
    inline def setNewRTCSession(value: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent) => Unit): Self = StObject.set(x, "newRTCSession", js.Any.fromFunction1(value))
    
    inline def setRegistered(value: /* event */ RegisteredEvent => Unit): Self = StObject.set(x, "registered", js.Any.fromFunction1(value))
    
    inline def setRegistrationExpiring(value: AnyListener): Self = StObject.set(x, "registrationExpiring", value.asInstanceOf[js.Any])
    
    inline def setRegistrationFailed(value: /* event */ UnRegisteredEvent => Unit): Self = StObject.set(x, "registrationFailed", js.Any.fromFunction1(value))
    
    inline def setSipEvent(value: /* event */ Event[Any] => Unit): Self = StObject.set(x, "sipEvent", js.Any.fromFunction1(value))
    
    inline def setUnregistered(value: /* event */ UnRegisteredEvent => Unit): Self = StObject.set(x, "unregistered", js.Any.fromFunction1(value))
  }
}
