package typings.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var admin: js.UndefOr[String] = js.undefined
  var logout: js.UndefOr[String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(admin: String = null, logout: String = null): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (logout != null) __obj.updateDynamic("logout")(logout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

