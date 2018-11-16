package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

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

