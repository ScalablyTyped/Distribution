package typings.intercomDashClient

import typings.intercomDashClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends UserIdentifier {
  var email: String
}

object Anon_Email {
  @scala.inline
  def apply(email: String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Email]
  }
}

