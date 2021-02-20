package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseMediasItem extends StObject {
  
  var media: TopicalExploreFeedResponseMedia = js.native
}
object TopicalExploreFeedResponseMediasItem {
  
  @scala.inline
  def apply(media: TopicalExploreFeedResponseMedia): TopicalExploreFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseMediasItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseMediasItemMutableBuilder[Self <: TopicalExploreFeedResponseMediasItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
