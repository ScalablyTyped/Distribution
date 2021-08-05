package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponse extends StObject {
  
  var auto_load_more_enabled: Boolean
  
  var items: js.Array[TagFeedResponseItemsItem]
  
  var more_available: Boolean
  
  var next_max_id: String
  
  var num_results: Double
  
  var ranked_items: js.Array[TagFeedResponseRankedItemsItem]
  
  var status: String
  
  var story: TagFeedResponseStory
}
object TagFeedResponse {
  
  inline def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[TagFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    ranked_items: js.Array[TagFeedResponseRankedItemsItem],
    status: String,
    story: TagFeedResponseStory
  ): TagFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], ranked_items = ranked_items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponse]
  }
  
  extension [Self <: TagFeedResponse](x: Self) {
    
    inline def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[TagFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TagFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    inline def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
    
    inline def setRanked_items(value: js.Array[TagFeedResponseRankedItemsItem]): Self = StObject.set(x, "ranked_items", value.asInstanceOf[js.Any])
    
    inline def setRanked_itemsVarargs(value: TagFeedResponseRankedItemsItem*): Self = StObject.set(x, "ranked_items", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStory(value: TagFeedResponseStory): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
  }
}
