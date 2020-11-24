package typings.instagramPrivateApi.userStoryFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStoryFeedResponseItemsItem extends js.Object {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: Null = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var caption_position: Double = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var device_timestamp: String | Double = js.native
  
  var expiring_at: Double = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_shared_to_fb: Double = js.native
  
  var id: String = js.native
  
  var image_versions2: UserStoryFeedResponseImageVersions2 = js.native
  
  var imported_taken_at: Double = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var is_pride_media: Boolean = js.native
  
  var is_reel_media: Boolean = js.native
  
  var media_type: Double = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var show_one_tap_fb_share_tooltip: Boolean = js.native
  
  var story_locations: js.UndefOr[js.Array[UserStoryFeedResponseStoryLocationsItem]] = js.native
  
  var supports_reel_reactions: Boolean = js.native
  
  var taken_at: Double = js.native
  
  var user: UserStoryFeedResponseUser = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[UserStoryFeedResponseVideoVersionsItem]] = js.native
}
object UserStoryFeedResponseItemsItem {
  
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
    device_timestamp: String | Double,
    expiring_at: Double,
    filter_type: Double,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: UserStoryFeedResponseImageVersions2,
    imported_taken_at: Double,
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
    user: UserStoryFeedResponseUser
  ): UserStoryFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], imported_taken_at = imported_taken_at.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStoryFeedResponseItemsItem]
  }
  
  @scala.inline
  implicit class UserStoryFeedResponseItemsItemOps[Self <: UserStoryFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: Null): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_position(value: Double): Self = this.set("caption_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = this.set("has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: UserStoryFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = this.set("imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pride_media(value: Boolean): Self = this.set("is_pride_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = this.set("is_reel_media", value.asInstanceOf[js.Any])
    
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
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = this.set("show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = this.set("supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserStoryFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_audio: Self = this.set("has_audio", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_dash_eligible: Self = this.set("is_dash_eligible", js.undefined)
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = this.set("number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber_of_qualities: Self = this.set("number_of_qualities", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: UserStoryFeedResponseStoryLocationsItem*): Self = this.set("story_locations", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[UserStoryFeedResponseStoryLocationsItem]): Self = this.set("story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_locations: Self = this.set("story_locations", js.undefined)
    
    @scala.inline
    def setVideo_codec(value: String): Self = this.set("video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_codec: Self = this.set("video_codec", js.undefined)
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = this.set("video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_dash_manifest: Self = this.set("video_dash_manifest", js.undefined)
    
    @scala.inline
    def setVideo_duration(value: Double): Self = this.set("video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_duration: Self = this.set("video_duration", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: UserStoryFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[UserStoryFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_versions: Self = this.set("video_versions", js.undefined)
  }
}
