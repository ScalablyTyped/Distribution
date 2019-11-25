package typings.keycloakDashConnect.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConfig extends Config {
  var scope: js.UndefOr[js.Any] = js.undefined
}

object BaseConfig {
  @scala.inline
  def apply(scope: js.Any = null): BaseConfig = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfig]
  }
}

