package typings.instagramPrivateApi.mediaRepositoryLikersResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryLikersResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var user_count: Double = js.native
  
  var users: js.Array[MediaRepositoryLikersResponseUsersItem] = js.native
}
object MediaRepositoryLikersResponseRootObject {
  
  @scala.inline
  def apply(status: String, user_count: Double, users: js.Array[MediaRepositoryLikersResponseUsersItem]): MediaRepositoryLikersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryLikersResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaRepositoryLikersResponseRootObjectOps[Self <: MediaRepositoryLikersResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_count(value: Double): Self = this.set("user_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: MediaRepositoryLikersResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[MediaRepositoryLikersResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
