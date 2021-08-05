package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseArgs extends StObject {
  
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  var aymt_channel_id: js.UndefOr[String] = js.undefined
  
  var aymt_notif_id: js.UndefOr[String] = js.undefined
  
  var aymt_notif_type: js.UndefOr[String] = js.undefined
  
  var clicked: Boolean
  
  var comment_id: js.UndefOr[String] = js.undefined
  
  var comment_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var comment_notif_type: js.UndefOr[String] = js.undefined
  
  var destination: js.UndefOr[String] = js.undefined
  
  var hashtag_follow: js.UndefOr[NewsRepositoryInboxResponseHashtagFollow] = js.undefined
  
  var icon_url: js.UndefOr[String] = js.undefined
  
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  
  var links: js.UndefOr[js.Array[NewsRepositoryInboxResponseLinksItem]] = js.undefined
  
  var media: js.UndefOr[js.Array[NewsRepositoryInboxResponseMediaItem]] = js.undefined
  
  var profile_id: js.UndefOr[Double] = js.undefined
  
  var profile_image: js.UndefOr[String] = js.undefined
  
  var profile_image_destination: js.UndefOr[String] = js.undefined
  
  var profile_name: js.UndefOr[String] = js.undefined
  
  var rich_text: js.UndefOr[String] = js.undefined
  
  var second_profile_id: js.UndefOr[Double] = js.undefined
  
  var second_profile_image: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var timestamp: String
  
  var tuuid: String
}
object NewsRepositoryInboxResponseArgs {
  
  inline def apply(clicked: Boolean, timestamp: String, tuuid: String): NewsRepositoryInboxResponseArgs = {
    val __obj = js.Dynamic.literal(clicked = clicked.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseArgs]
  }
  
  extension [Self <: NewsRepositoryInboxResponseArgs](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setAymt_channel_id(value: String): Self = StObject.set(x, "aymt_channel_id", value.asInstanceOf[js.Any])
    
    inline def setAymt_channel_idUndefined: Self = StObject.set(x, "aymt_channel_id", js.undefined)
    
    inline def setAymt_notif_id(value: String): Self = StObject.set(x, "aymt_notif_id", value.asInstanceOf[js.Any])
    
    inline def setAymt_notif_idUndefined: Self = StObject.set(x, "aymt_notif_id", js.undefined)
    
    inline def setAymt_notif_type(value: String): Self = StObject.set(x, "aymt_notif_type", value.asInstanceOf[js.Any])
    
    inline def setAymt_notif_typeUndefined: Self = StObject.set(x, "aymt_notif_type", js.undefined)
    
    inline def setClicked(value: Boolean): Self = StObject.set(x, "clicked", value.asInstanceOf[js.Any])
    
    inline def setComment_id(value: String): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setComment_idUndefined: Self = StObject.set(x, "comment_id", js.undefined)
    
    inline def setComment_ids(value: js.Array[String]): Self = StObject.set(x, "comment_ids", value.asInstanceOf[js.Any])
    
    inline def setComment_idsUndefined: Self = StObject.set(x, "comment_ids", js.undefined)
    
    inline def setComment_idsVarargs(value: String*): Self = StObject.set(x, "comment_ids", js.Array(value :_*))
    
    inline def setComment_notif_type(value: String): Self = StObject.set(x, "comment_notif_type", value.asInstanceOf[js.Any])
    
    inline def setComment_notif_typeUndefined: Self = StObject.set(x, "comment_notif_type", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setHashtag_follow(value: NewsRepositoryInboxResponseHashtagFollow): Self = StObject.set(x, "hashtag_follow", value.asInstanceOf[js.Any])
    
    inline def setHashtag_followUndefined: Self = StObject.set(x, "hashtag_follow", js.undefined)
    
    inline def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
    
    inline def setIcon_urlUndefined: Self = StObject.set(x, "icon_url", js.undefined)
    
    inline def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    inline def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
    
    inline def setLinks(value: js.Array[NewsRepositoryInboxResponseLinksItem]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: NewsRepositoryInboxResponseLinksItem*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setMedia(value: js.Array[NewsRepositoryInboxResponseMediaItem]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: NewsRepositoryInboxResponseMediaItem*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    inline def setProfile_id(value: Double): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
    
    inline def setProfile_idUndefined: Self = StObject.set(x, "profile_id", js.undefined)
    
    inline def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    
    inline def setProfile_imageUndefined: Self = StObject.set(x, "profile_image", js.undefined)
    
    inline def setProfile_image_destination(value: String): Self = StObject.set(x, "profile_image_destination", value.asInstanceOf[js.Any])
    
    inline def setProfile_image_destinationUndefined: Self = StObject.set(x, "profile_image_destination", js.undefined)
    
    inline def setProfile_name(value: String): Self = StObject.set(x, "profile_name", value.asInstanceOf[js.Any])
    
    inline def setProfile_nameUndefined: Self = StObject.set(x, "profile_name", js.undefined)
    
    inline def setRich_text(value: String): Self = StObject.set(x, "rich_text", value.asInstanceOf[js.Any])
    
    inline def setRich_textUndefined: Self = StObject.set(x, "rich_text", js.undefined)
    
    inline def setSecond_profile_id(value: Double): Self = StObject.set(x, "second_profile_id", value.asInstanceOf[js.Any])
    
    inline def setSecond_profile_idUndefined: Self = StObject.set(x, "second_profile_id", js.undefined)
    
    inline def setSecond_profile_image(value: String): Self = StObject.set(x, "second_profile_image", value.asInstanceOf[js.Any])
    
    inline def setSecond_profile_imageUndefined: Self = StObject.set(x, "second_profile_image", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTuuid(value: String): Self = StObject.set(x, "tuuid", value.asInstanceOf[js.Any])
  }
}
