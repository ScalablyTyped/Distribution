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
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type, can_boost_post = can_boost_post, can_see_organic_insights = can_see_organic_insights, full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_private = is_private, is_unpublished = is_unpublished, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, reel_auto_archive = reel_auto_archive, show_insights_terms = show_insights_terms, username = username)
  
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseUser]
  }
}

