package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseArgs extends StObject {
  
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
  implicit class NewsRepositoryInboxResponseArgsMutableBuilder[Self <: NewsRepositoryInboxResponseArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAymt_channel_id(value: String): Self = StObject.set(x, "aymt_channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymt_channel_idUndefined: Self = StObject.set(x, "aymt_channel_id", js.undefined)
    
    @scala.inline
    def setAymt_notif_id(value: String): Self = StObject.set(x, "aymt_notif_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymt_notif_idUndefined: Self = StObject.set(x, "aymt_notif_id", js.undefined)
    
    @scala.inline
    def setAymt_notif_type(value: String): Self = StObject.set(x, "aymt_notif_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymt_notif_typeUndefined: Self = StObject.set(x, "aymt_notif_type", js.undefined)
    
    @scala.inline
    def setClicked(value: Boolean): Self = StObject.set(x, "clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_id(value: String): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_idUndefined: Self = StObject.set(x, "comment_id", js.undefined)
    
    @scala.inline
    def setComment_ids(value: js.Array[String]): Self = StObject.set(x, "comment_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_idsUndefined: Self = StObject.set(x, "comment_ids", js.undefined)
    
    @scala.inline
    def setComment_idsVarargs(value: String*): Self = StObject.set(x, "comment_ids", js.Array(value :_*))
    
    @scala.inline
    def setComment_notif_type(value: String): Self = StObject.set(x, "comment_notif_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_notif_typeUndefined: Self = StObject.set(x, "comment_notif_type", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setHashtag_follow(value: NewsRepositoryInboxResponseHashtagFollow): Self = StObject.set(x, "hashtag_follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtag_followUndefined: Self = StObject.set(x, "hashtag_follow", js.undefined)
    
    @scala.inline
    def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon_urlUndefined: Self = StObject.set(x, "icon_url", js.undefined)
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[NewsRepositoryInboxResponseLinksItem]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: NewsRepositoryInboxResponseLinksItem*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[NewsRepositoryInboxResponseMediaItem]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: NewsRepositoryInboxResponseMediaItem*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setProfile_id(value: Double): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_idUndefined: Self = StObject.set(x, "profile_id", js.undefined)
    
    @scala.inline
    def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_imageUndefined: Self = StObject.set(x, "profile_image", js.undefined)
    
    @scala.inline
    def setProfile_image_destination(value: String): Self = StObject.set(x, "profile_image_destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_image_destinationUndefined: Self = StObject.set(x, "profile_image_destination", js.undefined)
    
    @scala.inline
    def setProfile_name(value: String): Self = StObject.set(x, "profile_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_nameUndefined: Self = StObject.set(x, "profile_name", js.undefined)
    
    @scala.inline
    def setRich_text(value: String): Self = StObject.set(x, "rich_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRich_textUndefined: Self = StObject.set(x, "rich_text", js.undefined)
    
    @scala.inline
    def setSecond_profile_id(value: Double): Self = StObject.set(x, "second_profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_profile_idUndefined: Self = StObject.set(x, "second_profile_id", js.undefined)
    
    @scala.inline
    def setSecond_profile_image(value: String): Self = StObject.set(x, "second_profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_profile_imageUndefined: Self = StObject.set(x, "second_profile_image", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuuid(value: String): Self = StObject.set(x, "tuuid", value.asInstanceOf[js.Any])
  }
}
