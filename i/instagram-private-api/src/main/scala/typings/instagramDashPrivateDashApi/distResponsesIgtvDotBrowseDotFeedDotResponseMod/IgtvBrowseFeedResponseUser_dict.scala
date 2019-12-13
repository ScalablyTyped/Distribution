package typings.instagramDashPrivateDashApi.distResponsesIgtvDotBrowseDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseUser_dict extends js.Object {
  var allowed_commenter_type: String
  var biography: String
  var biography_with_entities: IgtvBrowseFeedResponseBiography_with_entities
  var can_boost_post: Boolean
  var can_link_entities_in_bio: Boolean
  var can_see_organic_insights: Boolean
  var external_lynx_url: String
  var external_url: String
  var follower_count: Double
  var following_count: Double
  var following_tag_count: Double
  var friendship_status: IgtvBrowseFeedResponseFriendship_status
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var has_biography_translation: Boolean
  var has_placed_orders: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var media_count: Double
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var reel_auto_archive: String
  var show_insights_terms: Boolean
  var total_igtv_videos: Double
  var username: String
}

object IgtvBrowseFeedResponseUser_dict {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    biography: String,
    biography_with_entities: IgtvBrowseFeedResponseBiography_with_entities,
    can_boost_post: Boolean,
    can_link_entities_in_bio: Boolean,
    can_see_organic_insights: Boolean,
    external_lynx_url: String,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvBrowseFeedResponseFriendship_status,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    has_placed_orders: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    total_igtv_videos: Double,
    username: String
  ): IgtvBrowseFeedResponseUser_dict = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], external_lynx_url = external_lynx_url.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvBrowseFeedResponseUser_dict]
  }
}

