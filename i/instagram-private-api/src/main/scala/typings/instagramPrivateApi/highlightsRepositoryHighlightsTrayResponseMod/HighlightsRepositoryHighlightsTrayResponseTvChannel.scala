package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryHighlightsTrayResponseTvChannel extends js.Object {
  
  var id: String = js.native
  
  var items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem] = js.native
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict = js.native
}
object HighlightsRepositoryHighlightsTrayResponseTvChannel {
  
  @scala.inline
  def apply(
    id: String,
    items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem],
    max_id: Null,
    more_available: Boolean,
    seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState,
    title: String,
    `type`: String,
    user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict
  ): HighlightsRepositoryHighlightsTrayResponseTvChannel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTvChannel]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseTvChannelOps[Self <: HighlightsRepositoryHighlightsTrayResponseTvChannel] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: HighlightsRepositoryHighlightsTrayResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: Null): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: HighlightsRepositoryHighlightsTrayResponseSeenState): Self = this.set("seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_dict(value: HighlightsRepositoryHighlightsTrayResponseUserDict): Self = this.set("user_dict", value.asInstanceOf[js.Any])
  }
}
