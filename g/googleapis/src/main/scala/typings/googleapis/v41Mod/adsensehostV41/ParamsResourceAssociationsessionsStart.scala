package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAssociationsessionsStart extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Products to associate with the user.
    */
  var productCode: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The preferred locale of the user.
    */
  var userLocale: js.UndefOr[String] = js.native
  
  /**
    * The locale of the user's hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.native
  
  /**
    * The URL of the user's hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object ParamsResourceAssociationsessionsStart {
  
  @scala.inline
  def apply(): ParamsResourceAssociationsessionsStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssociationsessionsStart]
  }
  
  @scala.inline
  implicit class ParamsResourceAssociationsessionsStartOps[Self <: ParamsResourceAssociationsessionsStart] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setProductCodeVarargs(value: String*): Self = this.set("productCode", js.Array(value :_*))
    
    @scala.inline
    def setProductCode(value: js.Array[String]): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setUserLocale(value: String): Self = this.set("userLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocale: Self = this.set("userLocale", js.undefined)
    
    @scala.inline
    def setWebsiteLocale(value: String): Self = this.set("websiteLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteLocale: Self = this.set("websiteLocale", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
