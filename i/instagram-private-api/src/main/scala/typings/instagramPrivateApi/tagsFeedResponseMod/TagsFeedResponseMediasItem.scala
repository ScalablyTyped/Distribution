package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseMediasItem extends StObject {
  
  var media: TagsFeedResponseMedia = js.native
}
object TagsFeedResponseMediasItem {
  
  @scala.inline
  def apply(media: TagsFeedResponseMedia): TagsFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseMediasItem]
  }
  
  @scala.inline
  implicit class TagsFeedResponseMediasItemMutableBuilder[Self <: TagsFeedResponseMediasItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: TagsFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
