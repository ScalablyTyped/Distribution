package typings.keycloakConnect.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var clientId: String
  var content: TokenContent
  var header: js.UndefOr[js.Any] = js.undefined
  var signature: js.UndefOr[Buffer] = js.undefined
  var signed: js.UndefOr[String] = js.undefined
  var token: String
  def hasApplicationRole(appName: String, roleName: String): Boolean
  def hasRealmRole(roleName: String): Boolean
  def hasRole(roleName: String): Boolean
  def isExpired(): Boolean
}

object Token {
  @scala.inline
  def apply(
    clientId: String,
    content: TokenContent,
    hasApplicationRole: (String, String) => Boolean,
    hasRealmRole: String => Boolean,
    hasRole: String => Boolean,
    isExpired: () => Boolean,
    token: String,
    header: js.Any = null,
    signature: Buffer = null,
    signed: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hasApplicationRole = js.Any.fromFunction2(hasApplicationRole), hasRealmRole = js.Any.fromFunction1(hasRealmRole), hasRole = js.Any.fromFunction1(hasRole), isExpired = js.Any.fromFunction0(isExpired), token = token.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (signed != null) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

