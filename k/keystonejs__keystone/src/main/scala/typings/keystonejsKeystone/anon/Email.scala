package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var id: String
  var isAdmin: Boolean
  var name: String
  var password: String
}

object Email {
  @scala.inline
  def apply(email: String, id: String, isAdmin: Boolean, name: String, password: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

