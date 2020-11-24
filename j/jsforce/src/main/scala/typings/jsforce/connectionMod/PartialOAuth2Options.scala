package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialOAuth2Options extends js.Object {
  
  var authzServiceUrl: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var loginUrl: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var tokenServiceUrl: js.UndefOr[String] = js.native
}
object PartialOAuth2Options {
  
  @scala.inline
  def apply(): PartialOAuth2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOAuth2Options]
  }
  
  @scala.inline
  implicit class PartialOAuth2OptionsOps[Self <: PartialOAuth2Options] (val x: Self) extends AnyVal {
    
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
    def setAuthzServiceUrl(value: String): Self = this.set("authzServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthzServiceUrl: Self = this.set("authzServiceUrl", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setTokenServiceUrl(value: String): Self = this.set("tokenServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenServiceUrl: Self = this.set("tokenServiceUrl", js.undefined)
  }
}
