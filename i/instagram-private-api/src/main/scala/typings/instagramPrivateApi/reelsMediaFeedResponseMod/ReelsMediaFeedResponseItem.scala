package typings.instagramPrivateApi.reelsMediaFeedResponseMod

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
  var story_countdowns: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCountdownsItem]] = js.undefined
  var story_cta: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCtaItem]] = js.undefined
  var story_polls: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryPollsItem]] = js.undefined
  var story_questions: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuestionsItem]] = js.undefined
  var story_quizs: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuizsItem]] = js.undefined
  var story_sliders: js.UndefOr[js.Array[ReelsMediaFeedResponseStorySlidersItem]] = js.undefined
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
    story_countdowns: js.Array[ReelsMediaFeedResponseStoryCountdownsItem] = null,
    story_cta: js.Array[ReelsMediaFeedResponseStoryCtaItem] = null,
    story_polls: js.Array[ReelsMediaFeedResponseStoryPollsItem] = null,
    story_questions: js.Array[ReelsMediaFeedResponseStoryQuestionsItem] = null,
    story_quizs: js.Array[ReelsMediaFeedResponseStoryQuizsItem] = null,
    story_sliders: js.Array[ReelsMediaFeedResponseStorySlidersItem] = null
  ): ReelsMediaFeedResponseItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any])
    if (ad_action != null) __obj.updateDynamic("ad_action")(ad_action.asInstanceOf[js.Any])
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (link_text != null) __obj.updateDynamic("link_text")(link_text.asInstanceOf[js.Any])
    if (reel_mentions != null) __obj.updateDynamic("reel_mentions")(reel_mentions.asInstanceOf[js.Any])
    if (story_countdowns != null) __obj.updateDynamic("story_countdowns")(story_countdowns.asInstanceOf[js.Any])
    if (story_cta != null) __obj.updateDynamic("story_cta")(story_cta.asInstanceOf[js.Any])
    if (story_polls != null) __obj.updateDynamic("story_polls")(story_polls.asInstanceOf[js.Any])
    if (story_questions != null) __obj.updateDynamic("story_questions")(story_questions.asInstanceOf[js.Any])
    if (story_quizs != null) __obj.updateDynamic("story_quizs")(story_quizs.asInstanceOf[js.Any])
    if (story_sliders != null) __obj.updateDynamic("story_sliders")(story_sliders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseItem]
  }
}

