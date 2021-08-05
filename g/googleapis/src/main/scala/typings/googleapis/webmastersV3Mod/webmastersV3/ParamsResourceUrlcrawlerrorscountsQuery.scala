package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlcrawlerrorscountsQuery
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The crawl error category. For example: serverError. If not specified,
    * returns results for all categories.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * If true, returns only the latest crawl error counts.
    */
  var latestCountsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user agent type (platform) that made the request. For example: web.
    * If not specified, returns results for all platforms.
    */
  var platform: js.UndefOr[String] = js.undefined
  
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrlcrawlerrorscountsQuery {
  
  inline def apply(): ParamsResourceUrlcrawlerrorscountsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlcrawlerrorscountsQuery]
  }
  
  extension [Self <: ParamsResourceUrlcrawlerrorscountsQuery](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setLatestCountsOnly(value: Boolean): Self = StObject.set(x, "latestCountsOnly", value.asInstanceOf[js.Any])
    
    inline def setLatestCountsOnlyUndefined: Self = StObject.set(x, "latestCountsOnly", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
