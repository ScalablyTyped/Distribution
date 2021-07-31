package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseItem extends StObject {
  
  var can_view_more_preview_comments: Boolean
  
  var can_viewer_reshare: Boolean
  
  var can_viewer_save: Boolean
  
  var caption: IgtvBrowseFeedResponseCaption
  
  var caption_is_edited: Boolean
  
  var client_cache_key: String
  
  var code: String
  
  var comment_count: Double
  
  var comment_likes_enabled: Boolean
  
  var comment_threading_enabled: Boolean
  
  var device_timestamp: Double
  
  var explore: IgtvBrowseFeedResponseExplore
  
  var filter_type: Double
  
  var has_audio: Boolean
  
  var has_more_comments: Boolean
  
  var id: String
  
  var image_versions2: IgtvBrowseFeedResponseImageVersions2
  
  var is_dash_eligible: Double
  
  var max_num_visible_preview_comments: Double
  
  var media_cropping_info: IgtvBrowseFeedResponseMediaCroppingInfo
  
  var media_type: Double
  
  var mezql_token: String
  
  var nearly_complete_copyright_match: Boolean
  
  var number_of_qualities: Double
  
  var organic_tracking_token: String
  
  var original_height: Double
  
  var original_width: Double
  
  var photo_of_you: Boolean
  
  var pk: String
  
  var preview_comments: js.Array[js.Any]
  
  var product_type: String
  
  var taken_at: Double
  
  var thumbnails: IgtvBrowseFeedResponseThumbnails
  
  var title: String
  
  var user: IgtvBrowseFeedResponseUser
  
  var video_codec: String
  
  var video_dash_manifest: String
  
  var video_duration: Double
  
  var video_versions: js.Array[IgtvBrowseFeedResponseVideoVersionsItem]
  
  var view_count: Double
}
object IgtvBrowseFeedResponseItem {
  
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: IgtvBrowseFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    explore: IgtvBrowseFeedResponseExplore,
    filter_type: Double,
    has_audio: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: IgtvBrowseFeedResponseImageVersions2,
    is_dash_eligible: Double,
    max_num_visible_preview_comments: Double,
    media_cropping_info: IgtvBrowseFeedResponseMediaCroppingInfo,
    media_type: Double,
    mezql_token: String,
    nearly_complete_copyright_match: Boolean,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[js.Any],
    product_type: String,
    taken_at: Double,
    thumbnails: IgtvBrowseFeedResponseThumbnails,
    title: String,
    user: IgtvBrowseFeedResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[IgtvBrowseFeedResponseVideoVersionsItem],
    view_count: Double
  ): IgtvBrowseFeedResponseItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], explore = explore.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_cropping_info = media_cropping_info.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], mezql_token = mezql_token.asInstanceOf[js.Any], nearly_complete_copyright_match = nearly_complete_copyright_match.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], product_type = product_type.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any], view_count = view_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseItem]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseItemMutableBuilder[Self <: IgtvBrowseFeedResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: IgtvBrowseFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore(value: IgtvBrowseFeedResponseExplore): Self = StObject.set(x, "explore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: IgtvBrowseFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_cropping_info(value: IgtvBrowseFeedResponseMediaCroppingInfo): Self = StObject.set(x, "media_cropping_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMezql_token(value: String): Self = StObject.set(x, "mezql_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearly_complete_copyright_match(value: Boolean): Self = StObject.set(x, "nearly_complete_copyright_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_comments(value: js.Array[js.Any]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setProduct_type(value: String): Self = StObject.set(x, "product_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: IgtvBrowseFeedResponseThumbnails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IgtvBrowseFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versions(value: js.Array[IgtvBrowseFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsVarargs(value: IgtvBrowseFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    @scala.inline
    def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
  }
}
