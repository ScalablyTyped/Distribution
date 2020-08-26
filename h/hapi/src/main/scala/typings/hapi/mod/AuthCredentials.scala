package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthCredentials extends js.Object {
  /**
    * If set, will only work with routes that set `access.entity` to `app`.
    */
  var app: js.UndefOr[AppCredentials] = js.native
  /**
    * The application scopes to be granted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, will only work with routes that set `access.entity` to `user`.
    */
  var user: js.UndefOr[UserCredentials] = js.native
}

object AuthCredentials {
  @scala.inline
  def apply(): AuthCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthCredentials]
  }
  @scala.inline
  implicit class AuthCredentialsOps[Self <: AuthCredentials] (val x: Self) extends AnyVal {
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
    def setApp(value: AppCredentials): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setUser(value: UserCredentials): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

