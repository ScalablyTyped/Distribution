package typings.intercomClient

import typings.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends UserIdentifier {
  var email: String
}

object AnonEmail {
  @scala.inline
  def apply(email: String): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

