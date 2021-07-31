package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseMediaItem extends StObject {
  
  var comment_threading_enabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var image: String
}
object NewsRepositoryInboxResponseMediaItem {
  
  @scala.inline
  def apply(id: String, image: String): NewsRepositoryInboxResponseMediaItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseMediaItem]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseMediaItemMutableBuilder[Self <: NewsRepositoryInboxResponseMediaItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabledUndefined: Self = StObject.set(x, "comment_threading_enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
