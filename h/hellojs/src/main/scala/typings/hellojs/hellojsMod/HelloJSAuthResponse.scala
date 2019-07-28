package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSAuthResponse extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[HelloJSDisplayType] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var expires_in: js.UndefOr[Double] = js.undefined
  var id_token: js.UndefOr[String] = js.undefined
  var network: js.UndefOr[String] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var session_state: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object HelloJSAuthResponse {
  @scala.inline
  def apply(
    access_token: String = null,
    display: HelloJSDisplayType = null,
    expires: Int | Double = null,
    expires_in: Int | Double = null,
    id_token: String = null,
    network: String = null,
    redirect_uri: String = null,
    scope: String = null,
    session_state: String = null,
    state: String = null,
    token_type: String = null
  ): HelloJSAuthResponse = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (display != null) __obj.updateDynamic("display")(display)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (network != null) __obj.updateDynamic("network")(network)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (session_state != null) __obj.updateDynamic("session_state")(session_state)
    if (state != null) __obj.updateDynamic("state")(state)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[HelloJSAuthResponse]
  }
}

