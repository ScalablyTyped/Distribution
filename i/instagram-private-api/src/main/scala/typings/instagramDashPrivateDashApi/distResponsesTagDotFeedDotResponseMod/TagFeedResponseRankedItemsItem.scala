package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseRankedItemsItem extends js.Object {
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.undefined
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: TagFeedResponseCaption
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: js.UndefOr[Double] = js.undefined
  var comment_likes_enabled: js.UndefOr[Boolean] = js.undefined
  var comment_threading_enabled: js.UndefOr[Boolean] = js.undefined
  var comments_disabled: js.UndefOr[Boolean] = js.undefined
  var device_timestamp: String | Double
  var filter_type: Double
  var has_liked: Boolean
  var has_more_comments: js.UndefOr[Boolean] = js.undefined
  var id: String
  var image_versions2: TagFeedResponseImage_versions2
  var lat: js.UndefOr[Double | String] = js.undefined
  var like_count: Double
  var lng: js.UndefOr[Double | String] = js.undefined
  var location: js.UndefOr[TagFeedResponseLocation] = js.undefined
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.undefined
  var media_type: Double
  var next_max_id: js.UndefOr[String] = js.undefined
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.undefined
  var taken_at: Double
  var user: TagFeedResponseUser
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.undefined
}

object TagFeedResponseRankedItemsItem {
  @scala.inline
  def apply(
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: TagFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    id: String,
    image_versions2: TagFeedResponseImage_versions2,
    like_count: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser,
    can_view_more_preview_comments: js.UndefOr[Boolean] = js.undefined,
    comment_count: Int | Double = null,
    comment_likes_enabled: js.UndefOr[Boolean] = js.undefined,
    comment_threading_enabled: js.UndefOr[Boolean] = js.undefined,
    comments_disabled: js.UndefOr[Boolean] = js.undefined,
    has_more_comments: js.UndefOr[Boolean] = js.undefined,
    lat: Double | String = null,
    lng: Double | String = null,
    location: TagFeedResponseLocation = null,
    max_num_visible_preview_comments: Int | Double = null,
    next_max_id: String = null,
    preview_comments: js.Array[TagFeedResponsePreviewCommentsItem] = null,
    usertags: TagFeedResponseUsertags = null
  ): TagFeedResponseRankedItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(can_view_more_preview_comments)) __obj.updateDynamic("can_view_more_preview_comments")(can_view_more_preview_comments.asInstanceOf[js.Any])
    if (comment_count != null) __obj.updateDynamic("comment_count")(comment_count.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_likes_enabled)) __obj.updateDynamic("comment_likes_enabled")(comment_likes_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_threading_enabled)) __obj.updateDynamic("comment_threading_enabled")(comment_threading_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(comments_disabled)) __obj.updateDynamic("comments_disabled")(comments_disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more_comments)) __obj.updateDynamic("has_more_comments")(has_more_comments.asInstanceOf[js.Any])
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (max_num_visible_preview_comments != null) __obj.updateDynamic("max_num_visible_preview_comments")(max_num_visible_preview_comments.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id.asInstanceOf[js.Any])
    if (preview_comments != null) __obj.updateDynamic("preview_comments")(preview_comments.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseRankedItemsItem]
  }
}

