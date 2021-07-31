package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentConfiguration extends StObject {
  
  var authorization_user: js.UndefOr[String] = js.undefined
  
  var connection_recovery_max_interval: js.UndefOr[Double] = js.undefined
  
  var connection_recovery_min_interval: js.UndefOr[Double] = js.undefined
  
  var contact_uri: js.UndefOr[String] = js.undefined
  
  var display_name: js.UndefOr[String] = js.undefined
  
  var ha1: js.UndefOr[String] = js.undefined
  
  var instance_id: js.UndefOr[String] = js.undefined
  
  var no_answer_timeout: js.UndefOr[Double] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var register: js.UndefOr[Boolean] = js.undefined
  
  var register_expires: js.UndefOr[Double] = js.undefined
  
  var registrar_server: js.UndefOr[String] = js.undefined
  
  var session_timers: js.UndefOr[Boolean] = js.undefined
  
  var session_timers_refresh_method: js.UndefOr[String] = js.undefined
  
  var sockets: Socket | js.Array[Socket]
  
  var uri: String
  
  var use_reloaded_route: js.UndefOr[Boolean] = js.undefined
  
  var user_agent: js.UndefOr[String] = js.undefined
}
object UserAgentConfiguration {
  
  @scala.inline
  def apply(sockets: Socket | js.Array[Socket], uri: String): UserAgentConfiguration = {
    val __obj = js.Dynamic.literal(sockets = sockets.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConfiguration]
  }
  
  @scala.inline
  implicit class UserAgentConfigurationMutableBuilder[Self <: UserAgentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization_user(value: String): Self = StObject.set(x, "authorization_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_userUndefined: Self = StObject.set(x, "authorization_user", js.undefined)
    
    @scala.inline
    def setConnection_recovery_max_interval(value: Double): Self = StObject.set(x, "connection_recovery_max_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_recovery_max_intervalUndefined: Self = StObject.set(x, "connection_recovery_max_interval", js.undefined)
    
    @scala.inline
    def setConnection_recovery_min_interval(value: Double): Self = StObject.set(x, "connection_recovery_min_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_recovery_min_intervalUndefined: Self = StObject.set(x, "connection_recovery_min_interval", js.undefined)
    
    @scala.inline
    def setContact_uri(value: String): Self = StObject.set(x, "contact_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact_uriUndefined: Self = StObject.set(x, "contact_uri", js.undefined)
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    @scala.inline
    def setHa1(value: String): Self = StObject.set(x, "ha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHa1Undefined: Self = StObject.set(x, "ha1", js.undefined)
    
    @scala.inline
    def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
    
    @scala.inline
    def setNo_answer_timeout(value: Double): Self = StObject.set(x, "no_answer_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_answer_timeoutUndefined: Self = StObject.set(x, "no_answer_timeout", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    @scala.inline
    def setRegister(value: Boolean): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    
    @scala.inline
    def setRegister_expires(value: Double): Self = StObject.set(x, "register_expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister_expiresUndefined: Self = StObject.set(x, "register_expires", js.undefined)
    
    @scala.inline
    def setRegistrar_server(value: String): Self = StObject.set(x, "registrar_server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrar_serverUndefined: Self = StObject.set(x, "registrar_server", js.undefined)
    
    @scala.inline
    def setSession_timers(value: Boolean): Self = StObject.set(x, "session_timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_timersUndefined: Self = StObject.set(x, "session_timers", js.undefined)
    
    @scala.inline
    def setSession_timers_refresh_method(value: String): Self = StObject.set(x, "session_timers_refresh_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_timers_refresh_methodUndefined: Self = StObject.set(x, "session_timers_refresh_method", js.undefined)
    
    @scala.inline
    def setSockets(value: Socket | js.Array[Socket]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketsVarargs(value: Socket*): Self = StObject.set(x, "sockets", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_reloaded_route(value: Boolean): Self = StObject.set(x, "use_reloaded_route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_reloaded_routeUndefined: Self = StObject.set(x, "use_reloaded_route", js.undefined)
    
    @scala.inline
    def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
