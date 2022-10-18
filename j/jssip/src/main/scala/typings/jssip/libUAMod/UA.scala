package typings.jssip.libUAMod

import typings.events.mod.EventEmitter
import typings.jssip.jssipStrings.authorization_jwt
import typings.jssip.jssipStrings.authorization_user
import typings.jssip.jssipStrings.connected
import typings.jssip.jssipStrings.connecting
import typings.jssip.jssipStrings.connection_recovery_max_interval
import typings.jssip.jssipStrings.connection_recovery_min_interval
import typings.jssip.jssipStrings.contact_uri
import typings.jssip.jssipStrings.disconnected
import typings.jssip.jssipStrings.display_name
import typings.jssip.jssipStrings.ha1
import typings.jssip.jssipStrings.instance_id
import typings.jssip.jssipStrings.newMessage
import typings.jssip.jssipStrings.newRTCSession
import typings.jssip.jssipStrings.no_answer_timeout
import typings.jssip.jssipStrings.password
import typings.jssip.jssipStrings.realm
import typings.jssip.jssipStrings.register
import typings.jssip.jssipStrings.register_expires
import typings.jssip.jssipStrings.registered
import typings.jssip.jssipStrings.registrar_server
import typings.jssip.jssipStrings.registrationExpiring
import typings.jssip.jssipStrings.registrationFailed
import typings.jssip.jssipStrings.session_timers
import typings.jssip.jssipStrings.session_timers_force_refresher
import typings.jssip.jssipStrings.session_timers_refresh_method
import typings.jssip.jssipStrings.sipEvent
import typings.jssip.jssipStrings.sockets
import typings.jssip.jssipStrings.unregistered
import typings.jssip.jssipStrings.uri
import typings.jssip.jssipStrings.use_preloaded_route
import typings.jssip.jssipStrings.user_agent
import typings.jssip.libMessageMod.Message
import typings.jssip.libMessageMod.SendMessageOptions
import typings.jssip.libRegistratorMod.Registrator
import typings.jssip.libRtcsessionMod.AnyListener
import typings.jssip.libRtcsessionMod.RTCSession
import typings.jssip.libRtcsessionMod.TerminateOptions
import typings.jssip.libUriMod.URI
import typings.jssip.libWebSocketInterfaceMod.Socket
import typings.jssip.libWebSocketInterfaceMod.WeightedSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip/lib/UA", "UA")
@js.native
open class UA protected () extends EventEmitter {
  def this(configuration: UAConfiguration) = this()
  
  def C: Any = js.native
  
  def call(target: String): RTCSession = js.native
  def call(target: String, options: CallOptions): RTCSession = js.native
  
  def contact: UAContact = js.native
  
  @JSName("get")
  def get_authorizationjwt(parameter: authorization_jwt): js.UndefOr[String] = js.native
  @JSName("get")
  def get_authorizationuser(parameter: authorization_user): js.UndefOr[String] = js.native
  @JSName("get")
  def get_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_connectionrecoverymininterval(parameter: connection_recovery_min_interval): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_contacturi(parameter: contact_uri): js.UndefOr[String] = js.native
  @JSName("get")
  def get_displayname(parameter: display_name): js.UndefOr[String] = js.native
  @JSName("get")
  def get_ha1(parameter: ha1): js.UndefOr[String] = js.native
  @JSName("get")
  def get_instanceid(parameter: instance_id): js.UndefOr[String] = js.native
  @JSName("get")
  def get_noanswertimeout(parameter: no_answer_timeout): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_password(parameter: password): js.UndefOr[String] = js.native
  @JSName("get")
  def get_realm(parameter: realm): js.UndefOr[String] = js.native
  @JSName("get")
  def get_register(parameter: register): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_registerexpires(parameter: register_expires): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_registrarserver(parameter: registrar_server): js.UndefOr[String] = js.native
  @JSName("get")
  def get_sessiontimers(parameter: session_timers): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_sessiontimersforcerefresher(parameter: session_timers_force_refresher): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_sessiontimersrefreshmethod(parameter: session_timers_refresh_method): js.UndefOr[String] = js.native
  @JSName("get")
  def get_sockets(parameter: sockets): Socket | (js.Array[Socket | WeightedSocket]) = js.native
  @JSName("get")
  def get_uri(parameter: uri): String = js.native
  @JSName("get")
  def get_usepreloadedroute(parameter: use_preloaded_route): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_useragent(parameter: user_agent): js.UndefOr[String] = js.native
  
  def isConnected(): Boolean = js.native
  
  def isRegistered(): Boolean = js.native
  
