package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsConfigsVariablesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Filters variables by matching the specified filter. For example:
    * `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Specifies the number of results to return per page. If there are fewer
    * elements than the specified number, returns all elements.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The path to the RuntimeConfig resource for which you want to list
    * variables. The configuration must exist beforehand; the path must be in
    * the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The flag indicates whether the user wants to return values of variables.
    * If true, then only those variables that user has IAM GetVariable
    * permission will be returned along with their values.
    */
  var returnValues: js.UndefOr[Boolean] = js.native
}
object ParamsResourceProjectsConfigsVariablesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsConfigsVariablesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsVariablesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsConfigsVariablesListOps[Self <: ParamsResourceProjectsConfigsVariablesList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setReturnValues(value: Boolean): Self = this.set("returnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValues: Self = this.set("returnValues", js.undefined)
  }
}
