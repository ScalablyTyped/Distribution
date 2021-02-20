package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsNotificationchannelsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If provided, this field specifies the criteria that must be met by
    * notification channels to be included in the response.For more details,
    * see sorting and filtering.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The project on which to execute the request. The format is
    * projects/[PROJECT_ID]. That is, this names the container in which to look
    * for the notification channels; it does not name a specific channel. To
    * query a specific channel by REST resource name, use the
    * GetNotificationChannel operation.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of fields by which to sort the result. Supports
    * the same set of fields as in filter. Entries can be prefixed with a minus
    * sign to sort in descending rather than ascending order.For more details,
    * see sorting and filtering.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single response. If not set
    * to a positive number, a reasonable value will be chosen by the service.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If non-empty, page_token must contain a value returned as the
    * next_page_token in a previous response to request the next set of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsNotificationchannelsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsNotificationchannelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchannelsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsNotificationchannelsListMutableBuilder[Self <: ParamsResourceProjectsNotificationchannelsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
  }
}
