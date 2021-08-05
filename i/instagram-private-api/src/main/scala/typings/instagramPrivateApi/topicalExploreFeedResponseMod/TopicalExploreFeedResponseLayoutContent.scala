package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseLayoutContent extends StObject {
  
  var fill_items: js.UndefOr[js.Array[TopicalExploreFeedResponseFillItemsItem]] = js.undefined
  
  var medias: js.UndefOr[js.Array[TopicalExploreFeedResponseMediasItem]] = js.undefined
  
  var two_by_two_item: js.UndefOr[TopicalExploreFeedResponseTwoByTwoItem] = js.undefined
}
object TopicalExploreFeedResponseLayoutContent {
  
  inline def apply(): TopicalExploreFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicalExploreFeedResponseLayoutContent]
  }
  
  extension [Self <: TopicalExploreFeedResponseLayoutContent](x: Self) {
    
    inline def setFill_items(value: js.Array[TopicalExploreFeedResponseFillItemsItem]): Self = StObject.set(x, "fill_items", value.asInstanceOf[js.Any])
    
    inline def setFill_itemsUndefined: Self = StObject.set(x, "fill_items", js.undefined)
    
    inline def setFill_itemsVarargs(value: TopicalExploreFeedResponseFillItemsItem*): Self = StObject.set(x, "fill_items", js.Array(value :_*))
    
    inline def setMedias(value: js.Array[TopicalExploreFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    inline def setMediasUndefined: Self = StObject.set(x, "medias", js.undefined)
    
    inline def setMediasVarargs(value: TopicalExploreFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
    
    inline def setTwo_by_two_item(value: TopicalExploreFeedResponseTwoByTwoItem): Self = StObject.set(x, "two_by_two_item", value.asInstanceOf[js.Any])
    
    inline def setTwo_by_two_itemUndefined: Self = StObject.set(x, "two_by_two_item", js.undefined)
  }
}
