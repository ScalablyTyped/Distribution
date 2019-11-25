package typings.lilDashUri.lilDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credentials map
  */
trait Credentials extends js.Object {
  var password: String
  var user: String
}

object Credentials {
  @scala.inline
  def apply(password: String, user: String): Credentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Credentials]
  }
}

