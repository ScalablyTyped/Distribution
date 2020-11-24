package typings.instagramPrivateApi.addressBookRepositoryLinkResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressBookRepositoryLinkResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var users: js.Array[AddressBookRepositoryLinkResponseUsersItem] = js.native
  
  var warning: String = js.native
}
object AddressBookRepositoryLinkResponseRootObject {
  
  @scala.inline
  def apply(status: String, users: js.Array[AddressBookRepositoryLinkResponseUsersItem], warning: String): AddressBookRepositoryLinkResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressBookRepositoryLinkResponseRootObject]
  }
  
  @scala.inline
  implicit class AddressBookRepositoryLinkResponseRootObjectOps[Self <: AddressBookRepositoryLinkResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setUsersVarargs(value: AddressBookRepositoryLinkResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[AddressBookRepositoryLinkResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
