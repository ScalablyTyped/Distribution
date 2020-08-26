package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: String = js.native
  var id: String = js.native
  var isAdmin: Boolean = js.native
  var name: String = js.native
  var password: String = js.native
}

object Email {
  @scala.inline
  def apply(email: String, id: String, isAdmin: Boolean, name: String, password: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAdmin(value: Boolean): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
  }
  
}

