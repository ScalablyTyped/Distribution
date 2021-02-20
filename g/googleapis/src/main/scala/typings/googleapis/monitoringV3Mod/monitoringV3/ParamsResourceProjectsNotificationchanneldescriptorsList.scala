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
trait ParamsResourceProjectsNotificationchanneldescriptorsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The REST resource name of the parent from which to retrieve the
    * notification channel descriptors. The expected syntax is:
    * projects/[PROJECT_ID] Note that this names the parent container in which
    * to look for the descriptors; to retrieve a single descriptor by name, use
    * the GetNotificationChannelDescriptor operation, instead.
    */
  var name: js.UndefOr[String] = js.native
  
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
object ParamsResourceProjectsNotificationchanneldescriptorsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsNotificationchanneldescriptorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchanneldescriptorsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsNotificationchanneldescriptorsListMutableBuilder[Self <: ParamsResourceProjectsNotificationchanneldescriptorsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
