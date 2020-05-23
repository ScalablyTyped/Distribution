package typings.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keycloakConnect.mod.Config because Already inherited */ trait StoreConfig extends BaseConfig {
  var store: js.Any
}

object StoreConfig {
  @scala.inline
  def apply(store: js.Any, scope: js.Any = null): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
}

