package typings.loginDashWithDashAmazonDashSdkDashBrowser

import typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Option form to request a code.
  */
trait CodeAuthorizeOptions extends AuthorizeOptions {
  @JSName("response_type")
  var response_type_CodeAuthorizeOptions: code
}

object CodeAuthorizeOptions {
  @scala.inline
  def apply(
    response_type: code,
    scope: AuthorizeScope,
    interactive: AuthorizeInteractiveOption = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    scope_data: AuthorizeScopeData = null,
    state: String = null
  ): CodeAuthorizeOptions = {
    val __obj = js.Dynamic.literal(response_type = response_type, scope = scope.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (scope_data != null) __obj.updateDynamic("scope_data")(scope_data)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CodeAuthorizeOptions]
  }
}

