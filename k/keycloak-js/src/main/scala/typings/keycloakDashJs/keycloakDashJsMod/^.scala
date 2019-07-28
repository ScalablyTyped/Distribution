package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keycloak-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Keycloak client instance.
    * @param config Path to a JSON config file or a plain config object.
    */
  def apply(): KeycloakInstance = js.native
  def apply(config: String | js.Object): KeycloakInstance = js.native
}

