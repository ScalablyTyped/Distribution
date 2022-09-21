package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateJobsRequest extends StObject {
  
  /**
    * Required. The jobs to be created. A maximum of 200 jobs can be created in a batch.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.undefined
}
object SchemaBatchCreateJobsRequest {
  
  inline def apply(): SchemaBatchCreateJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateJobsRequest]
  }
  
  extension [Self <: SchemaBatchCreateJobsRequest](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaJob*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
