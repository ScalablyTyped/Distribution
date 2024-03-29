package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsExecutionsTasksList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of Tasks to return in this call.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token received from a previous call to ListTasks. All other parameters must match.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Execution from which the Tasks should be listed. To list all Tasks across Executions of a Job, use "-" instead of Execution name. To list all Tasks across Jobs, use "-" instead of Job name. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * If true, returns deleted (but unexpired) resources along with active ones.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsJobsExecutionsTasksList {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsExecutionsTasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsExecutionsTasksList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsExecutionsTasksList](x: Self) {
    
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
