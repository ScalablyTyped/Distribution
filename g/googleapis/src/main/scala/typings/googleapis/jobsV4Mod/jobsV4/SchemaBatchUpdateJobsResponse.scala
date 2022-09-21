package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateJobsResponse extends StObject {
  
  /**
    * List of job mutation results from a batch update operation. It can change until operation status is FINISHED, FAILED or CANCELLED.
    */
  var jobResults: js.UndefOr[js.Array[SchemaJobResult]] = js.undefined
}
object SchemaBatchUpdateJobsResponse {
  
  inline def apply(): SchemaBatchUpdateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateJobsResponse]
  }
  
  extension [Self <: SchemaBatchUpdateJobsResponse](x: Self) {
    
    inline def setJobResults(value: js.Array[SchemaJobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    inline def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    inline def setJobResultsVarargs(value: SchemaJobResult*): Self = StObject.set(x, "jobResults", js.Array(value*))
  }
}
