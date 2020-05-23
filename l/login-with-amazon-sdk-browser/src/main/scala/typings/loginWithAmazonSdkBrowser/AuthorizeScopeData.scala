package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.anon.Essential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential  :boolean}} */
trait AuthorizeScopeData extends js.Object {
  var postal_code: js.UndefOr[Essential] = js.undefined
  var profile: js.UndefOr[Essential] = js.undefined
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[Essential] = js.undefined
}

object AuthorizeScopeData {
  @scala.inline
  def apply(postal_code: Essential = null, profile: Essential = null, profileColonuser_id: Essential = null): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileColonuser_id != null) __obj.updateDynamic("profile:user_id")(profileColonuser_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeScopeData]
  }
}

