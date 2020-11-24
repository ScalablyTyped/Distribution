package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseItem extends js.Object {
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: IgtvBrowseFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var device_timestamp: Double = js.native
  
  var explore: IgtvBrowseFeedResponseExplore = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: Boolean = js.native
  
  var has_more_comments: Boolean = js.native
  
  var id: String = js.native
  
  var image_versions2: IgtvBrowseFeedResponseImageVersions2 = js.native
  
  var is_dash_eligible: Double = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_cropping_info: IgtvBrowseFeedResponseMediaCroppingInfo = js.native
  
  var media_type: Double = js.native
  
  var mezql_token: String = js.native
  
  var nearly_complete_copyright_match: Boolean = js.native
  
  var number_of_qualities: Double = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.Array[_] = js.native
  
  var product_type: String = js.native
  
  var taken_at: Double = js.native
  
  var thumbnails: IgtvBrowseFeedResponseThumbnails = js.native
  
  var title: String = js.native
  
  var user: IgtvBrowseFeedResponseUser = js.native
  
  var video_codec: String = js.native
  
  var video_dash_manifest: String = js.native
  
  var video_duration: Double = js.native
  
  var video_versions: js.Array[IgtvBrowseFeedResponseVideoVersionsItem] = js.native
  
  var view_count: Double = js.native
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
    preview_comments: js.Array[_],
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
  implicit class IgtvBrowseFeedResponseItemOps[Self <: IgtvBrowseFeedResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: IgtvBrowseFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = this.set("comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore(value: IgtvBrowseFeedResponseExplore): Self = this.set("explore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: IgtvBrowseFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_cropping_info(value: IgtvBrowseFeedResponseMediaCroppingInfo): Self = this.set("media_cropping_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMezql_token(value: String): Self = this.set("mezql_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearly_complete_copyright_match(value: Boolean): Self = this.set("nearly_complete_copyright_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = this.set("number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: js.Any*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[_]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_type(value: String): Self = this.set("product_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: IgtvBrowseFeedResponseThumbnails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IgtvBrowseFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codec(value: String): Self = this.set("video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = this.set("video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_duration(value: Double): Self = this.set("video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsVarargs(value: IgtvBrowseFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[IgtvBrowseFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
  }
}
