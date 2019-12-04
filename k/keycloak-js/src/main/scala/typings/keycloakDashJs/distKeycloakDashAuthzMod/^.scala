package typings.keycloakDashJs.distKeycloakDashAuthzMod

import typings.keycloakDashJs.keycloakDashJsMod.KeycloakInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keycloak-js/dist/keycloak-authz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Keycloak client instance.
    * @param config Path to a JSON config file or a plain config object.
    */
  def apply(keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]): KeycloakAuthorizationInstance = js.native
}

