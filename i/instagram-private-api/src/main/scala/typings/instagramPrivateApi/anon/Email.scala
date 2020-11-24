package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends js.Object {
  
  var email: js.Any = js.native
  
  var first_name: js.Any = js.native
  
  var password: js.Any = js.native
  
  var username: js.Any = js.native
}
object Email {
  
  @scala.inline
  def apply(email: js.Any, first_name: js.Any, password: js.Any, username: js.Any): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: js.Any): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: js.Any): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: js.Any): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: js.Any): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
