package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseUpdated_media extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var creative_config: ListReelMediaViewerFeedResponseCreative_config
  var device_timestamp: Double
  var expiring_at: Double
  var fb_user_tags: ListReelMediaViewerFeedResponseFb_user_tags
  var filter_type: Double
  var has_shared_to_fb: Double
  var id: String
  var image_versions2: ListReelMediaViewerFeedResponseImage_versions2
  var is_pride_media: Boolean
  var is_reel_media: Boolean
  var media_type: Double
  var multi_author_reel_names: js.Array[_]
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var reel_mentions: js.Array[ListReelMediaViewerFeedResponseReelMentionsItem]
  var show_one_tap_fb_share_tooltip: Boolean
  var story_chat_request_infos: js.Array[ListReelMediaViewerFeedResponseStoryChatRequestInfosItem]
  var story_chats: js.Array[ListReelMediaViewerFeedResponseStoryChatsItem]
  var story_fundraiser_donation_infos: js.Array[ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem]
  var story_fundraisers: js.Array[ListReelMediaViewerFeedResponseStoryFundraisersItem]
  var story_hashtags: js.Array[ListReelMediaViewerFeedResponseStoryHashtagsItem]
  var story_is_saved_to_archive: Boolean
  var story_locations: js.Array[ListReelMediaViewerFeedResponseStoryLocationsItem]
  var supports_reel_reactions: Boolean
  var taken_at: Double
  var timezone_offset: Double
  var total_viewer_count: Double
  var user: ListReelMediaViewerFeedResponseUser
  var viewer_count: Double
  var viewer_cursor: Null
  var viewers: js.Array[ListReelMediaViewerFeedResponseViewersItem]
}

object ListReelMediaViewerFeedResponseUpdated_media {
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
    creative_config: ListReelMediaViewerFeedResponseCreative_config,
    device_timestamp: Double,
    expiring_at: Double,
    fb_user_tags: ListReelMediaViewerFeedResponseFb_user_tags,
    filter_type: Double,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: ListReelMediaViewerFeedResponseImage_versions2,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    media_type: Double,
    multi_author_reel_names: js.Array[_],
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    reel_mentions: js.Array[ListReelMediaViewerFeedResponseReelMentionsItem],
    show_one_tap_fb_share_tooltip: Boolean,
    story_chat_request_infos: js.Array[ListReelMediaViewerFeedResponseStoryChatRequestInfosItem],
    story_chats: js.Array[ListReelMediaViewerFeedResponseStoryChatsItem],
    story_fundraiser_donation_infos: js.Array[ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem],
    story_fundraisers: js.Array[ListReelMediaViewerFeedResponseStoryFundraisersItem],
    story_hashtags: js.Array[ListReelMediaViewerFeedResponseStoryHashtagsItem],
    story_is_saved_to_archive: Boolean,
    story_locations: js.Array[ListReelMediaViewerFeedResponseStoryLocationsItem],
    supports_reel_reactions: Boolean,
    taken_at: Double,
    timezone_offset: Double,
    total_viewer_count: Double,
    user: ListReelMediaViewerFeedResponseUser,
    viewer_count: Double,
    viewer_cursor: Null,
    viewers: js.Array[ListReelMediaViewerFeedResponseViewersItem]
  ): ListReelMediaViewerFeedResponseUpdated_media = {
    val __obj = js.Dynamic.literal(can_reply = can_reply, can_reshare = can_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, caption_position = caption_position, client_cache_key = client_cache_key, code = code, creative_config = creative_config, device_timestamp = device_timestamp, expiring_at = expiring_at, fb_user_tags = fb_user_tags, filter_type = filter_type, has_shared_to_fb = has_shared_to_fb, id = id, image_versions2 = image_versions2, is_pride_media = is_pride_media, is_reel_media = is_reel_media, media_type = media_type, multi_author_reel_names = multi_author_reel_names, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, reel_mentions = reel_mentions, show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip, story_chat_request_infos = story_chat_request_infos, story_chats = story_chats, story_fundraiser_donation_infos = story_fundraiser_donation_infos, story_fundraisers = story_fundraisers, story_hashtags = story_hashtags, story_is_saved_to_archive = story_is_saved_to_archive, story_locations = story_locations, supports_reel_reactions = supports_reel_reactions, taken_at = taken_at, timezone_offset = timezone_offset, total_viewer_count = total_viewer_count, user = user, viewer_count = viewer_count, viewer_cursor = viewer_cursor, viewers = viewers)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseUpdated_media]
  }
}

