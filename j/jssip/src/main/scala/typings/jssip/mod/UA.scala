package typings.jssip.mod

import typings.jssip.jssipStrings.connected
import typings.jssip.jssipStrings.connecting
import typings.jssip.jssipStrings.disconnected
import typings.jssip.jssipStrings.newMessage
import typings.jssip.jssipStrings.newRTCSession
import typings.jssip.jssipStrings.registered
import typings.jssip.jssipStrings.registrationExpiring
import typings.jssip.jssipStrings.registrationFailed
import typings.jssip.jssipStrings.sipEvent
import typings.jssip.jssipStrings.unregistered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "UA")
@js.native
class UA protected () extends js.Object {
  def this(configuration: UserAgentConfiguration) = this()
  def call(target: String): js.Any = js.native
  def call(target: String, options: UserAgentCallOptions): js.Any = js.native
  def call(target: URI): js.Any = js.native
  def call(target: URI, options: UserAgentCallOptions): js.Any = js.native
  def get(parameter: String): js.UndefOr[String] = js.native
  def isConnected(): Boolean = js.native
  def isRegistered(): Boolean = js.native
  @JSName("on")
  def on_connected(eventName: connected, handler: EventHandler[UserAgentConnectedEvent]): Unit = js.native
  @JSName("on")
  def on_connecting(eventName: connecting, handler: EventHandler[UserAgentConnectingEvent]): Unit = js.native
  @JSName("on")
  def on_disconnected(eventName: disconnected, handler: EventHandler[UserAgentDisconnectedEvent]): Unit = js.native
  @JSName("on")
  def on_newMessage(eventName: newMessage, handler: EventHandler[UserAgentNewMessageEvent]): Unit = js.native
  @JSName("on")
  def on_newRTCSession(eventName: newRTCSession, handler: EventHandler[UserAgentNewRtcSessionEvent]): Unit = js.native
  @JSName("on")
  def on_registered(eventName: registered, handler: EventHandler[UserAgentRegisteredEvent]): Unit = js.native
  @JSName("on")
  def on_registrationExpiring(eventName: registrationExpiring, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_registrationFailed(eventName: registrationFailed, handler: EventHandler[UserAgentRegistrationFailedEvent]): Unit = js.native
  @JSName("on")
  def on_sipEvent(eventName: sipEvent, handler: EventHandler[UserAgentSipEvent]): Unit = js.native
  @JSName("on")
  def on_unregistered(eventName: unregistered, handler: EventHandler[UserAgentUnregisteredEvent]): Unit = js.native
  def register(): Unit = js.native
  def registrator(): Registrator = js.native
  def sendMessage(target: String, body: String): js.Any = js.native
  def sendMessage(target: String, body: String, options: UserAgentSendMessageOptions): js.Any = js.native
  def sendMessage(target: URI, body: String): js.Any = js.native
  def sendMessage(target: URI, body: String, options: UserAgentSendMessageOptions): js.Any = js.native
  def set(parameter: String, value: String): js.Any = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def terminateSessions(options: SessionTerminateOptions): Unit = js.native
  def unregister(): Unit = js.native
  def unregister(options: UserAgentUnregisterOptions): Unit = js.native
}

