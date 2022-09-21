package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateJobsResponse extends StObject {
  
  /**
    * List of job mutation results from a batch create operation. It can change until operation status is FINISHED, FAILED or CANCELLED.
    */
  var jobResults: js.UndefOr[js.Array[SchemaJobResult]] = js.undefined
}
object SchemaBatchCreateJobsResponse {
  
  inline def apply(): SchemaBatchCreateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateJobsResponse]
  }
  
  extension [Self <: SchemaBatchCreateJobsResponse](x: Self) {
    
    inline def setJobResults(value: js.Array[SchemaJobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    inline def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    inline def setJobResultsVarargs(value: SchemaJobResult*): Self = StObject.set(x, "jobResults", js.Array(value*))
  }
}
