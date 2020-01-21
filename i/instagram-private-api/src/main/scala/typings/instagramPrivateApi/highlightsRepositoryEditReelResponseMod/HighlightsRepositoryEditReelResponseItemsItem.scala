package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

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
  var creative_config: js.UndefOr[HighlightsRepositoryEditReelResponseCreativeConfig] = js.undefined
  var device_timestamp: Double
  var fb_user_tags: js.UndefOr[HighlightsRepositoryEditReelResponseFbUserTags] = js.undefined
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_shared_to_fb: Double
  var highlight_reel_ids: js.Array[String]
  var id: String
  var image_versions2: HighlightsRepositoryEditReelResponseImageVersions2
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
    image_versions2: HighlightsRepositoryEditReelResponseImageVersions2,
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
    creative_config: HighlightsRepositoryEditReelResponseCreativeConfig = null,
    fb_user_tags: HighlightsRepositoryEditReelResponseFbUserTags = null,
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
    val __obj = js.Dynamic.literal(boost_unavailable_reason = boost_unavailable_reason.asInstanceOf[js.Any], boosted_status = boosted_status.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], highlight_reel_ids = highlight_reel_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], multi_author_reel_names = multi_author_reel_names.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_is_saved_to_archive = story_is_saved_to_archive.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], timezone_offset = timezone_offset.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any], viewer_cursor = viewer_cursor.asInstanceOf[js.Any], viewers = viewers.asInstanceOf[js.Any])
    if (creative_config != null) __obj.updateDynamic("creative_config")(creative_config.asInstanceOf[js.Any])
    if (fb_user_tags != null) __obj.updateDynamic("fb_user_tags")(fb_user_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.asInstanceOf[js.Any])
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (story_quiz_participant_infos != null) __obj.updateDynamic("story_quiz_participant_infos")(story_quiz_participant_infos.asInstanceOf[js.Any])
    if (story_quizs != null) __obj.updateDynamic("story_quizs")(story_quizs.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseItemsItem]
  }
}

