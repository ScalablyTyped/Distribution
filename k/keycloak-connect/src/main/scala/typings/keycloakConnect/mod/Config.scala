package typings.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakConnect.mod.StoreConfig
  - typings.keycloakConnect.mod.CookiesConfig
  - typings.keycloakConnect.mod.BaseConfig
*/
trait Config extends js.Object

object Config {
  @scala.inline
  def StoreConfig(store: js.Any, scope: js.Any = null): Config = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  def CookiesConfig(cookies: js.Any, scope: js.Any = null): Config = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  def BaseConfig(scope: js.Any = null): Config = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

