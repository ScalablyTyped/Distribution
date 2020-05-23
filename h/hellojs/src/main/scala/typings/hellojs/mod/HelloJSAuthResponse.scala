package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSAuthResponse extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
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
    client_id: String = null,
    display: HelloJSDisplayType = null,
    expires: js.UndefOr[Double] = js.undefined,
    expires_in: js.UndefOr[Double] = js.undefined,
    id_token: String = null,
    network: String = null,
    redirect_uri: String = null,
    scope: String = null,
    session_state: String = null,
    state: String = null,
    token_type: String = null
  ): HelloJSAuthResponse = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires_in)) __obj.updateDynamic("expires_in")(expires_in.get.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (session_state != null) __obj.updateDynamic("session_state")(session_state.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSAuthResponse]
  }
}

