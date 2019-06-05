package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Option form to request a code.
  */
trait CodeAuthorizeOptions extends AuthorizeOptions {
  @JSName("response_type")
  var response_type_CodeAuthorizeOptions: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibStrings.code
}

object CodeAuthorizeOptions {
  @scala.inline
  def apply(
    response_type: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibStrings.code,
    scope: AuthorizeScope,
    interactive: AuthorizeInteractiveOption = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null
  ): CodeAuthorizeOptions = {
    val __obj = js.Dynamic.literal(response_type = response_type, scope = scope.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CodeAuthorizeOptions]
  }
}

