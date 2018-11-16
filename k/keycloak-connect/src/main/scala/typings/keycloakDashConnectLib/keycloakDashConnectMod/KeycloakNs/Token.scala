package typings
package keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Token extends js.Object {
  var clientId: java.lang.String
  var content: TokenContent
  var header: js.UndefOr[js.Any] = js.undefined
  var signature: js.UndefOr[nodeLib.Buffer] = js.undefined
  var signed: js.UndefOr[java.lang.String] = js.undefined
  var token: java.lang.String
  def hasApplicationRole(appName: java.lang.String, roleName: java.lang.String): scala.Boolean
  def hasRealmRole(roleName: java.lang.String): scala.Boolean
  def hasRole(roleName: java.lang.String): scala.Boolean
  def isExpired(): scala.Boolean
}

