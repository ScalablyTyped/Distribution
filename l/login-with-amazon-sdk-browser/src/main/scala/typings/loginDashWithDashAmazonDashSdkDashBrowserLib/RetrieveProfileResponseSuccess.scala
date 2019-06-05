package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response type if `retrieveProfile` call succeeded.
  */
trait RetrieveProfileResponseSuccess extends RetrieveProfileResponse {
  /**
    * Contains the user's profile information.
    */
  var profile: UserProfile
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always true.
    */
  var success: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibNumbers.`true`
}

object RetrieveProfileResponseSuccess {
  @scala.inline
  def apply(
    profile: UserProfile,
    success: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibNumbers.`true`
  ): RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile, success = success)
  
    __obj.asInstanceOf[RetrieveProfileResponseSuccess]
  }
}

