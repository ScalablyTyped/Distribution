package typings.ltijs.namesAndRolesMod

import typings.ltijs.idTokenMod.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends UserInfo {
  var lis_person_sourcedid: String = js.native
  var middle_name: String = js.native
  var picture: String = js.native
  var roles: js.Array[String] = js.native
  var status: String = js.native
  var user_id: String = js.native
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
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLis_person_sourcedid(value: String): Self = this.set("lis_person_sourcedid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle_name(value: String): Self = this.set("middle_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
  
}

