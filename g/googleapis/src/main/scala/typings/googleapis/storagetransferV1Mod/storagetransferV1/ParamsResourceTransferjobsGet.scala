package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransferjobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The job to get.
    */
  var jobName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTransferjobsGet {
  
  inline def apply(): ParamsResourceTransferjobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransferjobsGet]
  }
  
  extension [Self <: ParamsResourceTransferjobsGet](x: Self) {
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
