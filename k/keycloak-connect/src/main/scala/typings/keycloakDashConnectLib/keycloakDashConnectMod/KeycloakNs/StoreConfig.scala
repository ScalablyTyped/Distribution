package typings
package keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Config because Already inherited */ trait StoreConfig extends BaseConfig {
  var store: js.Any
}

object StoreConfig {
  @scala.inline
  def apply(store: js.Any, scope: js.Any = null): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[StoreConfig]
  }
}

