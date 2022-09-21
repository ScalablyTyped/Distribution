package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Deprecated. This field is not working anymore. Optional. If set to true, this call waits for all processing steps to complete before the job is cleaned up. Otherwise, the call returns while some steps are still taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The resource name of the job to be deleted, such as "jobs/11111111".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsDelete {
  
  inline def apply(): ParamsResourceJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsDelete]
  }
  
  extension [Self <: ParamsResourceJobsDelete](x: Self) {
    
    inline def setDisableFastProcess(value: Boolean): Self = StObject.set(x, "disableFastProcess", value.asInstanceOf[js.Any])
    
    inline def setDisableFastProcessUndefined: Self = StObject.set(x, "disableFastProcess", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
