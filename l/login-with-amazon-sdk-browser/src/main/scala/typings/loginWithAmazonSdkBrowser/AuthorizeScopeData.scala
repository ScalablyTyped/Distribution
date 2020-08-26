package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.anon.Essential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential :boolean}} */
@js.native
trait AuthorizeScopeData extends js.Object {
  var postal_code: js.UndefOr[Essential] = js.native
  var profile: js.UndefOr[Essential] = js.native
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[Essential] = js.native
}

object AuthorizeScopeData {
  @scala.inline
  def apply(): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeScopeData]
  }
  @scala.inline
  implicit class AuthorizeScopeDataOps[Self <: AuthorizeScopeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostal_code(value: Essential): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    @scala.inline
    def setProfile(value: Essential): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setProfileColonuser_id(value: Essential): Self = this.set("profile:user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileColonuser_id: Self = this.set("profile:user_id", js.undefined)
  }
  
}

