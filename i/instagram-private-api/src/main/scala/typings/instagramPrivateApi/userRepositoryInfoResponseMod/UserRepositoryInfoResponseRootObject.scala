package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRepositoryInfoResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var user: UserRepositoryInfoResponseUser = js.native
}
object UserRepositoryInfoResponseRootObject {
  
  @scala.inline
  def apply(status: String, user: UserRepositoryInfoResponseUser): UserRepositoryInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseRootObject]
  }
  
  @scala.inline
  implicit class UserRepositoryInfoResponseRootObjectOps[Self <: UserRepositoryInfoResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setUser(value: UserRepositoryInfoResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
