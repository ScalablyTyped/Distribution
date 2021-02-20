package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMonitoredresourcedescriptorsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The maximum number of results to return from this request.
    * Non-positive values are ignored. The presence of nextPageToken in the
    * response indicates that more results might be available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. If present, then retrieve the next batch of results from the
    * preceding call to this method. pageToken must be the value of
    * nextPageToken from the previous response. The values of other method
    * parameters should be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceMonitoredresourcedescriptorsList {
  
  @scala.inline
  def apply(): ParamsResourceMonitoredresourcedescriptorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonitoredresourcedescriptorsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMonitoredresourcedescriptorsListMutableBuilder[Self <: ParamsResourceMonitoredresourcedescriptorsList] (val x: Self) extends AnyVal {
    
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
  }
}
