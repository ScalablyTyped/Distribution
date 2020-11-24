package typings.instagramPrivateApi.mediaRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaInfoResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[MediaInfoResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var num_results: Double = js.native
  
  var status: String = js.native
}
object MediaInfoResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[MediaInfoResponseItemsItem],
    more_available: Boolean,
    num_results: Double,
    status: String
  ): MediaInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfoResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaInfoResponseRootObjectOps[Self <: MediaInfoResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: MediaInfoResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[MediaInfoResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = this.set("num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
