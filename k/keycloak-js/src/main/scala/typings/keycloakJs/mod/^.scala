package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keycloak-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Keycloak client instance.
    * @param config A configuration object or path to a JSON config file.
    */
  def apply(): KeycloakInstance = js.native
  def apply(config: String): KeycloakInstance = js.native
  def apply(config: KeycloakConfig): KeycloakInstance = js.native
}

