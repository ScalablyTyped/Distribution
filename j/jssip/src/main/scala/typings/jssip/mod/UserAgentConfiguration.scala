package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentConfiguration extends js.Object {
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
  def apply(
    sockets: Socket | js.Array[Socket],
    uri: String,
    authorization_user: String = null,
    connection_recovery_max_interval: Int | Double = null,
    connection_recovery_min_interval: Int | Double = null,
    contact_uri: String = null,
    display_name: String = null,
    ha1: String = null,
    instance_id: String = null,
    no_answer_timeout: Int | Double = null,
    password: String = null,
    realm: String = null,
    register: js.UndefOr[Boolean] = js.undefined,
    register_expires: Int | Double = null,
    registrar_server: String = null,
    session_timers: js.UndefOr[Boolean] = js.undefined,
    session_timers_refresh_method: String = null,
    use_reloaded_route: js.UndefOr[Boolean] = js.undefined,
    user_agent: String = null
  ): UserAgentConfiguration = {
    val __obj = js.Dynamic.literal(sockets = sockets.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (authorization_user != null) __obj.updateDynamic("authorization_user")(authorization_user.asInstanceOf[js.Any])
    if (connection_recovery_max_interval != null) __obj.updateDynamic("connection_recovery_max_interval")(connection_recovery_max_interval.asInstanceOf[js.Any])
    if (connection_recovery_min_interval != null) __obj.updateDynamic("connection_recovery_min_interval")(connection_recovery_min_interval.asInstanceOf[js.Any])
    if (contact_uri != null) __obj.updateDynamic("contact_uri")(contact_uri.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (ha1 != null) __obj.updateDynamic("ha1")(ha1.asInstanceOf[js.Any])
    if (instance_id != null) __obj.updateDynamic("instance_id")(instance_id.asInstanceOf[js.Any])
    if (no_answer_timeout != null) __obj.updateDynamic("no_answer_timeout")(no_answer_timeout.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (!js.isUndefined(register)) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    if (register_expires != null) __obj.updateDynamic("register_expires")(register_expires.asInstanceOf[js.Any])
    if (registrar_server != null) __obj.updateDynamic("registrar_server")(registrar_server.asInstanceOf[js.Any])
    if (!js.isUndefined(session_timers)) __obj.updateDynamic("session_timers")(session_timers.asInstanceOf[js.Any])
    if (session_timers_refresh_method != null) __obj.updateDynamic("session_timers_refresh_method")(session_timers_refresh_method.asInstanceOf[js.Any])
    if (!js.isUndefined(use_reloaded_route)) __obj.updateDynamic("use_reloaded_route")(use_reloaded_route.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConfiguration]
  }
}

