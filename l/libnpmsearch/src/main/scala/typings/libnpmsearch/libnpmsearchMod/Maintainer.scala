package typings.libnpmsearch.libnpmsearchMod

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
    val __obj = js.Dynamic.literal(email = email, username = username)
  
    __obj.asInstanceOf[Maintainer]
  }
}

