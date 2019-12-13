package typings.instagramDashPrivateDashApi.distResponsesIgtvDotChannelDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseItemsItem extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: IgtvChannelFeedResponseCaption
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double | String
  var filter_type: Double
  var has_audio: Boolean
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: IgtvChannelFeedResponseImage_versions2
  var is_dash_eligible: Double
  var like_count: Double
  var max_num_visible_preview_comments: Double
  var media_cropping_info: IgtvChannelFeedResponseMedia_cropping_info
  var media_type: Double
  var nearly_complete_copyright_match: Boolean
  var next_max_id: String
  var number_of_qualities: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[IgtvChannelFeedResponsePreviewCommentsItem]
  var product_type: String
  var taken_at: Double
  var thumbnails: IgtvChannelFeedResponseThumbnails
  var title: String
  var user: IgtvChannelFeedResponseUser
  var video_codec: String
  var video_dash_manifest: String
  var video_duration: Double
  var video_versions: js.Array[IgtvChannelFeedResponseVideoVersionsItem]
  var view_count: Double
}

object IgtvChannelFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: IgtvChannelFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double | String,
    filter_type: Double,
    has_audio: Boolean,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: IgtvChannelFeedResponseImage_versions2,
    is_dash_eligible: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_cropping_info: IgtvChannelFeedResponseMedia_cropping_info,
    media_type: Double,
    nearly_complete_copyright_match: Boolean,
    next_max_id: String,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[IgtvChannelFeedResponsePreviewCommentsItem],
    product_type: String,
    taken_at: Double,
    thumbnails: IgtvChannelFeedResponseThumbnails,
    title: String,
    user: IgtvChannelFeedResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[IgtvChannelFeedResponseVideoVersionsItem],
    view_count: Double
  ): IgtvChannelFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_cropping_info = media_cropping_info.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], nearly_complete_copyright_match = nearly_complete_copyright_match.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], product_type = product_type.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any], view_count = view_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvChannelFeedResponseItemsItem]
  }
}

