package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentConfiguration extends js.Object {
  var authorization_user: js.UndefOr[String] = js.native
  var connection_recovery_max_interval: js.UndefOr[Double] = js.native
  var connection_recovery_min_interval: js.UndefOr[Double] = js.native
  var contact_uri: js.UndefOr[String] = js.native
  var display_name: js.UndefOr[String] = js.native
  var ha1: js.UndefOr[String] = js.native
  var instance_id: js.UndefOr[String] = js.native
  var no_answer_timeout: js.UndefOr[Double] = js.native
  var password: js.UndefOr[String] = js.native
  var realm: js.UndefOr[String] = js.native
  var register: js.UndefOr[Boolean] = js.native
  var register_expires: js.UndefOr[Double] = js.native
  var registrar_server: js.UndefOr[String] = js.native
  var session_timers: js.UndefOr[Boolean] = js.native
  var session_timers_refresh_method: js.UndefOr[String] = js.native
  var sockets: Socket | js.Array[Socket] = js.native
  var uri: String = js.native
  var use_reloaded_route: js.UndefOr[Boolean] = js.native
  var user_agent: js.UndefOr[String] = js.native
}

object UserAgentConfiguration {
  @scala.inline
  def apply(sockets: Socket | js.Array[Socket], uri: String): UserAgentConfiguration = {
    val __obj = js.Dynamic.literal(sockets = sockets.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConfiguration]
  }
  @scala.inline
  implicit class UserAgentConfigurationOps[Self <: UserAgentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSocketsVarargs(value: Socket*): Self = this.set("sockets", js.Array(value :_*))
    @scala.inline
    def setSockets(value: Socket | js.Array[Socket]): Self = this.set("sockets", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorization_user(value: String): Self = this.set("authorization_user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization_user: Self = this.set("authorization_user", js.undefined)
    @scala.inline
    def setConnection_recovery_max_interval(value: Double): Self = this.set("connection_recovery_max_interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection_recovery_max_interval: Self = this.set("connection_recovery_max_interval", js.undefined)
    @scala.inline
    def setConnection_recovery_min_interval(value: Double): Self = this.set("connection_recovery_min_interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection_recovery_min_interval: Self = this.set("connection_recovery_min_interval", js.undefined)
    @scala.inline
    def setContact_uri(value: String): Self = this.set("contact_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact_uri: Self = this.set("contact_uri", js.undefined)
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    @scala.inline
    def setHa1(value: String): Self = this.set("ha1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHa1: Self = this.set("ha1", js.undefined)
    @scala.inline
    def setInstance_id(value: String): Self = this.set("instance_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance_id: Self = this.set("instance_id", js.undefined)
    @scala.inline
    def setNo_answer_timeout(value: Double): Self = this.set("no_answer_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_answer_timeout: Self = this.set("no_answer_timeout", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    @scala.inline
    def setRegister(value: Boolean): Self = this.set("register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
    @scala.inline
    def setRegister_expires(value: Double): Self = this.set("register_expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister_expires: Self = this.set("register_expires", js.undefined)
    @scala.inline
    def setRegistrar_server(value: String): Self = this.set("registrar_server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrar_server: Self = this.set("registrar_server", js.undefined)
    @scala.inline
    def setSession_timers(value: Boolean): Self = this.set("session_timers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_timers: Self = this.set("session_timers", js.undefined)
    @scala.inline
    def setSession_timers_refresh_method(value: String): Self = this.set("session_timers_refresh_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_timers_refresh_method: Self = this.set("session_timers_refresh_method", js.undefined)
    @scala.inline
    def setUse_reloaded_route(value: Boolean): Self = this.set("use_reloaded_route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_reloaded_route: Self = this.set("use_reloaded_route", js.undefined)
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
  }
  
}

