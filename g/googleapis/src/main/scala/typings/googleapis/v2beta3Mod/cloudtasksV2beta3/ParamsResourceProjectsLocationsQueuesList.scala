package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsQueuesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * `filter` can be used to specify a subset of queues. Any Queue field can
    * be used as a filter and several operators as supported. For example: `<=,
    * <, >=, >, !=, =, :`. The filter syntax is the same as described in
    * [Stackdriver's Advanced Logs
    * Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    * Sample filter "state: PAUSED".  Note that using filters might cause fewer
    * queues than the requested page_size to be returned.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Requested page size.  The maximum page size is 9800. If unspecified, the
    * page size will be the maximum. Fewer queues than requested might be
    * returned, even if more queues exist; use the next_page_token in the
    * response to determine if more queues exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying the page of results to return.  To request the first
    * page results, page_token must be empty. To request the next page of
    * results, page_token must be the value of next_page_token returned from
    * the previous call to ListQueues method. It is an error to switch the
    * value of the filter while iterating through pages.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required.  The location name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID`
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsQueuesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsQueuesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsQueuesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsQueuesListMutableBuilder[Self <: ParamsResourceProjectsLocationsQueuesList] (val x: Self) extends AnyVal {
    
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
