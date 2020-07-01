package typings.ltijs.namesAndRolesMod

import typings.ltijs.idTokenMod.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends UserInfo {
  var lis_person_sourcedid: String
  var middle_name: String
  var picture: String
  var roles: js.Array[String]
  var status: String
  var user_id: String
}

object Member {
  @scala.inline
  def apply(
    email: String,
    family_name: String,
    given_name: String,
    lis_person_sourcedid: String,
    middle_name: String,
    name: String,
    picture: String,
    roles: js.Array[String],
    status: String,
    user_id: String
  ): Member = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], lis_person_sourcedid = lis_person_sourcedid.asInstanceOf[js.Any], middle_name = middle_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

