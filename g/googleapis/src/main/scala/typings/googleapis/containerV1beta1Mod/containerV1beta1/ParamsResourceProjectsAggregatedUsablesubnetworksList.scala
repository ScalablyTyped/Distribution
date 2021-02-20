package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAggregatedUsablesubnetworksList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Filtering currently only supports equality on the networkProjectId and
    * must be in the form: "networkProjectId=[PROJECTID]", where
    * `networkProjectId` is the project which owns the listed subnetworks. This
    * defaults to the parent project ID.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The max number of results per page that should be returned. If the number
    * of available results is larger than `page_size`, a `next_page_token` is
    * returned which can be used to get the next page of results in subsequent
    * requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a page token to use. Set this to the nextPageToken returned by
    * previous list requests to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The parent project where subnetworks are usable. Specified in the format
    * 'projects/x'.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsAggregatedUsablesubnetworksList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAggregatedUsablesubnetworksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAggregatedUsablesubnetworksList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAggregatedUsablesubnetworksListMutableBuilder[Self <: ParamsResourceProjectsAggregatedUsablesubnetworksList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
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
