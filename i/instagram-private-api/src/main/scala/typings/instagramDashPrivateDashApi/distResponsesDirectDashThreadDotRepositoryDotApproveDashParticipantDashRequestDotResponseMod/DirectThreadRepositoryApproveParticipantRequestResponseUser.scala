package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotApproveDashParticipantDashRequestDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryApproveParticipantRequestResponseUser extends js.Object {
  var allowed_commenter_type: String
  var can_boost_post: Boolean
  var can_see_organic_insights: Boolean
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_unpublished: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var reel_auto_archive: String
  var show_insights_terms: Boolean
  var username: String
}

object DirectThreadRepositoryApproveParticipantRequestResponseUser {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    can_boost_post: Boolean,
    can_see_organic_insights: Boolean,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_unpublished: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    username: String
  ): DirectThreadRepositoryApproveParticipantRequestResponseUser = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseUser]
  }
}

