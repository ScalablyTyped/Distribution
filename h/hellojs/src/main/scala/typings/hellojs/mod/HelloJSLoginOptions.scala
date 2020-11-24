package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelloJSLoginOptions extends js.Object {
  
  var default_service: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[HelloJSDisplayType] = js.native
  
  var force: js.UndefOr[Boolean | Null] = js.native
  
  var oauth_proxy: js.UndefOr[String] = js.native
  
  var popup: js.UndefOr[HelloJSPopupOptions] = js.native
  
  var redirect_uri: js.UndefOr[String] = js.native
  
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object HelloJSLoginOptions {
  
  @scala.inline
  def apply(): HelloJSLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelloJSLoginOptions]
  }
  
  @scala.inline
  implicit class HelloJSLoginOptionsOps[Self <: HelloJSLoginOptions] (val x: Self) extends AnyVal {
    
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
    def setDefault_service(value: String): Self = this.set("default_service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_service: Self = this.set("default_service", js.undefined)
    
    @scala.inline
    def setDisplay(value: HelloJSDisplayType): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setForceNull: Self = this.set("force", null)
    
    @scala.inline
    def setOauth_proxy(value: String): Self = this.set("oauth_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_proxy: Self = this.set("oauth_proxy", js.undefined)
    
    @scala.inline
    def setPopup(value: HelloJSPopupOptions): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    
    @scala.inline
    def setResponse_type(value: HelloJSTokenResponseType): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
