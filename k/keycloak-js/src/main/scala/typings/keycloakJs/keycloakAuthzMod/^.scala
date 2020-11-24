package typings.keycloakJs.keycloakAuthzMod

import typings.keycloakJs.mod.KeycloakInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keycloak-js/dist/keycloak-authz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new Keycloak client instance.
    * @param config Path to a JSON config file or a plain config object.
    */
  def apply(keycloak: KeycloakInstance): KeycloakAuthorizationInstance = js.native
}
