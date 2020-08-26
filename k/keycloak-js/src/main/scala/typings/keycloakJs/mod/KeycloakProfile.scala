package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakProfile extends js.Object {
  var createdTimestamp: js.UndefOr[Double] = js.native
  var email: js.UndefOr[String] = js.native
  var emailVerified: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var firstName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var totp: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object KeycloakProfile {
  @scala.inline
  def apply(): KeycloakProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakProfile]
  }
  @scala.inline
  implicit class KeycloakProfileOps[Self <: KeycloakProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedTimestamp(value: Double): Self = this.set("createdTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("createdTimestamp", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerified: Self = this.set("emailVerified", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setTotp(value: Boolean): Self = this.set("totp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotp: Self = this.set("totp", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

