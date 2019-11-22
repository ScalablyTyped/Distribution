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
    val __obj = js.Dynamic.literal(can_viewer_reshare = can_viewer_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, client_cache_key = client_cache_key, code = code, device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type, has_liked = has_liked, id = id, image_versions2 = image_versions2, like_count = like_count, media_type = media_type, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, taken_at = taken_at, user = user)
    if (!js.isUndefined(can_view_more_preview_comments)) __obj.updateDynamic("can_view_more_preview_comments")(can_view_more_preview_comments)
    if (comment_count != null) __obj.updateDynamic("comment_count")(comment_count.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_likes_enabled)) __obj.updateDynamic("comment_likes_enabled")(comment_likes_enabled)
    if (!js.isUndefined(comment_threading_enabled)) __obj.updateDynamic("comment_threading_enabled")(comment_threading_enabled)
    if (!js.isUndefined(comments_disabled)) __obj.updateDynamic("comments_disabled")(comments_disabled)
    if (!js.isUndefined(has_more_comments)) __obj.updateDynamic("has_more_comments")(has_more_comments)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (max_num_visible_preview_comments != null) __obj.updateDynamic("max_num_visible_preview_comments")(max_num_visible_preview_comments.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id)
    if (preview_comments != null) __obj.updateDynamic("preview_comments")(preview_comments)
    if (usertags != null) __obj.updateDynamic("usertags")(usertags)
    __obj.asInstanceOf[TagFeedResponseRankedItemsItem]
  }
}

