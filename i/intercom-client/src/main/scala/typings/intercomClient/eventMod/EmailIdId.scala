package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailIdId extends EventIdentifier {
  var email: String
}

object EmailIdId {
  @scala.inline
  def apply(email: String): EmailIdId = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIdId]
  }
}

