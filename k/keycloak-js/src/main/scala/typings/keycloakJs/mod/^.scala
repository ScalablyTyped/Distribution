package typings.keycloakJs.mod

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
  def apply[TPromise /* <: PromiseType */](): KeycloakInstance[TPromise] = js.native
  def apply[TPromise /* <: PromiseType */](config: String): KeycloakInstance[TPromise] = js.native
  def apply[TPromise /* <: PromiseType */](config: js.Object): KeycloakInstance[TPromise] = js.native
}

