package typings.keycloakDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.keycloakDashJs.keycloakDashJsStrings.S256
  import typings.keycloakDashJs.keycloakDashJsStrings.native

  type CompatPromise[TPromiseType /* <: PromiseType */, TSuccess, TError] = (KeycloakPromise[TSuccess, TError]) | js.Promise[TSuccess]
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakDashJs.keycloakDashJsStrings.cordova
    - typings.keycloakDashJs.keycloakDashJsStrings.`cordova-native`
    - typings.keycloakDashJs.keycloakDashJsStrings.default
    - js.Any
  */
  type KeycloakAdapterName = _KeycloakAdapterName | js.Any
  type KeycloakPkceMethod = S256
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, Unit]
  type KeycloakPromiseType = native
  type KeycloakResourceAccess = StringDictionary[KeycloakRoles]
  // export interface KeycloakUserInfo {}
  /**
  	 * Conditional CompatPromise type in order to support
  	 * both legacy promises and native promises as return types.
  	 */
  type PromiseType = js.UndefOr[KeycloakPromiseType]
}
