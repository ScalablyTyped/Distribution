package typings
package keycloakDashConnectLib.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- keycloakDashConnectLib.keycloakDashConnectMod.Config because Already inherited */ trait CookiesConfig extends BaseConfig {
  var cookies: js.Any
}

object CookiesConfig {
  @scala.inline
  def apply(cookies: js.Any, scope: js.Any = null): CookiesConfig = {
    val __obj = js.Dynamic.literal(cookies = cookies)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[CookiesConfig]
  }
}

