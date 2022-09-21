package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the project under which the job is created. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeleteJobsRequest] = js.undefined
}
object ParamsResourceProjectsJobsBatchdelete {
  
  inline def apply(): ParamsResourceProjectsJobsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsBatchdelete]
  }
  
  extension [Self <: ParamsResourceProjectsJobsBatchdelete](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchDeleteJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
