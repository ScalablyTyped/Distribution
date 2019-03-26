package typings
package keycloakDashJsLib.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeycloakNs {
  /* Rewritten from type alias, can be one of: 
    - keycloakDashJsLib.keycloakDashJsLibStrings.cordova
    - keycloakDashJsLib.keycloakDashJsLibStrings.`cordova-native`
    - keycloakDashJsLib.keycloakDashJsLibStrings.default
    - js.Any
  */
  type KeycloakAdapterName = _KeycloakAdapterName | js.Any
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
}
