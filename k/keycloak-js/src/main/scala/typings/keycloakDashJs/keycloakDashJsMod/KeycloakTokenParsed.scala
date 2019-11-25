package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakTokenParsed extends js.Object {
  var exp: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var realm_access: js.UndefOr[KeycloakRoles] = js.undefined
  var resource_access: js.UndefOr[KeycloakResourceAccess] = js.undefined
  var session_state: js.UndefOr[String] = js.undefined
  var sub: js.UndefOr[String] = js.undefined
}

object KeycloakTokenParsed {
  @scala.inline
  def apply(
    exp: Int | Double = null,
    iat: Int | Double = null,
    nonce: String = null,
    realm_access: KeycloakRoles = null,
    resource_access: KeycloakResourceAccess = null,
    session_state: String = null,
    sub: String = null
  ): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (realm_access != null) __obj.updateDynamic("realm_access")(realm_access.asInstanceOf[js.Any])
    if (resource_access != null) __obj.updateDynamic("resource_access")(resource_access.asInstanceOf[js.Any])
    if (session_state != null) __obj.updateDynamic("session_state")(session_state.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
}

