package typings.ionic.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<ionic.ionic/lib/sso.OAuth2FlowOptions> */
@js.native
trait Auth0OAuth2FlowOptions extends js.Object {
  val audience: js.UndefOr[String] = js.native
  var authorizationUrl: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  val connection: String = js.native
  val email: String = js.native
  var redirectHost: js.UndefOr[String] = js.native
  var redirectPort: js.UndefOr[Double] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
}

object Auth0OAuth2FlowOptions {
  @scala.inline
  def apply(connection: String, email: String): Auth0OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0OAuth2FlowOptions]
  }
  @scala.inline
  implicit class Auth0OAuth2FlowOptionsOps[Self <: Auth0OAuth2FlowOptions] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationUrl: Self = this.set("authorizationUrl", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setRedirectHost(value: String): Self = this.set("redirectHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectHost: Self = this.set("redirectHost", js.undefined)
    @scala.inline
    def setRedirectPort(value: Double): Self = this.set("redirectPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectPort: Self = this.set("redirectPort", js.undefined)
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenUrl: Self = this.set("tokenUrl", js.undefined)
  }
  
}

