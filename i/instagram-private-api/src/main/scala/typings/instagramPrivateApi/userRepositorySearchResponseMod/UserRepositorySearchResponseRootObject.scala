package typings.instagramPrivateApi.userRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRepositorySearchResponseRootObject extends js.Object {
  
  var has_more: Boolean = js.native
  
  var num_results: Double = js.native
  
  var rank_token: String = js.native
  
  var status: String = js.native
  
  var users: js.Array[UserRepositorySearchResponseUsersItem] = js.native
}
object UserRepositorySearchResponseRootObject {
  
  @scala.inline
  def apply(
    has_more: Boolean,
    num_results: Double,
    rank_token: String,
    status: String,
    users: js.Array[UserRepositorySearchResponseUsersItem]
  ): UserRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositorySearchResponseRootObject]
  }
  
  @scala.inline
  implicit class UserRepositorySearchResponseRootObjectOps[Self <: UserRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setHas_more(value: Boolean): Self = this.set("has_more", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = this.set("num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank_token(value: String): Self = this.set("rank_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: UserRepositorySearchResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserRepositorySearchResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
