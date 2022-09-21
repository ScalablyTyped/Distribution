package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProcessesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of returned processes per page of results. Defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those originating from projects with a specific deployment ID.
    */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those that completed on or before the given timestamp.
    */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those originating from a script function with the given function name.
    */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those originating from projects with project names containing a specific string.
    */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those originating from projects with a specific script ID.
    */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those that were started on or after the given timestamp.
    */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those having one of the specified process statuses.
    */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those having one of the specified process types.
    */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional field used to limit returned processes to those having one of the specified user access levels.
    */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceProcessesList {
  
  inline def apply(): ParamsResourceProcessesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProcessesList]
  }
  
  extension [Self <: ParamsResourceProcessesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setUserProcessFilterDotdeploymentId(value: String): Self = StObject.set(x, "userProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotdeploymentIdUndefined: Self = StObject.set(x, "userProcessFilter.deploymentId", js.undefined)
    
    inline def setUserProcessFilterDotendTime(value: String): Self = StObject.set(x, "userProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotendTimeUndefined: Self = StObject.set(x, "userProcessFilter.endTime", js.undefined)
    
    inline def setUserProcessFilterDotfunctionName(value: String): Self = StObject.set(x, "userProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotfunctionNameUndefined: Self = StObject.set(x, "userProcessFilter.functionName", js.undefined)
    
    inline def setUserProcessFilterDotprojectName(value: String): Self = StObject.set(x, "userProcessFilter.projectName", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotprojectNameUndefined: Self = StObject.set(x, "userProcessFilter.projectName", js.undefined)
    
    inline def setUserProcessFilterDotscriptId(value: String): Self = StObject.set(x, "userProcessFilter.scriptId", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotscriptIdUndefined: Self = StObject.set(x, "userProcessFilter.scriptId", js.undefined)
    
    inline def setUserProcessFilterDotstartTime(value: String): Self = StObject.set(x, "userProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotstartTimeUndefined: Self = StObject.set(x, "userProcessFilter.startTime", js.undefined)
    
    inline def setUserProcessFilterDotstatuses(value: js.Array[String]): Self = StObject.set(x, "userProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotstatusesUndefined: Self = StObject.set(x, "userProcessFilter.statuses", js.undefined)
    
    inline def setUserProcessFilterDotstatusesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.statuses", js.Array(value*))
    
    inline def setUserProcessFilterDottypes(value: js.Array[String]): Self = StObject.set(x, "userProcessFilter.types", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDottypesUndefined: Self = StObject.set(x, "userProcessFilter.types", js.undefined)
    
    inline def setUserProcessFilterDottypesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.types", js.Array(value*))
    
    inline def setUserProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = StObject.set(x, "userProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotuserAccessLevelsUndefined: Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.undefined)
    
    inline def setUserProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.Array(value*))
  }
}
