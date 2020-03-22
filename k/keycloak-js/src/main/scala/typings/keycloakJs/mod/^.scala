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
  def apply[TPromise /* <: KeycloakPromiseType */](): KeycloakInstance[TPromise] = js.native
  def apply[TPromise /* <: KeycloakPromiseType */](config: String): KeycloakInstance[TPromise] = js.native
  def apply[TPromise /* <: KeycloakPromiseType */](config: KeycloakConfig): KeycloakInstance[TPromise] = js.native
}

