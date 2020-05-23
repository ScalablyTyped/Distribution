package typings.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEmailIdentifier extends UserIdentifier {
  var email: String
}

object UserEmailIdentifier {
  @scala.inline
  def apply(email: String): UserEmailIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEmailIdentifier]
  }
}

