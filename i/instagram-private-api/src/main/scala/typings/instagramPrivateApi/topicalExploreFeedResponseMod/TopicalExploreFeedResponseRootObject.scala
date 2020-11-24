package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var max_id: String = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var rank_token: String = js.native
  
  var sectional_items: js.Array[TopicalExploreFeedResponseSectionalItemsItem] = js.native
  
  var status: String = js.native
}
object TopicalExploreFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    max_id: String,
    more_available: Boolean,
    next_max_id: String,
    rank_token: String,
    sectional_items: js.Array[TopicalExploreFeedResponseSectionalItemsItem],
    status: String
  ): TopicalExploreFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], sectional_items = sectional_items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseRootObjectOps[Self <: TopicalExploreFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setMax_id(value: String): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank_token(value: String): Self = this.set("rank_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectional_itemsVarargs(value: TopicalExploreFeedResponseSectionalItemsItem*): Self = this.set("sectional_items", js.Array(value :_*))
    
    @scala.inline
    def setSectional_items(value: js.Array[TopicalExploreFeedResponseSectionalItemsItem]): Self = this.set("sectional_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
