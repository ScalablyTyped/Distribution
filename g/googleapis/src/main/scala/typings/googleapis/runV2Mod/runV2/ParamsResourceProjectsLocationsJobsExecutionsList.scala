package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsExecutionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of Executions to return in this call.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token received from a previous call to ListExecutions. All other parameters must match.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Execution from which the Executions should be listed. To list all Executions across Jobs, use "-" instead of Job name. Format: projects/{project\}/locations/{location\}/jobs/{job\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * If true, returns deleted (but unexpired) resources along with active ones.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsJobsExecutionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsExecutionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsExecutionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsExecutionsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}
