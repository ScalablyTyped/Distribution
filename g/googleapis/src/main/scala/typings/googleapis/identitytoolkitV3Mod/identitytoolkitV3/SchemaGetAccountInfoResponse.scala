package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting account information.
  */
@js.native
trait SchemaGetAccountInfoResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#GetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The info of the users.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.native
}

object SchemaGetAccountInfoResponse {
  @scala.inline
  def apply(): SchemaGetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetAccountInfoResponse]
  }
  @scala.inline
  implicit class SchemaGetAccountInfoResponseOps[Self <: SchemaGetAccountInfoResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUsersVarargs(value: SchemaUserInfo*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[SchemaUserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

