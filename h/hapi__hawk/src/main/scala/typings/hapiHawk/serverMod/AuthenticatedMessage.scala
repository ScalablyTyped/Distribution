package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticatedMessage extends js.Object {
  var credentials: Credentials = js.native
}

object AuthenticatedMessage {
  @scala.inline
  def apply(credentials: Credentials): AuthenticatedMessage = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedMessage]
  }
  @scala.inline
  implicit class AuthenticatedMessageOps[Self <: AuthenticatedMessage] (val x: Self) extends AnyVal {
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
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
  }
  
}

