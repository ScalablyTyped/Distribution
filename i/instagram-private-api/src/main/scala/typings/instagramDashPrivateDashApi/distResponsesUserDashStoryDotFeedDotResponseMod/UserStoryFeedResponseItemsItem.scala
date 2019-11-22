package typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStoryFeedResponseItemsItem extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var device_timestamp: String | Double
  var expiring_at: Double
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_shared_to_fb: Double
  var id: String
  var image_versions2: UserStoryFeedResponseImage_versions2
  var imported_taken_at: Double
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var is_pride_media: Boolean
  var is_reel_media: Boolean
  var media_type: Double
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var show_one_tap_fb_share_tooltip: Boolean
  var story_locations: js.UndefOr[js.Array[UserStoryFeedResponseStoryLocationsItem]] = js.undefined
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var user: UserStoryFeedResponseUser
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[UserStoryFeedResponseVideoVersionsItem]] = js.undefined
}

object UserStoryFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    expiring_at: Double,
    filter_type: Double,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: UserStoryFeedResponseImage_versions2,
    imported_taken_at: Double,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    show_one_tap_fb_share_tooltip: Boolean,
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: UserStoryFeedResponseUser,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    is_dash_eligible: Int | Double = null,
    number_of_qualities: Int | Double = null,
    story_locations: js.Array[UserStoryFeedResponseStoryLocationsItem] = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[UserStoryFeedResponseVideoVersionsItem] = null
  ): UserStoryFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply, can_reshare = can_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, caption_position = caption_position, client_cache_key = client_cache_key, code = code, device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at, filter_type = filter_type, has_shared_to_fb = has_shared_to_fb, id = id, image_versions2 = image_versions2, imported_taken_at = imported_taken_at, is_pride_media = is_pride_media, is_reel_media = is_reel_media, media_type = media_type, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip, supports_reel_reactions = supports_reel_reactions, taken_at = taken_at, user = user)
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio)
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (story_locations != null) __obj.updateDynamic("story_locations")(story_locations)
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec)
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest)
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions)
    __obj.asInstanceOf[UserStoryFeedResponseItemsItem]
  }
}

