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

object Token {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    content: TokenContent,
    hasApplicationRole: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    hasRealmRole: js.Function1[java.lang.String, scala.Boolean],
    hasRole: js.Function1[java.lang.String, scala.Boolean],
    isExpired: js.Function0[scala.Boolean],
    token: java.lang.String,
    header: js.Any = null,
    signature: nodeLib.Buffer = null,
    signed: java.lang.String = null
  ): Token = {
    val __obj = js.Dynamic.literal(clientId = clientId, content = content, hasApplicationRole = hasApplicationRole, hasRealmRole = hasRealmRole, hasRole = hasRole, isExpired = isExpired, token = token)
    if (header != null) __obj.updateDynamic("header")(header)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (signed != null) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[Token]
  }
}

