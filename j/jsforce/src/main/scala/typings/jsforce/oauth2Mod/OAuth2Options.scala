package typings.jsforce.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Options extends js.Object {
  
  var authCode: js.UndefOr[String] = js.native
  
  var authzServiceUrl: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var httpProxy: js.UndefOr[String] = js.native
  
  var loginUrl: js.UndefOr[String] = js.native
  
  var privateKey: js.UndefOr[String] = js.native
  
  var privateKeyFile: js.UndefOr[String] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var revokeServiceUrl: js.UndefOr[String] = js.native
  
  var tokenServiceUrl: js.UndefOr[String] = js.native
}
object OAuth2Options {
  
  @scala.inline
  def apply(): OAuth2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Options]
  }
  
  @scala.inline
  implicit class OAuth2OptionsOps[Self <: OAuth2Options] (val x: Self) extends AnyVal {
    
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
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCode: Self = this.set("authCode", js.undefined)
    
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
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpProxy: Self = this.set("httpProxy", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setPrivateKeyFile(value: String): Self = this.set("privateKeyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyFile: Self = this.set("privateKeyFile", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setRevokeServiceUrl(value: String): Self = this.set("revokeServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokeServiceUrl: Self = this.set("revokeServiceUrl", js.undefined)
    
    @scala.inline
    def setTokenServiceUrl(value: String): Self = this.set("tokenServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenServiceUrl: Self = this.set("tokenServiceUrl", js.undefined)
  }
}
