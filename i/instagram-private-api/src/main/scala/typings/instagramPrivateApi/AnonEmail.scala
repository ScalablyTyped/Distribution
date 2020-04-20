package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.Any
  var first_name: js.Any
  var password: js.Any
  var username: js.Any
}

object AnonEmail {
  @scala.inline
  def apply(email: js.Any, first_name: js.Any, password: js.Any, username: js.Any): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

