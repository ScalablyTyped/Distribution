package typings.googleapis.fileV1beta1Mod.fileV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsInstancesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * List filter.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Sort results. Supported values are "name", "name desc" or "" (unsorted).
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value to use if there are additional results to
    * retrieve for this list request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The project and location for which to retrieve instance information, in
    * the format projects/{project_id}/locations/{location}. In Cloud
    * Filestore, locations map to GCP zones, for example **us-west1-b**. To
    * retrieve instance information for all locations, use "-" for the
    * {location} value.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsInstancesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsInstancesListMutableBuilder[Self <: ParamsResourceProjectsLocationsInstancesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
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
