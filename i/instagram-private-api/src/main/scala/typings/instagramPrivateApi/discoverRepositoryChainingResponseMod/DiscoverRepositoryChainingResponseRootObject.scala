package typings.instagramPrivateApi.discoverRepositoryChainingResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverRepositoryChainingResponseRootObject extends js.Object {
  
  var available_recommend_count: Double = js.native
  
  var is_backup: Boolean = js.native
  
  var is_recommend_account: Boolean = js.native
  
  var status: String = js.native
  
  var users: js.Array[DiscoverRepositoryChainingResponseUsersItem] = js.native
}
object DiscoverRepositoryChainingResponseRootObject {
  
  @scala.inline
  def apply(
    available_recommend_count: Double,
    is_backup: Boolean,
    is_recommend_account: Boolean,
    status: String,
    users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
  ): DiscoverRepositoryChainingResponseRootObject = {
    val __obj = js.Dynamic.literal(available_recommend_count = available_recommend_count.asInstanceOf[js.Any], is_backup = is_backup.asInstanceOf[js.Any], is_recommend_account = is_recommend_account.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseRootObject]
  }
  
  @scala.inline
  implicit class DiscoverRepositoryChainingResponseRootObjectOps[Self <: DiscoverRepositoryChainingResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAvailable_recommend_count(value: Double): Self = this.set("available_recommend_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_backup(value: Boolean): Self = this.set("is_backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_recommend_account(value: Boolean): Self = this.set("is_recommend_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: DiscoverRepositoryChainingResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[DiscoverRepositoryChainingResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
