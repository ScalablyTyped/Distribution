package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseUser extends js.Object {
  var business_manager: InsightsServiceAccountResponseBusinessManager
  var business_profile: InsightsServiceAccountResponseBusinessProfile
  var followers_count: Double
  var id: String
  var instagram_user_id: String
  var profile_picture: InsightsServiceAccountResponseProfilePicture
  var username: String
}

object InsightsServiceAccountResponseUser {
  @scala.inline
  def apply(
    business_manager: InsightsServiceAccountResponseBusinessManager,
    business_profile: InsightsServiceAccountResponseBusinessProfile,
    followers_count: Double,
    id: String,
    instagram_user_id: String,
    profile_picture: InsightsServiceAccountResponseProfilePicture,
    username: String
  ): InsightsServiceAccountResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], business_profile = business_profile.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instagram_user_id = instagram_user_id.asInstanceOf[js.Any], profile_picture = profile_picture.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseUser]
  }
}

