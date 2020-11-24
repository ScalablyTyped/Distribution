package typings.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsertagsFeedResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[UsertagsFeedResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var new_photos: js.Array[_] = js.native
  
  var next_max_id: String = js.native
  
  var num_results: Double = js.native
  
  var requires_review: Boolean = js.native
  
  var status: String = js.native
  
  var total_count: Double = js.native
}
object UsertagsFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[UsertagsFeedResponseItemsItem],
    more_available: Boolean,
    new_photos: js.Array[_],
    next_max_id: String,
    num_results: Double,
    requires_review: Boolean,
    status: String,
    total_count: Double
  ): UsertagsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_photos = new_photos.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], requires_review = requires_review.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class UsertagsFeedResponseRootObjectOps[Self <: UsertagsFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: UsertagsFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[UsertagsFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_photosVarargs(value: js.Any*): Self = this.set("new_photos", js.Array(value :_*))
    
    @scala.inline
    def setNew_photos(value: js.Array[_]): Self = this.set("new_photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = this.set("num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequires_review(value: Boolean): Self = this.set("requires_review", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
