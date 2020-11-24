package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
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
    * Sample filter "app_engine_http_target: *".  Note that using filters might
    * cause fewer queues than the requested_page size to be returned.
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
  implicit class ParamsResourceProjectsLocationsQueuesListOps[Self <: ParamsResourceProjectsLocationsQueuesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
