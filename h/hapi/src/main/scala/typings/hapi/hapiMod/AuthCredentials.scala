package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredentials extends js.Object {
  /**
    * If set, will only work with routes that set `access.entity` to `app`.
    */
  var app: js.UndefOr[AppCredentials] = js.undefined
  /**
    * The application scopes to be granted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set, will only work with routes that set `access.entity` to `user`.
    */
  var user: js.UndefOr[UserCredentials] = js.undefined
}

object AuthCredentials {
  @scala.inline
  def apply(app: AppCredentials = null, scope: js.Array[String] = null, user: UserCredentials = null): AuthCredentials = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AuthCredentials]
  }
}

