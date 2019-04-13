package typings
package hellojsLib.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSAuthResponse extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var display: js.UndefOr[HelloJSDisplayType] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var expires_in: js.UndefOr[scala.Double] = js.undefined
  var id_token: js.UndefOr[java.lang.String] = js.undefined
  var network: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var session_state: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var token_type: js.UndefOr[java.lang.String] = js.undefined
}

object HelloJSAuthResponse {
  @scala.inline
  def apply(
    access_token: java.lang.String = null,
    display: HelloJSDisplayType = null,
    expires: scala.Int | scala.Double = null,
    expires_in: scala.Int | scala.Double = null,
    id_token: java.lang.String = null,
    network: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    scope: java.lang.String = null,
    session_state: java.lang.String = null,
    state: java.lang.String = null,
    token_type: java.lang.String = null
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

