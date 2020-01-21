package typings.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.keycloakConnect.mod.Config because Already inherited */ trait CookiesConfig extends BaseConfig {
  var cookies: js.Any
}

object CookiesConfig {
  @scala.inline
  def apply(cookies: js.Any, scope: js.Any = null): CookiesConfig = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesConfig]
  }
}

