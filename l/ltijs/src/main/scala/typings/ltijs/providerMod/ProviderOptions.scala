package typings.ltijs.providerMod

import typings.express.mod.Express
import typings.ltijs.anon.Cert
import typings.ltijs.anon.SameSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderOptions extends js.Object {
  
  var appUrl: js.UndefOr[String] = js.native
  
  var cookies: js.UndefOr[SameSite] = js.native
  
  var cors: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var invalidTokenUrl: js.UndefOr[String] = js.native
  
  var keysetUrl: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[Boolean] = js.native
  
  var loginUrl: js.UndefOr[String] = js.native
  
  var serverAddon: js.UndefOr[ServerAddonFunction] = js.native
  
  var sessionTimeoutUrl: js.UndefOr[String] = js.native
  
  var ssl: js.UndefOr[Cert] = js.native
  
  var staticPath: js.UndefOr[String] = js.native
}
object ProviderOptions {
  
  @scala.inline
  def apply(): ProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderOptions]
  }
  
  @scala.inline
  implicit class ProviderOptionsOps[Self <: ProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    
    @scala.inline
    def setCookies(value: SameSite): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setInvalidTokenUrl(value: String): Self = this.set("invalidTokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidTokenUrl: Self = this.set("invalidTokenUrl", js.undefined)
    
    @scala.inline
    def setKeysetUrl(value: String): Self = this.set("keysetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeysetUrl: Self = this.set("keysetUrl", js.undefined)
    
    @scala.inline
    def setLogger(value: Boolean): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setServerAddon(value: /* app */ Express => Unit): Self = this.set("serverAddon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteServerAddon: Self = this.set("serverAddon", js.undefined)
    
    @scala.inline
    def setSessionTimeoutUrl(value: String): Self = this.set("sessionTimeoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeoutUrl: Self = this.set("sessionTimeoutUrl", js.undefined)
    
    @scala.inline
    def setSsl(value: Cert): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setStaticPath(value: String): Self = this.set("staticPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticPath: Self = this.set("staticPath", js.undefined)
  }
}
