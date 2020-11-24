package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponse extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[TagFeedResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var num_results: Double = js.native
  
  var ranked_items: js.Array[TagFeedResponseRankedItemsItem] = js.native
  
  var status: String = js.native
  
  var story: TagFeedResponseStory = js.native
}
object TagFeedResponse {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TagFeedResponseOps[Self <: TagFeedResponse] (val x: Self) extends AnyVal {
    
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
    def setAuto_load_more_enabled(value: Boolean): Self = this.set("auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TagFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TagFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = this.set("num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_itemsVarargs(value: TagFeedResponseRankedItemsItem*): Self = this.set("ranked_items", js.Array(value :_*))
    
    @scala.inline
    def setRanked_items(value: js.Array[TagFeedResponseRankedItemsItem]): Self = this.set("ranked_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: TagFeedResponseStory): Self = this.set("story", value.asInstanceOf[js.Any])
  }
}
