package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenAuthorizeOptions extends AuthorizeOptions {
  @JSName("response_type")
  var response_type_AccessTokenAuthorizeOptions: js.UndefOr[token] = js.undefined
}

object AccessTokenAuthorizeOptions {
  @scala.inline
  def apply(
    scope: AuthorizeScope,
    interactive: AuthorizeInteractiveOption = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    response_type: token = null,
    scope_data: AuthorizeScopeData = null,
    state: String = null
  ): AccessTokenAuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.get.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope_data != null) __obj.updateDynamic("scope_data")(scope_data.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenAuthorizeOptions]
  }
}

