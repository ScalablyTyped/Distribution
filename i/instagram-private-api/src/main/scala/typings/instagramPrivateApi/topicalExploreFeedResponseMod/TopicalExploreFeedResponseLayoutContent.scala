package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseLayoutContent extends StObject {
  
  var fill_items: js.UndefOr[js.Array[TopicalExploreFeedResponseFillItemsItem]] = js.native
  
  var medias: js.UndefOr[js.Array[TopicalExploreFeedResponseMediasItem]] = js.native
  
  var two_by_two_item: js.UndefOr[TopicalExploreFeedResponseTwoByTwoItem] = js.native
}
object TopicalExploreFeedResponseLayoutContent {
  
  @scala.inline
  def apply(): TopicalExploreFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicalExploreFeedResponseLayoutContent]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseLayoutContentMutableBuilder[Self <: TopicalExploreFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill_items(value: js.Array[TopicalExploreFeedResponseFillItemsItem]): Self = StObject.set(x, "fill_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill_itemsUndefined: Self = StObject.set(x, "fill_items", js.undefined)
    
    @scala.inline
    def setFill_itemsVarargs(value: TopicalExploreFeedResponseFillItemsItem*): Self = StObject.set(x, "fill_items", js.Array(value :_*))
    
    @scala.inline
    def setMedias(value: js.Array[TopicalExploreFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediasUndefined: Self = StObject.set(x, "medias", js.undefined)
    
    @scala.inline
    def setMediasVarargs(value: TopicalExploreFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
    
    @scala.inline
    def setTwo_by_two_item(value: TopicalExploreFeedResponseTwoByTwoItem): Self = StObject.set(x, "two_by_two_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_by_two_itemUndefined: Self = StObject.set(x, "two_by_two_item", js.undefined)
  }
}
