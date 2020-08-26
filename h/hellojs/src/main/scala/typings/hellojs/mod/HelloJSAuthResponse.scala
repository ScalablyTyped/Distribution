package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSAuthResponse extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var client_id: js.UndefOr[String] = js.native
  var display: js.UndefOr[HelloJSDisplayType] = js.native
  var expires: js.UndefOr[Double] = js.native
  var expires_in: js.UndefOr[Double] = js.native
  var id_token: js.UndefOr[String] = js.native
  var network: js.UndefOr[String] = js.native
  var redirect_uri: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var session_state: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var token_type: js.UndefOr[String] = js.native
}

object HelloJSAuthResponse {
  @scala.inline
  def apply(): HelloJSAuthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelloJSAuthResponse]
  }
  @scala.inline
  implicit class HelloJSAuthResponseOps[Self <: HelloJSAuthResponse] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setDisplay(value: HelloJSDisplayType): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSession_state(value: String): Self = this.set("session_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_state: Self = this.set("session_state", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
  }
  
}

