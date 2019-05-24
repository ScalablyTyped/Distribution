package typings
package keycloakDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashJsMod {
  /* Rewritten from type alias, can be one of: 
    - keycloakDashJsLib.keycloakDashJsLibStrings.cordova
    - keycloakDashJsLib.keycloakDashJsLibStrings.`cordova-native`
    - keycloakDashJsLib.keycloakDashJsLibStrings.default
    - js.Any
  */
  type KeycloakAdapterName = _KeycloakAdapterName | js.Any
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type KeycloakPromiseType = keycloakDashJsLib.keycloakDashJsLibStrings.native
  type KeycloakResourceAccess = org.scalablytyped.runtime.StringDictionary[KeycloakRoles]
}
