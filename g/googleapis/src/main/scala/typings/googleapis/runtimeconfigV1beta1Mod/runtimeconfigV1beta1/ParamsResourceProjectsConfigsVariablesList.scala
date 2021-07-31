package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConfigsVariablesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Filters variables by matching the specified filter. For example:
    * `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the number of results to return per page. If there are fewer
    * elements than the specified number, returns all elements.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the RuntimeConfig resource for which you want to list
    * variables. The configuration must exist beforehand; the path must be in
    * the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The flag indicates whether the user wants to return values of variables.
    * If true, then only those variables that user has IAM GetVariable
    * permission will be returned along with their values.
    */
  var returnValues: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsConfigsVariablesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsConfigsVariablesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsVariablesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsConfigsVariablesListMutableBuilder[Self <: ParamsResourceProjectsConfigsVariablesList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setReturnValues(value: Boolean): Self = StObject.set(x, "returnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesUndefined: Self = StObject.set(x, "returnValues", js.undefined)
  }
}
