package typings.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LikedFeedResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[LikedFeedResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String | Double = js.native
  
  var num_results: Double = js.native
  
  var status: String = js.native
}
object LikedFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[LikedFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String | Double,
    num_results: Double,
    status: String
  ): LikedFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class LikedFeedResponseRootObjectOps[Self <: LikedFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: LikedFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LikedFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String | Double): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = this.set("num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
