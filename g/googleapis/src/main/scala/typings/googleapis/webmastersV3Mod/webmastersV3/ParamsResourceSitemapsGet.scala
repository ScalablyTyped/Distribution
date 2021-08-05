package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitemapsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The URL of the actual sitemap. For example:
    * http://www.example.com/sitemap.xml
    */
  var feedpath: js.UndefOr[String] = js.undefined
  
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitemapsGet {
  
  inline def apply(): ParamsResourceSitemapsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitemapsGet]
  }
  
  extension [Self <: ParamsResourceSitemapsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFeedpath(value: String): Self = StObject.set(x, "feedpath", value.asInstanceOf[js.Any])
    
    inline def setFeedpathUndefined: Self = StObject.set(x, "feedpath", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
