package typings.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // export interface KeycloakUserInfo {}
  /**
  	 * Conditional CompatPromise type in order to support
  	 * both legacy promises and native promises as return types.
  	 */
  type CompatPromise[TPromiseType /* <: typings.keycloakJs.mod.KeycloakPromiseType */, TSuccess, TError] = (typings.keycloakJs.mod.KeycloakPromise[TSuccess, TError]) | js.Promise[TSuccess]
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakJs.keycloakJsStrings.cordova
    - typings.keycloakJs.keycloakJsStrings.`cordova-native`
    - typings.keycloakJs.keycloakJsStrings.default
    - js.Any
  */
  type KeycloakAdapterName = typings.keycloakJs.mod._KeycloakAdapterName | js.Any
  type KeycloakPkceMethod = typings.keycloakJs.keycloakJsStrings.S256
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type KeycloakResourceAccess = org.scalablytyped.runtime.StringDictionary[typings.keycloakJs.mod.KeycloakRoles]
}
