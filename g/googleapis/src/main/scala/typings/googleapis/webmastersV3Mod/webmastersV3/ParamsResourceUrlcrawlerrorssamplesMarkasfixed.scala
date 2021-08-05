package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlcrawlerrorssamplesMarkasfixed
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
  
  /**
    * The relative path (without the site) of the sample URL. It must be one of
    * the URLs returned by list(). For example, for the URL
    * https://www.example.com/pagename on the site https://www.example.com/,
    * the url value is pagename
    */
  var url: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrlcrawlerrorssamplesMarkasfixed {
  
  inline def apply(): ParamsResourceUrlcrawlerrorssamplesMarkasfixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlcrawlerrorssamplesMarkasfixed]
  }
  
  extension [Self <: ParamsResourceUrlcrawlerrorssamplesMarkasfixed](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
