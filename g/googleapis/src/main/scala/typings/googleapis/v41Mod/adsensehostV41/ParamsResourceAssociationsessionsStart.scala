package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssociationsessionsStart
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Products to associate with the user.
    */
  var productCode: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The preferred locale of the user.
    */
  var userLocale: js.UndefOr[String] = js.undefined
  
  /**
    * The locale of the user's hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the user's hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssociationsessionsStart {
  
  inline def apply(): ParamsResourceAssociationsessionsStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssociationsessionsStart]
  }
  
  extension [Self <: ParamsResourceAssociationsessionsStart](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setProductCode(value: js.Array[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductCodeVarargs(value: String*): Self = StObject.set(x, "productCode", js.Array(value :_*))
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    inline def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    inline def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
