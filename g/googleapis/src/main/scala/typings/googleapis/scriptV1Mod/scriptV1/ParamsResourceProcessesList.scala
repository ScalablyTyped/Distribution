package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProcessesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The maximum number of returned processes per page of results. Defaults
    * to 50.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of `nextPageToken` from a previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with project names containing a specific string.
    */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific script ID.
    */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.native
  
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceProcessesList {
  
  @scala.inline
  def apply(): ParamsResourceProcessesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProcessesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProcessesListOps[Self <: ParamsResourceProcessesList] (val x: Self) extends AnyVal {
    
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotdeploymentId(value: String): Self = this.set("userProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotdeploymentId: Self = this.set("userProcessFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotendTime(value: String): Self = this.set("userProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotendTime: Self = this.set("userProcessFilter.endTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotfunctionName(value: String): Self = this.set("userProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotfunctionName: Self = this.set("userProcessFilter.functionName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotprojectName(value: String): Self = this.set("userProcessFilter.projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotprojectName: Self = this.set("userProcessFilter.projectName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotscriptId(value: String): Self = this.set("userProcessFilter.scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotscriptId: Self = this.set("userProcessFilter.scriptId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstartTime(value: String): Self = this.set("userProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotstartTime: Self = this.set("userProcessFilter.startTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstatusesVarargs(value: String*): Self = this.set("userProcessFilter.statuses", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDotstatuses(value: js.Array[String]): Self = this.set("userProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotstatuses: Self = this.set("userProcessFilter.statuses", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDottypesVarargs(value: String*): Self = this.set("userProcessFilter.types", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDottypes(value: js.Array[String]): Self = this.set("userProcessFilter.types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDottypes: Self = this.set("userProcessFilter.types", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = this.set("userProcessFilter.userAccessLevels", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = this.set("userProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotuserAccessLevels: Self = this.set("userProcessFilter.userAccessLevels", js.undefined)
  }
}
