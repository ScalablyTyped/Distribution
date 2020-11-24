package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakPromise[TSuccess, TError]
  extends js.Promise[TSuccess] {
  
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
