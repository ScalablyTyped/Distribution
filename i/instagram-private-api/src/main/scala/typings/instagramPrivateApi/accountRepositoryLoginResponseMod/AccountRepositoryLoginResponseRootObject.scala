package typings.instagramPrivateApi.accountRepositoryLoginResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRepositoryLoginResponseRootObject extends js.Object {
  
  var logged_in_user: AccountRepositoryLoginResponseLoggedInUser = js.native
  
  var status: String = js.native
}
object AccountRepositoryLoginResponseRootObject {
  
  @scala.inline
  def apply(logged_in_user: AccountRepositoryLoginResponseLoggedInUser, status: String): AccountRepositoryLoginResponseRootObject = {
    val __obj = js.Dynamic.literal(logged_in_user = logged_in_user.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginResponseRootObject]
  }
  
  @scala.inline
  implicit class AccountRepositoryLoginResponseRootObjectOps[Self <: AccountRepositoryLoginResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setLogged_in_user(value: AccountRepositoryLoginResponseLoggedInUser): Self = this.set("logged_in_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
