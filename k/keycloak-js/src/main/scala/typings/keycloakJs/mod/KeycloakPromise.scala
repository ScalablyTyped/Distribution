package typings.keycloakJs.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keycloak-js", "KeycloakPromise")
@js.native
class KeycloakPromise[TSuccess, TError] () extends Promise[TSuccess] {
  /**
  		 * Function to call if the promised action throws an error.
  		 * 
  		 * @deprecated Use `.catch()` instead.
  		 */
  def error(callback: KeycloakPromiseCallback[TError]): KeycloakPromise[TSuccess, TError] = js.native
  /**
  		 * Function to call if the promised action succeeds.
  		 * 
  		 * @deprecated Use `.then()` instead.
  		 */
  def success(callback: KeycloakPromiseCallback[TSuccess]): KeycloakPromise[TSuccess, TError] = js.native
}

