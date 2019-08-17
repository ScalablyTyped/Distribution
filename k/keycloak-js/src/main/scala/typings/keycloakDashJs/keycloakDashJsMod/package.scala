package typings.keycloakDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.keycloakDashJs.keycloakDashJsStrings.native

  /* Rewritten from type alias, can be one of: 
    - typings.keycloakDashJs.keycloakDashJsStrings.cordova
    - typings.keycloakDashJs.keycloakDashJsStrings.`cordova-native`
    - typings.keycloakDashJs.keycloakDashJsStrings.default
    - js.Any
  */
  type KeycloakAdapterName = _KeycloakAdapterName | js.Any
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, Unit]
  type KeycloakPromiseType = native
  type KeycloakResourceAccess = StringDictionary[KeycloakRoles]
}
