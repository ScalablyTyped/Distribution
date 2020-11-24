package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseRankedItemsItem extends js.Object {
  
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.native
  
  var can_viewer_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: TagFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: js.UndefOr[Double] = js.native
  
  var comment_likes_enabled: js.UndefOr[Boolean] = js.native
  
  var comment_threading_enabled: js.UndefOr[Boolean] = js.native
  
  var comments_disabled: js.UndefOr[Boolean] = js.native
  
  var device_timestamp: String | Double = js.native
  
  var filter_type: Double = js.native
  
  var has_liked: Boolean = js.native
  
  var has_more_comments: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var image_versions2: TagFeedResponseImageVersions2 = js.native
  
  var lat: js.UndefOr[Double | String] = js.native
  
  var like_count: Double = js.native
  
  var lng: js.UndefOr[Double | String] = js.native
  
  var location: js.UndefOr[TagFeedResponseLocation] = js.native
  
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.native
  
  var media_type: Double = js.native
  
  var next_max_id: js.UndefOr[String] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.native
  
  var taken_at: Double = js.native
  
  var user: TagFeedResponseUser = js.native
  
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.native
}
object TagFeedResponseRankedItemsItem {
  
  @scala.inline
  def apply(
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: TagFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    id: String,
    image_versions2: TagFeedResponseImageVersions2,
    like_count: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser
  ): TagFeedResponseRankedItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseRankedItemsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseRankedItemsItemOps[Self <: TagFeedResponseRankedItemsItem] (val x: Self) extends AnyVal {
    
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
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TagFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = this.set("has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TagFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
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
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_view_more_preview_comments: Self = this.set("can_view_more_preview_comments", js.undefined)
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_count: Self = this.set("comment_count", js.undefined)
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_likes_enabled: Self = this.set("comment_likes_enabled", js.undefined)
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = this.set("comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_threading_enabled: Self = this.set("comment_threading_enabled", js.undefined)
    
    @scala.inline
    def setComments_disabled(value: Boolean): Self = this.set("comments_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments_disabled: Self = this.set("comments_disabled", js.undefined)
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_more_comments: Self = this.set("has_more_comments", js.undefined)
    
    @scala.inline
    def setLat(value: Double | String): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLng(value: Double | String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TagFeedResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_num_visible_preview_comments: Self = this.set("max_num_visible_preview_comments", js.undefined)
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_max_id: Self = this.set("next_max_id", js.undefined)
    
    @scala.inline
    def setPreview_commentsVarargs(value: TagFeedResponsePreviewCommentsItem*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[TagFeedResponsePreviewCommentsItem]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview_comments: Self = this.set("preview_comments", js.undefined)
    
    @scala.inline
    def setUsertags(value: TagFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
