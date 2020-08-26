package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response type if `retrieveProfile` call succeeded.
  */
@js.native
trait RetrieveProfileResponseSuccess extends RetrieveProfileResponse {
  /**
    * Contains the user's profile information.
    */
  var profile: UserProfile = js.native
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always true.
    */
  var success: `true` = js.native
}

object RetrieveProfileResponseSuccess {
  @scala.inline
  def apply(profile: UserProfile, success: `true`): RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveProfileResponseSuccess]
  }
  @scala.inline
  implicit class RetrieveProfileResponseSuccessOps[Self <: RetrieveProfileResponseSuccess] (val x: Self) extends AnyVal {
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
    def setProfile(value: UserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

