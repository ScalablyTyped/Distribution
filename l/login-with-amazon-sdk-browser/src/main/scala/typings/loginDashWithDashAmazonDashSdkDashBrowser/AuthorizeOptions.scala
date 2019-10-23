package typings.loginDashWithDashAmazonDashSdkDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that may be passed to `authorize`.
  */
trait AuthorizeOptions extends js.Object {
  /**
    * Specifies when to show a login screen to the user.
    * `"auto"` will attempt to use a cached token. If the cached token fails or does not exist, the user will be presented with a login screen.
    * `"always"` does not use the cached token and always presents a login screen.
    * `"never"` will used the cached token; if the token does not work, authorize will return `invalid_grant`.
    * Defaults to `"auto"`.
    */
  var interactive: js.UndefOr[AuthorizeInteractiveOption] = js.undefined
  /**
    * `true` to use a popup window for login, `false` to redirect the current browser window to the authorization dialog. Defaults to `true`. If `false`, the next parameter MUST be a redirect URL.
    */
  var popup: js.UndefOr[Boolean] = js.undefined
  /**
    * The grant type requested. Specify `token` to request an Implicit grant or `code` to request an Authorization Code grant. Defaults to `token`.
    */
  var response_type: js.UndefOr[AuthorizeResponseType] = js.undefined
  /**
    * The access scope requested.
    */
  var scope: AuthorizeScope
  var scope_data: js.UndefOr[AuthorizeScopeData] = js.undefined
  /**
    * An opaque value used by the client to maintain state between this request and the response. The Login with Amazon authorization service will include this value when redirecting the user back
    * to the client. It is also used to prevent cross-site request forgery.
    * For more information see [Cross-site Request Forgery](https://developer.amazon.com/docs/login-with-amazon/cross-site-request-forgery.html).
    *
    */
  var state: js.UndefOr[String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    scope: AuthorizeScope,
    interactive: AuthorizeInteractiveOption = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    response_type: AuthorizeResponseType = null,
    scope_data: AuthorizeScopeData = null,
    state: String = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope_data != null) __obj.updateDynamic("scope_data")(scope_data)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

