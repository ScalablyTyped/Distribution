package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseItemsItem extends js.Object {
  var boost_unavailable_reason: String
  var boosted_status: String
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var creative_config: js.UndefOr[HighlightsRepositoryEditReelResponseCreative_config] = js.undefined
  var device_timestamp: Double
  var fb_user_tags: js.UndefOr[HighlightsRepositoryEditReelResponseFb_user_tags] = js.undefined
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_shared_to_fb: Double
  var highlight_reel_ids: js.Array[String]
  var id: String
  var image_versions2: HighlightsRepositoryEditReelResponseImage_versions2
  var imported_taken_at: js.UndefOr[Double] = js.undefined
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var is_pride_media: Boolean
  var is_reel_media: Boolean
  var media_type: Double
  var multi_author_reel_names: js.Array[_]
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var show_one_tap_fb_share_tooltip: Boolean
  var story_is_saved_to_archive: Boolean
  var story_quiz_participant_infos: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]] = js.undefined
  var story_quizs: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseStoryQuizsItem]] = js.undefined
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var timezone_offset: Double
  var total_viewer_count: Double
  var user: HighlightsRepositoryEditReelResponseUser
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseVideoVersionsItem]] = js.undefined
  var viewer_count: Double
  var viewer_cursor: Null
  var viewers: js.Array[_]
}

object HighlightsRepositoryEditReelResponseItemsItem {
  @scala.inline
  def apply(
    boost_unavailable_reason: String,
    boosted_status: String,
    can_reply: Boolean,
    can_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    device_timestamp: Double,
    filter_type: Double,
    has_shared_to_fb: Double,
    highlight_reel_ids: js.Array[String],
    id: String,
    image_versions2: HighlightsRepositoryEditReelResponseImage_versions2,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    media_type: Double,
    multi_author_reel_names: js.Array[_],
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    show_one_tap_fb_share_tooltip: Boolean,
    story_is_saved_to_archive: Boolean,
    supports_reel_reactions: Boolean,
    taken_at: Double,
    timezone_offset: Double,
    total_viewer_count: Double,
    user: HighlightsRepositoryEditReelResponseUser,
    viewer_count: Double,
    viewer_cursor: Null,
    viewers: js.Array[_],
    creative_config: HighlightsRepositoryEditReelResponseCreative_config = null,
    fb_user_tags: HighlightsRepositoryEditReelResponseFb_user_tags = null,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    imported_taken_at: Int | Double = null,
    is_dash_eligible: Int | Double = null,
    number_of_qualities: Int | Double = null,
    story_quiz_participant_infos: js.Array[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem] = null,
    story_quizs: js.Array[HighlightsRepositoryEditReelResponseStoryQuizsItem] = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[HighlightsRepositoryEditReelResponseVideoVersionsItem] = null
  ): HighlightsRepositoryEditReelResponseItemsItem = {
    val __obj = js.Dynamic.literal(boost_unavailable_reason = boost_unavailable_reason, boosted_status = boosted_status, can_reply = can_reply, can_reshare = can_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, caption_position = caption_position, client_cache_key = client_cache_key, code = code, device_timestamp = device_timestamp, filter_type = filter_type, has_shared_to_fb = has_shared_to_fb, highlight_reel_ids = highlight_reel_ids, id = id, image_versions2 = image_versions2, is_pride_media = is_pride_media, is_reel_media = is_reel_media, media_type = media_type, multi_author_reel_names = multi_author_reel_names, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip, story_is_saved_to_archive = story_is_saved_to_archive, supports_reel_reactions = supports_reel_reactions, taken_at = taken_at, timezone_offset = timezone_offset, total_viewer_count = total_viewer_count, user = user, viewer_count = viewer_count, viewer_cursor = viewer_cursor, viewers = viewers)
    if (creative_config != null) __obj.updateDynamic("creative_config")(creative_config)
    if (fb_user_tags != null) __obj.updateDynamic("fb_user_tags")(fb_user_tags)
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio)
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (story_quiz_participant_infos != null) __obj.updateDynamic("story_quiz_participant_infos")(story_quiz_participant_infos)
    if (story_quizs != null) __obj.updateDynamic("story_quizs")(story_quizs)
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec)
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest)
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions)
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseItemsItem]
  }
}

