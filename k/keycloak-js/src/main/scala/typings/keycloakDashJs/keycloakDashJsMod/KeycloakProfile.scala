package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakProfile extends js.Object {
  var createdTimestamp: js.UndefOr[Double] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var totp: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object KeycloakProfile {
  @scala.inline
  def apply(
    createdTimestamp: Int | Double = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    firstName: String = null,
    id: String = null,
    lastName: String = null,
    totp: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): KeycloakProfile = {
    val __obj = js.Dynamic.literal()
    if (createdTimestamp != null) __obj.updateDynamic("createdTimestamp")(createdTimestamp.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (!js.isUndefined(totp)) __obj.updateDynamic("totp")(totp.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakProfile]
  }
}

