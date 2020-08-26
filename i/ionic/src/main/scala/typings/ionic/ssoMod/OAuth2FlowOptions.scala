package typings.ionic.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2FlowOptions extends js.Object {
  val authorizationUrl: String = js.native
  val clientId: String = js.native
  val redirectHost: js.UndefOr[String] = js.native
  val redirectPort: js.UndefOr[Double] = js.native
  val tokenUrl: String = js.native
}

object OAuth2FlowOptions {
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, tokenUrl: String): OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2FlowOptions]
  }
  @scala.inline
  implicit class OAuth2FlowOptionsOps[Self <: OAuth2FlowOptions] (val x: Self) extends AnyVal {
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectHost(value: String): Self = this.set("redirectHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectHost: Self = this.set("redirectHost", js.undefined)
    @scala.inline
    def setRedirectPort(value: Double): Self = this.set("redirectPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectPort: Self = this.set("redirectPort", js.undefined)
  }
  
}

