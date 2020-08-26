package typings.ltijs.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformConfig extends js.Object {
  var accesstokenEndpoint: String = js.native
  var authConfig: PlatformAuthConfig = js.native
  var authenticationEndpoint: String = js.native
  var clientId: String = js.native
  var name: String = js.native
  var url: String = js.native
}

object PlatformConfig {
  @scala.inline
  def apply(
    accesstokenEndpoint: String,
    authConfig: PlatformAuthConfig,
    authenticationEndpoint: String,
    clientId: String,
    name: String,
    url: String
  ): PlatformConfig = {
    val __obj = js.Dynamic.literal(accesstokenEndpoint = accesstokenEndpoint.asInstanceOf[js.Any], authConfig = authConfig.asInstanceOf[js.Any], authenticationEndpoint = authenticationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConfig]
  }
  @scala.inline
  implicit class PlatformConfigOps[Self <: PlatformConfig] (val x: Self) extends AnyVal {
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
    def setAccesstokenEndpoint(value: String): Self = this.set("accesstokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthConfig(value: PlatformAuthConfig): Self = this.set("authConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationEndpoint(value: String): Self = this.set("authenticationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

