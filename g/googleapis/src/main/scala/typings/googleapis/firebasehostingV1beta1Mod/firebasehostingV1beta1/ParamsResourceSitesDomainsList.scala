package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesDomainsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The page size to return. Defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token from a previous request, if provided.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent for which to list domains, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesDomainsList {
  
  @scala.inline
  def apply(): ParamsResourceSitesDomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesDomainsList]
  }
  
  @scala.inline
  implicit class ParamsResourceSitesDomainsListMutableBuilder[Self <: ParamsResourceSitesDomainsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
