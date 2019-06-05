package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenAuthorizeOptions extends AuthorizeOptions {
  @JSName("response_type")
  var response_type_AccessTokenAuthorizeOptions: js.UndefOr[
    loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibStrings.token
  ] = js.undefined
}

object AccessTokenAuthorizeOptions {
  @scala.inline
  def apply(
    scope: AuthorizeScope,
    interactive: AuthorizeInteractiveOption = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    response_type: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibStrings.token = null,
    state: java.lang.String = null
  ): AccessTokenAuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AccessTokenAuthorizeOptions]
  }
}

