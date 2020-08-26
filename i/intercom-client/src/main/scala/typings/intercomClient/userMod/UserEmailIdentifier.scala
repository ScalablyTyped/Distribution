package typings.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEmailIdentifier extends UserIdentifier {
  var email: String = js.native
}

object UserEmailIdentifier {
  @scala.inline
  def apply(email: String): UserEmailIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEmailIdentifier]
  }
  @scala.inline
  implicit class UserEmailIdentifierOps[Self <: UserEmailIdentifier] (val x: Self) extends AnyVal {
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
  }
  
}

