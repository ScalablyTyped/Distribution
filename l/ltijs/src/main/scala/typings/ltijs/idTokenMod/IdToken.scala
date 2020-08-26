package typings.ltijs.idTokenMod

import typings.ltijs.anon.LineItem
import typings.ltijs.platformMod.PlatformInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdToken extends js.Object {
  var endpoint: LineItem = js.native
  var iss: String = js.native
  var issuerCode: String = js.native
  var platformInfo: PlatformInfo = js.native
  var roles: js.Array[String] = js.native
  var user: String = js.native
  var userInfo: UserInfo = js.native
}

object IdToken {
  @scala.inline
  def apply(
    endpoint: LineItem,
    iss: String,
    issuerCode: String,
    platformInfo: PlatformInfo,
    roles: js.Array[String],
    user: String,
    userInfo: UserInfo
  ): IdToken = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], issuerCode = issuerCode.asInstanceOf[js.Any], platformInfo = platformInfo.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdToken]
  }
  @scala.inline
  implicit class IdTokenOps[Self <: IdToken] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: LineItem): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuerCode(value: String): Self = this.set("issuerCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformInfo(value: PlatformInfo): Self = this.set("platformInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
  
}

