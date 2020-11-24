package typings.jsforce.connectionMod

import typings.jsforce.anon.PartialPartialOAuth2Optio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends PartialOAuth2Options {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var callOptions: js.UndefOr[js.Object] = js.native
  
  var httpProxy: js.UndefOr[String] = js.native
  
  var instanceUrl: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var maxRequest: js.UndefOr[Double] = js.native
  
  var oauth2: js.UndefOr[PartialPartialOAuth2Optio] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
  
  var refreshFn: js.UndefOr[
    js.Function2[/* conn */ Connection, /* callback */ Callback[UserInfo], js.Promise[UserInfo]]
  ] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var serverUrl: js.UndefOr[String] = js.native
  
  var sessionId: js.UndefOr[String] = js.native
  
  var signedRequest: js.UndefOr[String | js.Object] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setCallOptions(value: js.Object): Self = this.set("callOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallOptions: Self = this.set("callOptions", js.undefined)
    
    @scala.inline
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpProxy: Self = this.set("httpProxy", js.undefined)
    
    @scala.inline
    def setInstanceUrl(value: String): Self = this.set("instanceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceUrl: Self = this.set("instanceUrl", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMaxRequest(value: Double): Self = this.set("maxRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequest: Self = this.set("maxRequest", js.undefined)
    
    @scala.inline
    def setOauth2(value: PartialPartialOAuth2Optio): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2: Self = this.set("oauth2", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setRefreshFn(value: (/* conn */ Connection, /* callback */ Callback[UserInfo]) => js.Promise[UserInfo]): Self = this.set("refreshFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRefreshFn: Self = this.set("refreshFn", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerUrl: Self = this.set("serverUrl", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setSignedRequest(value: String | js.Object): Self = this.set("signedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedRequest: Self = this.set("signedRequest", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
