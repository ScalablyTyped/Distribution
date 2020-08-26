package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProcessesListscriptprocesses extends StandardParameters {
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
    * The script ID of the project whose processes are listed.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("scriptProcessFilter.deploymentId")
  var scriptProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("scriptProcessFilter.endTime")
  var scriptProcessFilterDotendTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("scriptProcessFilter.functionName")
  var scriptProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("scriptProcessFilter.startTime")
  var scriptProcessFilterDotstartTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("scriptProcessFilter.statuses")
  var scriptProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("scriptProcessFilter.types")
  var scriptProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("scriptProcessFilter.userAccessLevels")
  var scriptProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceProcessesListscriptprocesses {
  @scala.inline
  def apply(): ParamsResourceProcessesListscriptprocesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProcessesListscriptprocesses]
  }
  @scala.inline
  implicit class ParamsResourceProcessesListscriptprocessesOps[Self <: ParamsResourceProcessesListscriptprocesses] (val x: Self) extends AnyVal {
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
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotdeploymentId(value: String): Self = this.set("scriptProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotdeploymentId: Self = this.set("scriptProcessFilter.deploymentId", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotendTime(value: String): Self = this.set("scriptProcessFilter.endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotendTime: Self = this.set("scriptProcessFilter.endTime", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotfunctionName(value: String): Self = this.set("scriptProcessFilter.functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotfunctionName: Self = this.set("scriptProcessFilter.functionName", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotstartTime(value: String): Self = this.set("scriptProcessFilter.startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotstartTime: Self = this.set("scriptProcessFilter.startTime", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotstatusesVarargs(value: String*): Self = this.set("scriptProcessFilter.statuses", js.Array(value :_*))
    @scala.inline
    def setScriptProcessFilterDotstatuses(value: js.Array[String]): Self = this.set("scriptProcessFilter.statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotstatuses: Self = this.set("scriptProcessFilter.statuses", js.undefined)
    @scala.inline
    def setScriptProcessFilterDottypesVarargs(value: String*): Self = this.set("scriptProcessFilter.types", js.Array(value :_*))
    @scala.inline
    def setScriptProcessFilterDottypes(value: js.Array[String]): Self = this.set("scriptProcessFilter.types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDottypes: Self = this.set("scriptProcessFilter.types", js.undefined)
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = this.set("scriptProcessFilter.userAccessLevels", js.Array(value :_*))
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = this.set("scriptProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptProcessFilterDotuserAccessLevels: Self = this.set("scriptProcessFilter.userAccessLevels", js.undefined)
  }
  
}

