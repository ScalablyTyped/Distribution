package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If set to true, also system-managed jobs will be returned; otherwise only
    * user-created jobs will be returned. System-managed jobs can neither be
    * modified nor deleted.
    */
  var includeSystemManaged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content owner's external ID on which behalf the user is acting on. If
    * not set, the user is acting for himself (his own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Server may return fewer jobs than requested. If
    * unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListReportTypesResponse.next_page_token
    * returned in response to the previous call to the `ListJobs` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsList {
  
  @scala.inline
  def apply(): ParamsResourceJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsListMutableBuilder[Self <: ParamsResourceJobsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeSystemManaged(value: Boolean): Self = StObject.set(x, "includeSystemManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSystemManagedUndefined: Self = StObject.set(x, "includeSystemManaged", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
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
