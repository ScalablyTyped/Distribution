package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSLoginOptions extends js.Object {
  var default_service: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[HelloJSDisplayType] = js.undefined
  var force: js.UndefOr[Boolean | Null] = js.undefined
  var oauth_proxy: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[HelloJSPopupOptions] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object HelloJSLoginOptions {
  @scala.inline
  def apply(
    default_service: String = null,
    display: HelloJSDisplayType = null,
    force: js.UndefOr[Boolean] = js.undefined,
    oauth_proxy: String = null,
    popup: HelloJSPopupOptions = null,
    redirect_uri: String = null,
    response_type: HelloJSTokenResponseType = null,
    scope: String = null,
    state: String = null,
    timeout: Int | Double = null
  ): HelloJSLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (default_service != null) __obj.updateDynamic("default_service")(default_service)
    if (display != null) __obj.updateDynamic("display")(display)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (oauth_proxy != null) __obj.updateDynamic("oauth_proxy")(oauth_proxy)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSLoginOptions]
  }
}

