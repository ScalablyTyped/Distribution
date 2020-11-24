package typings.instagramPrivateApi.accountFollowingFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountFollowingFeedResponse extends js.Object {
  
  var big_list: Boolean = js.native
  
  var next_max_id: Null = js.native
  
  var page_size: Double = js.native
  
  var sections: Null = js.native
  
  var status: String = js.native
  
  var users: js.Array[AccountFollowingFeedResponseUsersItem] = js.native
}
object AccountFollowingFeedResponse {
  
  @scala.inline
  def apply(
    big_list: Boolean,
    next_max_id: Null,
    page_size: Double,
    sections: Null,
    status: String,
    users: js.Array[AccountFollowingFeedResponseUsersItem]
  ): AccountFollowingFeedResponse = {
    val __obj = js.Dynamic.literal(big_list = big_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountFollowingFeedResponse]
  }
  
  @scala.inline
  implicit class AccountFollowingFeedResponseOps[Self <: AccountFollowingFeedResponse] (val x: Self) extends AnyVal {
    
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
    def setBig_list(value: Boolean): Self = this.set("big_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: Null): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSections(value: Null): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: AccountFollowingFeedResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[AccountFollowingFeedResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
