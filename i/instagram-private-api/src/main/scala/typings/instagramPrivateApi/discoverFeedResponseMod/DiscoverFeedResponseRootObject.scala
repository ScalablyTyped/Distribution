package typings.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverFeedResponseRootObject extends js.Object {
  
  var max_id: String = js.native
  
  var more_available: Boolean = js.native
  
  var new_suggested_users: DiscoverFeedResponseNewSuggestedUsers = js.native
  
  var next_max_id: String = js.native
  
  var status: String = js.native
  
  var suggested_users: DiscoverFeedResponseSuggestedUsers = js.native
}
object DiscoverFeedResponseRootObject {
  
  @scala.inline
  def apply(
    max_id: String,
    more_available: Boolean,
    new_suggested_users: DiscoverFeedResponseNewSuggestedUsers,
    next_max_id: String,
    status: String,
    suggested_users: DiscoverFeedResponseSuggestedUsers
  ): DiscoverFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_suggested_users = new_suggested_users.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggested_users = suggested_users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class DiscoverFeedResponseRootObjectOps[Self <: DiscoverFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setMax_id(value: String): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_suggested_users(value: DiscoverFeedResponseNewSuggestedUsers): Self = this.set("new_suggested_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggested_users(value: DiscoverFeedResponseSuggestedUsers): Self = this.set("suggested_users", value.asInstanceOf[js.Any])
  }
}
