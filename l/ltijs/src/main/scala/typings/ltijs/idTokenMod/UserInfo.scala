package typings.ltijs.idTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var email: String
  var family_name: String
  var given_name: String
  var name: String
}

object UserInfo {
  @scala.inline
  def apply(email: String, family_name: String, given_name: String, name: String): UserInfo = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

