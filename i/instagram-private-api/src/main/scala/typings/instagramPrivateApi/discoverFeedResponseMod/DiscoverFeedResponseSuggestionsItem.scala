package typings.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverFeedResponseSuggestionsItem extends js.Object {
  
  var algorithm: String = js.native
  
  var caption: String = js.native
  
  var followed_by: Boolean = js.native
  
  var icon: String = js.native
  
  var is_new_suggestion: Boolean = js.native
  
  var large_urls: js.Array[_] = js.native
  
  var media_ids: js.Array[_] = js.native
  
  var media_infos: js.Array[_] = js.native
  
  var social_context: String = js.native
  
  var thumbnail_urls: js.Array[_] = js.native
  
  var user: DiscoverFeedResponseUser = js.native
  
  var uuid: String = js.native
  
  var value: Double = js.native
}
object DiscoverFeedResponseSuggestionsItem {
  
  @scala.inline
  def apply(
    algorithm: String,
    caption: String,
    followed_by: Boolean,
    icon: String,
    is_new_suggestion: Boolean,
    large_urls: js.Array[_],
    media_ids: js.Array[_],
    media_infos: js.Array[_],
    social_context: String,
    thumbnail_urls: js.Array[_],
    user: DiscoverFeedResponseUser,
    uuid: String,
    value: Double
  ): DiscoverFeedResponseSuggestionsItem = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], is_new_suggestion = is_new_suggestion.asInstanceOf[js.Any], large_urls = large_urls.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], media_infos = media_infos.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], thumbnail_urls = thumbnail_urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseSuggestionsItem]
  }
  
  @scala.inline
  implicit class DiscoverFeedResponseSuggestionsItemOps[Self <: DiscoverFeedResponseSuggestionsItem] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowed_by(value: Boolean): Self = this.set("followed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_new_suggestion(value: Boolean): Self = this.set("is_new_suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_urlsVarargs(value: js.Any*): Self = this.set("large_urls", js.Array(value :_*))
    
    @scala.inline
    def setLarge_urls(value: js.Array[_]): Self = this.set("large_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_idsVarargs(value: js.Any*): Self = this.set("media_ids", js.Array(value :_*))
    
    @scala.inline
    def setMedia_ids(value: js.Array[_]): Self = this.set("media_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_infosVarargs(value: js.Any*): Self = this.set("media_infos", js.Array(value :_*))
    
    @scala.inline
    def setMedia_infos(value: js.Array[_]): Self = this.set("media_infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial_context(value: String): Self = this.set("social_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_urlsVarargs(value: js.Any*): Self = this.set("thumbnail_urls", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail_urls(value: js.Array[_]): Self = this.set("thumbnail_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: DiscoverFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
