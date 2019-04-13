package typings
package keycloakDashConnectLib.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var admin: js.UndefOr[java.lang.String] = js.undefined
  var logout: js.UndefOr[java.lang.String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(admin: java.lang.String = null, logout: java.lang.String = null): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin)
    if (logout != null) __obj.updateDynamic("logout")(logout)
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

