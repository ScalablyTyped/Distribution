package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential  :boolean}} */
trait AuthorizeScopeData extends js.Object {
  var postal_code: js.UndefOr[AnonEssential] = js.undefined
  var profile: js.UndefOr[AnonEssential] = js.undefined
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[AnonEssential] = js.undefined
}

object AuthorizeScopeData {
  @scala.inline
  def apply(
    postal_code: AnonEssential = null,
    profile: AnonEssential = null,
    profileColonuser_id: AnonEssential = null
  ): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileColonuser_id != null) __obj.updateDynamic("profile:user_id")(profileColonuser_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeScopeData]
  }
}

