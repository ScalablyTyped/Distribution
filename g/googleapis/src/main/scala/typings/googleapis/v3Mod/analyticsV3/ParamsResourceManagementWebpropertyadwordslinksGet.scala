package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementWebpropertyadwordslinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * ID of the account which the given web property belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Web property-Google Ads link ID.
    */
  var webPropertyAdWordsLinkId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to retrieve the Google Ads link for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementWebpropertyadwordslinksGet {
  
  @scala.inline
  def apply(): ParamsResourceManagementWebpropertyadwordslinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementWebpropertyadwordslinksGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementWebpropertyadwordslinksGetMutableBuilder[Self <: ParamsResourceManagementWebpropertyadwordslinksGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setWebPropertyAdWordsLinkId(value: String): Self = StObject.set(x, "webPropertyAdWordsLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyAdWordsLinkIdUndefined: Self = StObject.set(x, "webPropertyAdWordsLinkId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
