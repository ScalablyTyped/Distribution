package typings.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryUpdateTitleResponseItemsItem extends js.Object {
  
  var action_log: DirectThreadRepositoryUpdateTitleResponseActionLog = js.native
  
  var item_id: String = js.native
  
  var item_type: String = js.native
  
  var timestamp: String = js.native
  
  var user_id: Double = js.native
}
object DirectThreadRepositoryUpdateTitleResponseItemsItem {
  
  @scala.inline
  def apply(
    action_log: DirectThreadRepositoryUpdateTitleResponseActionLog,
    item_id: String,
    item_type: String,
    timestamp: String,
    user_id: Double
  ): DirectThreadRepositoryUpdateTitleResponseItemsItem = {
    val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseItemsItem]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseItemsItemOps[Self <: DirectThreadRepositoryUpdateTitleResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setAction_log(value: DirectThreadRepositoryUpdateTitleResponseActionLog): Self = this.set("action_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_id(value: String): Self = this.set("item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_type(value: String): Self = this.set("item_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
}
