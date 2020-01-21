package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseItemsItem extends js.Object {
  var attribution: js.UndefOr[ReelsTrayFeedResponseAttribution] = js.undefined
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var creative_config: js.UndefOr[ReelsTrayFeedResponseCreativeConfig] = js.undefined
  var device_timestamp: Double | String
  var expiring_at: Double
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_shared_to_fb: Double
  var id: String
  var image_versions2: ReelsTrayFeedResponseImageVersions2
  var imported_taken_at: js.UndefOr[Double] = js.undefined
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
  var reel_mentions: js.UndefOr[js.Array[ReelsTrayFeedResponseReelMentionsItem]] = js.undefined
  var show_one_tap_fb_share_tooltip: Boolean
  var story_locations: js.UndefOr[js.Array[ReelsTrayFeedResponseStoryLocationsItem]] = js.undefined
  var story_polls: js.UndefOr[js.Array[ReelsTrayFeedResponseStoryPollsItem]] = js.undefined
  var story_questions: js.UndefOr[js.Array[ReelsTrayFeedResponseStoryQuestionsItem]] = js.undefined
  var story_quizs: js.UndefOr[js.Array[ReelsTrayFeedResponseStoryQuizsItem]] = js.undefined
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var user: ReelsTrayFeedResponseUser
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[ReelsTrayFeedResponseVideoVersionsItem]] = js.undefined
}

object ReelsTrayFeedResponseItemsItem {
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
    device_timestamp: Double | String,
    expiring_at: Double,
    filter_type: Double,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: ReelsTrayFeedResponseImageVersions2,
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
    user: ReelsTrayFeedResponseUser,
    attribution: ReelsTrayFeedResponseAttribution = null,
    creative_config: ReelsTrayFeedResponseCreativeConfig = null,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    imported_taken_at: Int | Double = null,
    is_dash_eligible: Int | Double = null,
    number_of_qualities: Int | Double = null,
    reel_mentions: js.Array[ReelsTrayFeedResponseReelMentionsItem] = null,
    story_locations: js.Array[ReelsTrayFeedResponseStoryLocationsItem] = null,
    story_polls: js.Array[ReelsTrayFeedResponseStoryPollsItem] = null,
    story_questions: js.Array[ReelsTrayFeedResponseStoryQuestionsItem] = null,
    story_quizs: js.Array[ReelsTrayFeedResponseStoryQuizsItem] = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[ReelsTrayFeedResponseVideoVersionsItem] = null
  ): ReelsTrayFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (creative_config != null) __obj.updateDynamic("creative_config")(creative_config.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.asInstanceOf[js.Any])
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (reel_mentions != null) __obj.updateDynamic("reel_mentions")(reel_mentions.asInstanceOf[js.Any])
    if (story_locations != null) __obj.updateDynamic("story_locations")(story_locations.asInstanceOf[js.Any])
    if (story_polls != null) __obj.updateDynamic("story_polls")(story_polls.asInstanceOf[js.Any])
    if (story_questions != null) __obj.updateDynamic("story_questions")(story_questions.asInstanceOf[js.Any])
    if (story_quizs != null) __obj.updateDynamic("story_quizs")(story_quizs.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseItemsItem]
  }
}

