package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceProcessesListscriptprocessesMutableBuilder[Self <: ParamsResourceProcessesListscriptprocesses] (val x: Self) extends AnyVal {
    
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
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotdeploymentId(value: String): Self = StObject.set(x, "scriptProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotdeploymentIdUndefined: Self = StObject.set(x, "scriptProcessFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotendTime(value: String): Self = StObject.set(x, "scriptProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotendTimeUndefined: Self = StObject.set(x, "scriptProcessFilter.endTime", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotfunctionName(value: String): Self = StObject.set(x, "scriptProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotfunctionNameUndefined: Self = StObject.set(x, "scriptProcessFilter.functionName", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstartTime(value: String): Self = StObject.set(x, "scriptProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotstartTimeUndefined: Self = StObject.set(x, "scriptProcessFilter.startTime", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstatuses(value: js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotstatusesUndefined: Self = StObject.set(x, "scriptProcessFilter.statuses", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstatusesVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.statuses", js.Array(value :_*))
    
    @scala.inline
    def setScriptProcessFilterDottypes(value: js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDottypesUndefined: Self = StObject.set(x, "scriptProcessFilter.types", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDottypesVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.types", js.Array(value :_*))
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevelsUndefined: Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", js.Array(value :_*))
  }
}
