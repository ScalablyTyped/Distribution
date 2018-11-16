package typings
package keycloakDashJsLib.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeycloakNs {
  type KeycloakAdapterName = keycloakDashJsLib.keycloakDashJsLibStrings.cordova | keycloakDashJsLib.keycloakDashJsLibStrings.`cordova-native` | keycloakDashJsLib.keycloakDashJsLibStrings.default | js.Any
  type KeycloakFlow = keycloakDashJsLib.keycloakDashJsLibStrings.standard | keycloakDashJsLib.keycloakDashJsLibStrings.`implicit` | keycloakDashJsLib.keycloakDashJsLibStrings.hybrid
  type KeycloakOnLoad = keycloakDashJsLib.keycloakDashJsLibStrings.`login-required` | keycloakDashJsLib.keycloakDashJsLibStrings.`check-sso`
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type KeycloakResponseMode = keycloakDashJsLib.keycloakDashJsLibStrings.query | keycloakDashJsLib.keycloakDashJsLibStrings.fragment
  type KeycloakResponseType = keycloakDashJsLib.keycloakDashJsLibStrings.code | (keycloakDashJsLib.keycloakDashJsLibStrings.`id_token token`) | (keycloakDashJsLib.keycloakDashJsLibStrings.`code id_token token`)
}
