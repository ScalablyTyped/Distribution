package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseItem extends js.Object {
  var ad_action: js.UndefOr[String] = js.undefined
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var device_timestamp: String
  var expiring_at: Double
  var filter_type: Double
  var has_audio: Boolean
  var has_shared_to_fb: Double
  var id: String
  var image_versions2: ReelsMediaFeedResponseImageVersions2
  var imported_taken_at: js.UndefOr[Double] = js.undefined
  var is_dash_eligible: Double
  var is_reel_media: Boolean
  var link_text: js.UndefOr[String] = js.undefined
  var media_type: Double
  var number_of_qualities: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var reel_mentions: js.UndefOr[js.Array[ReelsMediaFeedResponseReelMentionsItem]] = js.undefined
  var show_one_tap_fb_share_tooltip: Boolean
  var story_cta: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCtaItem]] = js.undefined
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var user: ReelsMediaFeedResponseUser
  var video_codec: String
  var video_dash_manifest: String
  var video_duration: Double
  var video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem]
}

object ReelsMediaFeedResponseItem {
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
    device_timestamp: String,
    expiring_at: Double,
    filter_type: Double,
    has_audio: Boolean,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: ReelsMediaFeedResponseImageVersions2,
    is_dash_eligible: Double,
    is_reel_media: Boolean,
    media_type: Double,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    show_one_tap_fb_share_tooltip: Boolean,
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: ReelsMediaFeedResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem],
    ad_action: String = null,
    imported_taken_at: Int | Double = null,
    link_text: String = null,
    reel_mentions: js.Array[ReelsMediaFeedResponseReelMentionsItem] = null,
    story_cta: js.Array[ReelsMediaFeedResponseStoryCtaItem] = null
  ): ReelsMediaFeedResponseItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply, can_reshare = can_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, caption_position = caption_position, client_cache_key = client_cache_key, code = code, device_timestamp = device_timestamp, expiring_at = expiring_at, filter_type = filter_type, has_audio = has_audio, has_shared_to_fb = has_shared_to_fb, id = id, image_versions2 = image_versions2, is_dash_eligible = is_dash_eligible, is_reel_media = is_reel_media, media_type = media_type, number_of_qualities = number_of_qualities, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip, supports_reel_reactions = supports_reel_reactions, taken_at = taken_at, user = user, video_codec = video_codec, video_dash_manifest = video_dash_manifest, video_duration = video_duration, video_versions = video_versions)
    if (ad_action != null) __obj.updateDynamic("ad_action")(ad_action)
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (link_text != null) __obj.updateDynamic("link_text")(link_text)
    if (reel_mentions != null) __obj.updateDynamic("reel_mentions")(reel_mentions)
    if (story_cta != null) __obj.updateDynamic("story_cta")(story_cta)
    __obj.asInstanceOf[ReelsMediaFeedResponseItem]
  }
}

