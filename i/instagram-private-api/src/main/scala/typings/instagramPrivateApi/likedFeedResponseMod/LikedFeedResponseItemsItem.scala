package typings.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikedFeedResponseItemsItem extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: LikedFeedResponseCaption
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double | String
  var filter_type: Double
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: LikedFeedResponseImageVersions2
  var inline_composer_display_condition: String
  var inline_composer_imp_trigger_time: Double
  var lat: js.UndefOr[Double] = js.undefined
  var like_count: Double
  var lng: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[LikedFeedResponseLocation] = js.undefined
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var next_max_id: js.UndefOr[String] = js.undefined
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[LikedFeedResponsePreviewCommentsItem]
  var taken_at: Double
  var user: LikedFeedResponseUser
  var usertags: js.UndefOr[LikedFeedResponseUsertags] = js.undefined
}

object LikedFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: LikedFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double | String,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: LikedFeedResponseImageVersions2,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[LikedFeedResponsePreviewCommentsItem],
    taken_at: Double,
    user: LikedFeedResponseUser,
    lat: js.UndefOr[Double] = js.undefined,
    lng: js.UndefOr[Double] = js.undefined,
    location: LikedFeedResponseLocation = null,
    next_max_id: String = null,
    usertags: LikedFeedResponseUsertags = null
  ): LikedFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lng)) __obj.updateDynamic("lng")(lng.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseItemsItem]
  }
}

