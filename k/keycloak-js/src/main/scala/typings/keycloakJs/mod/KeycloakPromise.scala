package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakPromise[TSuccess, TError] extends js.Object {
  /**
  		 * Function to call if the promised action throws an error.
  		 */
  def error(callback: KeycloakPromiseCallback[TError]): KeycloakPromise[TSuccess, TError]
  /**
  		 * Function to call if the promised action succeeds.
  		 */
  def success(callback: KeycloakPromiseCallback[TSuccess]): KeycloakPromise[TSuccess, TError]
}

object KeycloakPromise {
  @scala.inline
  def apply[TSuccess, TError](
    error: KeycloakPromiseCallback[TError] => KeycloakPromise[TSuccess, TError],
    success: KeycloakPromiseCallback[TSuccess] => KeycloakPromise[TSuccess, TError]
  ): KeycloakPromise[TSuccess, TError] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[KeycloakPromise[TSuccess, TError]]
  }
}

