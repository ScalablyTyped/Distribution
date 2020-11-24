package typings.instagramPrivateApi.newsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsFeedResponseArgs extends js.Object {
  
  var comment_id: js.UndefOr[String] = js.native
  
  var comment_ids: js.UndefOr[js.Array[String]] = js.native
  
  var links: js.Array[NewsFeedResponseLinksItem] = js.native
  
  var media: js.UndefOr[js.Array[NewsFeedResponseMediaItem]] = js.native
  
  var profile_id: Double = js.native
  
  var profile_image: String = js.native
  
  var profile_image_destination: js.UndefOr[String] = js.native
  
  var second_profile_id: js.UndefOr[Double] = js.native
  
  var second_profile_image: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var timestamp: Double = js.native
  
  var tuuid: String = js.native
}
object NewsFeedResponseArgs {
  
  @scala.inline
  def apply(
    links: js.Array[NewsFeedResponseLinksItem],
    profile_id: Double,
    profile_image: String,
    text: String,
    timestamp: Double,
    tuuid: String
  ): NewsFeedResponseArgs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsFeedResponseArgs]
  }
  
  @scala.inline
  implicit class NewsFeedResponseArgsOps[Self <: NewsFeedResponseArgs] (val x: Self) extends AnyVal {
    
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
    def setLinksVarargs(value: NewsFeedResponseLinksItem*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[NewsFeedResponseLinksItem]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_id(value: Double): Self = this.set("profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_image(value: String): Self = this.set("profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuuid(value: String): Self = this.set("tuuid", value.asInstanceOf[js.Any])
    
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
    def setMediaVarargs(value: NewsFeedResponseMediaItem*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[NewsFeedResponseMediaItem]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setProfile_image_destination(value: String): Self = this.set("profile_image_destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_image_destination: Self = this.set("profile_image_destination", js.undefined)
    
    @scala.inline
    def setSecond_profile_id(value: Double): Self = this.set("second_profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond_profile_id: Self = this.set("second_profile_id", js.undefined)
    
    @scala.inline
    def setSecond_profile_image(value: String): Self = this.set("second_profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond_profile_image: Self = this.set("second_profile_image", js.undefined)
  }
}