  @JSName("on")
  def on_connected(`type`: connected, listener: ConnectedListener): this.type = js.native
  @JSName("on")
  def on_connecting(`type`: connecting, listener: UAConnectingListener): this.type = js.native
  @JSName("on")
  def on_disconnected(`type`: disconnected, listener: DisconnectedListener): this.type = js.native
  @JSName("on")
  def on_newMessage(`type`: newMessage, listener: MessageListener): this.type = js.native
  @JSName("on")
  def on_newRTCSession(`type`: newRTCSession, listener: RTCSessionListener): this.type = js.native
  @JSName("on")
  def on_registered(`type`: registered, listener: RegisteredListener): this.type = js.native
  @JSName("on")
  def on_registrationExpiring(`type`: registrationExpiring, listener: AnyListener): this.type = js.native
  @JSName("on")
  def on_registrationFailed(`type`: registrationFailed, listener: RegistrationFailedListener): this.type = js.native
  @JSName("on")
  def on_sipEvent(`type`: sipEvent, listener: SipEventListener): this.type = js.native
  @JSName("on")
  def on_unregistered(`type`: unregistered, listener: UnRegisteredListener): this.type = js.native
  
  def register(): Unit = js.native
  
  def registrator(): Registrator = js.native
  
  def sendMessage(target: String, body: String): Message = js.native
  def sendMessage(target: String, body: String, options: SendMessageOptions): Message = js.native
  def sendMessage(target: URI, body: String): Message = js.native
  def sendMessage(target: URI, body: String, options: SendMessageOptions): Message = js.native
  
  @JSName("set")
  def set_authorizationjwt(parameter: authorization_jwt): Boolean = js.native
  @JSName("set")
  def set_authorizationjwt(parameter: authorization_jwt, value: String): Boolean = js.native
  @JSName("set")
  def set_authorizationuser(parameter: authorization_user): Boolean = js.native
  @JSName("set")
  def set_authorizationuser(parameter: authorization_user, value: String): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval, value: Double): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymininterval(parameter: connection_recovery_min_interval): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymininterval(parameter: connection_recovery_min_interval, value: Double): Boolean = js.native
  @JSName("set")
  def set_contacturi(parameter: contact_uri): Boolean = js.native
  @JSName("set")
  def set_contacturi(parameter: contact_uri, value: String): Boolean = js.native
  @JSName("set")
  def set_displayname(parameter: display_name): Boolean = js.native
  @JSName("set")
  def set_displayname(parameter: display_name, value: String): Boolean = js.native
  @JSName("set")
  def set_ha1(parameter: ha1): Boolean = js.native
  @JSName("set")
  def set_ha1(parameter: ha1, value: String): Boolean = js.native
  @JSName("set")
  def set_instanceid(parameter: instance_id): Boolean = js.native
  @JSName("set")
  def set_instanceid(parameter: instance_id, value: String): Boolean = js.native
  @JSName("set")
  def set_noanswertimeout(parameter: no_answer_timeout): Boolean = js.native
  @JSName("set")
  def set_noanswertimeout(parameter: no_answer_timeout, value: Double): Boolean = js.native
  @JSName("set")
  def set_password(parameter: password): Boolean = js.native
  @JSName("set")
  def set_password(parameter: password, value: String): Boolean = js.native
  @JSName("set")
  def set_realm(parameter: realm): Boolean = js.native
  @JSName("set")
  def set_realm(parameter: realm, value: String): Boolean = js.native
  @JSName("set")
  def set_register(parameter: register): Boolean = js.native
  @JSName("set")
  def set_register(parameter: register, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_registerexpires(parameter: register_expires): Boolean = js.native
  @JSName("set")
  def set_registerexpires(parameter: register_expires, value: Double): Boolean = js.native
  @JSName("set")
  def set_registrarserver(parameter: registrar_server): Boolean = js.native
  @JSName("set")
  def set_registrarserver(parameter: registrar_server, value: String): Boolean = js.native
  @JSName("set")
  def set_sessiontimers(parameter: session_timers): Boolean = js.native
  @JSName("set")
  def set_sessiontimers(parameter: session_timers, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_sessiontimersforcerefresher(parameter: session_timers_force_refresher): Boolean = js.native
  @JSName("set")
  def set_sessiontimersforcerefresher(parameter: session_timers_force_refresher, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_sessiontimersrefreshmethod(parameter: session_timers_refresh_method): Boolean = js.native
  @JSName("set")
  def set_sessiontimersrefreshmethod(parameter: session_timers_refresh_method, value: String): Boolean = js.native
  @JSName("set")
  def set_sockets(parameter: sockets, value: js.Array[Socket | WeightedSocket]): Boolean = js.native
  @JSName("set")
  def set_sockets(parameter: sockets, value: Socket): Boolean = js.native
  @JSName("set")
  def set_uri(parameter: uri, value: String): Boolean = js.native
  @JSName("set")
  def set_usepreloadedroute(parameter: use_preloaded_route): Boolean = js.native
  @JSName("set")
  def set_usepreloadedroute(parameter: use_preloaded_route, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_useragent(parameter: user_agent): Boolean = js.native
  @JSName("set")
  def set_useragent(parameter: user_agent, value: String): Boolean = js.native
  
  def start(): Unit = js.native
  
  def status: UAStatus = js.native
  
  def stop(): Unit = js.native
  
  def terminateSessions(): Unit = js.native
  def terminateSessions(options: TerminateOptions): Unit = js.native
  
  def unregister(): Unit = js.native
  def unregister(options: UnRegisterOptions): Unit = js.native
}
