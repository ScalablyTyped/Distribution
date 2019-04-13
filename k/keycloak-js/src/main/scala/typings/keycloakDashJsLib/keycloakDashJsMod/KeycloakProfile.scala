package typings
package keycloakDashJsLib.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakProfile extends js.Object {
  var createdTimestamp: js.UndefOr[scala.Double] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var totp: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object KeycloakProfile {
  @scala.inline
  def apply(
    createdTimestamp: scala.Int | scala.Double = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    firstName: java.lang.String = null,
    id: java.lang.String = null,
    lastName: java.lang.String = null,
    totp: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): KeycloakProfile = {
    val __obj = js.Dynamic.literal()
    if (createdTimestamp != null) __obj.updateDynamic("createdTimestamp")(createdTimestamp.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (!js.isUndefined(totp)) __obj.updateDynamic("totp")(totp)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[KeycloakProfile]
  }
}

