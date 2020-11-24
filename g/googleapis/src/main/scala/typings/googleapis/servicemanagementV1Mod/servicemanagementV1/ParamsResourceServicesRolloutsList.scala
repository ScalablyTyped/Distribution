package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceServicesRolloutsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Use `filter` to return subset of rollouts. The following filters are
    * supported:   -- To limit the results to only those in
    * [status](google.api.servicemanagement.v1.RolloutStatus) 'SUCCESS', use
    * filter='status=SUCCESS'   -- To limit the results to those in
    * [status](google.api.servicemanagement.v1.RolloutStatus) 'CANCELLED' or
    * 'FAILED', use filter='status=CANCELLED OR status=FAILED'
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The max number of items to include in the response list. Page size is 50
    * if not specified. Maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The token of the page to retrieve.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the service.  See the
    * [overview](/service-management/overview) for naming requirements.  For
    * example: `example.googleapis.com`.
    */
  var serviceName: js.UndefOr[String] = js.native
}
object ParamsResourceServicesRolloutsList {
  
  @scala.inline
  def apply(): ParamsResourceServicesRolloutsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesRolloutsList]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesRolloutsListOps[Self <: ParamsResourceServicesRolloutsList] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
