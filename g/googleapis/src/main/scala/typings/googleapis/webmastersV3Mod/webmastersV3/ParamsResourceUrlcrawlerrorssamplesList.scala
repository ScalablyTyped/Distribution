package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlcrawlerrorssamplesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The crawl error category. For example: authPermissions
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The user agent type (platform) that made the request. For example: web
    */
  var platform: js.UndefOr[String] = js.undefined
  
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrlcrawlerrorssamplesList {
  
  @scala.inline
  def apply(): ParamsResourceUrlcrawlerrorssamplesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlcrawlerrorssamplesList]
  }
  
  @scala.inline
  implicit class ParamsResourceUrlcrawlerrorssamplesListMutableBuilder[Self <: ParamsResourceUrlcrawlerrorssamplesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
