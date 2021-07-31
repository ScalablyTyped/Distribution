package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseFillItemsItem extends StObject {
  
  var media: TopicalExploreFeedResponseMedia
}
object TopicalExploreFeedResponseFillItemsItem {
  
  @scala.inline
  def apply(media: TopicalExploreFeedResponseMedia): TopicalExploreFeedResponseFillItemsItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseFillItemsItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseFillItemsItemMutableBuilder[Self <: TopicalExploreFeedResponseFillItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
