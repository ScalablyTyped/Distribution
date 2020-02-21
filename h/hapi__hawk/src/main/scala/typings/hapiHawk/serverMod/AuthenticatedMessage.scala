package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatedMessage extends js.Object {
  var credentials: Credentials
}

object AuthenticatedMessage {
  @scala.inline
  def apply(credentials: Credentials): AuthenticatedMessage = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticatedMessage]
  }
}

