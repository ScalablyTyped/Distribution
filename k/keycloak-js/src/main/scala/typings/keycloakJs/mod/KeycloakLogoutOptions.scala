package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakLogoutOptions extends js.Object {
  /**
  		 * Specifies the uri to redirect to after logout.
  		 */
  var redirectUri: js.UndefOr[String] = js.native
}

object KeycloakLogoutOptions {
  @scala.inline
  def apply(): KeycloakLogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakLogoutOptions]
  }
  @scala.inline
  implicit class KeycloakLogoutOptionsOps[Self <: KeycloakLogoutOptions] (val x: Self) extends AnyVal {
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
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
  }
  
}

