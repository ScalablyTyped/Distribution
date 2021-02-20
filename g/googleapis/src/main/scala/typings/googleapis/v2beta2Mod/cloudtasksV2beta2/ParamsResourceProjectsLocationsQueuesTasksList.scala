package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsQueuesTasksList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Requested page size. Fewer tasks than requested might be returned.  The
    * maximum page size is 1000. If unspecified, the page size will be the
    * maximum. Fewer tasks than requested might be returned, even if more tasks
    * exist; use next_page_token in the response to determine if more tasks
    * exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying the page of results to return.  To request the first
    * page results, page_token must be empty. To request the next page of
    * results, page_token must be the value of next_page_token returned from
    * the previous call to ListTasks method.  The page token is valid for only
    * 2 hours.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required.  The queue name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsQueuesTasksList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsQueuesTasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsQueuesTasksList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsQueuesTasksListMutableBuilder[Self <: ParamsResourceProjectsLocationsQueuesTasksList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
