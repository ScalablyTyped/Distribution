package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseArgs extends js.Object {
  
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  var aymt_channel_id: js.UndefOr[String] = js.native
  
  var aymt_notif_id: js.UndefOr[String] = js.native
  
  var aymt_notif_type: js.UndefOr[String] = js.native
  
  var clicked: Boolean = js.native
  
  var comment_id: js.UndefOr[String] = js.native
  
  var comment_ids: js.UndefOr[js.Array[String]] = js.native
  
  var comment_notif_type: js.UndefOr[String] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var hashtag_follow: js.UndefOr[NewsRepositoryInboxResponseHashtagFollow] = js.native
  
  var icon_url: js.UndefOr[String] = js.native
  
  var latest_reel_media: js.UndefOr[Double] = js.native
  
  var links: js.UndefOr[js.Array[NewsRepositoryInboxResponseLinksItem]] = js.native
  
  var media: js.UndefOr[js.Array[NewsRepositoryInboxResponseMediaItem]] = js.native
  
  var profile_id: js.UndefOr[Double] = js.native
  
  var profile_image: js.UndefOr[String] = js.native
  
  var profile_image_destination: js.UndefOr[String] = js.native
  
  var profile_name: js.UndefOr[String] = js.native
  
  var rich_text: js.UndefOr[String] = js.native
  
  var second_profile_id: js.UndefOr[Double] = js.native
  
  var second_profile_image: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var timestamp: String = js.native
  
  var tuuid: String = js.native
}
object NewsRepositoryInboxResponseArgs {
  
  @scala.inline
  def apply(clicked: Boolean, timestamp: String, tuuid: String): NewsRepositoryInboxResponseArgs = {
    val __obj = js.Dynamic.literal(clicked = clicked.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseArgs]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseArgsOps[Self <: NewsRepositoryInboxResponseArgs] (val x: Self) extends AnyVal {
    
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
    def setClicked(value: Boolean): Self = this.set("clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuuid(value: String): Self = this.set("tuuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAymt_channel_id(value: String): Self = this.set("aymt_channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAymt_channel_id: Self = this.set("aymt_channel_id", js.undefined)
    
    @scala.inline
    def setAymt_notif_id(value: String): Self = this.set("aymt_notif_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAymt_notif_id: Self = this.set("aymt_notif_id", js.undefined)
    
    @scala.inline
    def setAymt_notif_type(value: String): Self = this.set("aymt_notif_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAymt_notif_type: Self = this.set("aymt_notif_type", js.undefined)
    
    @scala.inline
    def setComment_id(value: String): Self = this.set("comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_id: Self = this.set("comment_id", js.undefined)
    
    @scala.inline
    def setComment_idsVarargs(value: String*): Self = this.set("comment_ids", js.Array(value :_*))
    
    @scala.inline
    def setComment_ids(value: js.Array[String]): Self = this.set("comment_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_ids: Self = this.set("comment_ids", js.undefined)
    
    @scala.inline
    def setComment_notif_type(value: String): Self = this.set("comment_notif_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_notif_type: Self = this.set("comment_notif_type", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setHashtag_follow(value: NewsRepositoryInboxResponseHashtagFollow): Self = this.set("hashtag_follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag_follow: Self = this.set("hashtag_follow", js.undefined)
    
    @scala.inline
    def setIcon_url(value: String): Self = this.set("icon_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon_url: Self = this.set("icon_url", js.undefined)
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = this.set("latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatest_reel_media: Self = this.set("latest_reel_media", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: NewsRepositoryInboxResponseLinksItem*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[NewsRepositoryInboxResponseLinksItem]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: NewsRepositoryInboxResponseMediaItem*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[NewsRepositoryInboxResponseMediaItem]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setProfile_id(value: Double): Self = this.set("profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_id: Self = this.set("profile_id", js.undefined)
    
    @scala.inline
    def setProfile_image(value: String): Self = this.set("profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_image: Self = this.set("profile_image", js.undefined)
    
    @scala.inline
    def setProfile_image_destination(value: String): Self = this.set("profile_image_destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_image_destination: Self = this.set("profile_image_destination", js.undefined)
    
    @scala.inline
    def setProfile_name(value: String): Self = this.set("profile_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_name: Self = this.set("profile_name", js.undefined)
    
    @scala.inline
    def setRich_text(value: String): Self = this.set("rich_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRich_text: Self = this.set("rich_text", js.undefined)
    
    @scala.inline
    def setSecond_profile_id(value: Double): Self = this.set("second_profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond_profile_id: Self = this.set("second_profile_id", js.undefined)
    
    @scala.inline
    def setSecond_profile_image(value: String): Self = this.set("second_profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond_profile_image: Self = this.set("second_profile_image", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
