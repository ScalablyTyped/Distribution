package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatedBewit extends AuthenticatedMessage {
  var bewit: Bewit
}

object AuthenticatedBewit {
  @scala.inline
  def apply(bewit: Bewit, credentials: Credentials): AuthenticatedBewit = {
    val __obj = js.Dynamic.literal(bewit = bewit.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticatedBewit]
  }
}

