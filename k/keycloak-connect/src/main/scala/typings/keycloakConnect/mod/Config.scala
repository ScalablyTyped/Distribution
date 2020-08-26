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
  def StoreConfig(store: js.Any): Config = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  def CookiesConfig(cookies: js.Any): Config = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  def BaseConfig(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
}

