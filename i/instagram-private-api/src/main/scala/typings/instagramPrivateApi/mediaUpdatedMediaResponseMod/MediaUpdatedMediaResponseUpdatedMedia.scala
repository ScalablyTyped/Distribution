package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseUpdatedMedia extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_send_custom_emojis: Boolean
  var can_view_more_preview_comments: Boolean
  var can_viewer_save: Boolean
  var caption: MediaUpdatedMediaResponseCaption
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var creative_config: MediaUpdatedMediaResponseCreativeConfig
  var device_timestamp: Double
  var expiring_at: Double
  var filter_type: Double
  var has_liked: Boolean
  var has_more_comments: Boolean
  var has_shared_to_fb: Double
  var id: String
  var image_versions2: MediaUpdatedMediaResponseImageVersions2
  var is_pride_media: Boolean
  var is_reel_media: Boolean
  var like_count: Double
  var likers: js.Array[_]
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[_]
  var show_one_tap_fb_share_tooltip: Boolean
  var story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem]
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var user: MediaUpdatedMediaResponseUser
}

object MediaUpdatedMediaResponseUpdatedMedia {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    can_send_custom_emojis: Boolean,
    can_view_more_preview_comments: Boolean,
    can_viewer_save: Boolean,
    caption: MediaUpdatedMediaResponseCaption,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    creative_config: MediaUpdatedMediaResponseCreativeConfig,
    device_timestamp: Double,
    expiring_at: Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: MediaUpdatedMediaResponseImageVersions2,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    like_count: Double,
    likers: js.Array[_],
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    show_one_tap_fb_share_tooltip: Boolean,
    story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem],
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: MediaUpdatedMediaResponseUser
  ): MediaUpdatedMediaResponseUpdatedMedia = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_send_custom_emojis = can_send_custom_emojis.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], creative_config = creative_config.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_polls = story_polls.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseUpdatedMedia]
  }
}

