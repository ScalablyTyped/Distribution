package typings.libnpmsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maintainer extends js.Object {
  var email: String
  var username: String
}

object Maintainer {
  @scala.inline
  def apply(email: String, username: String): Maintainer = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainer]
  }
}

