package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsDeletebyfilter
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeleteJobsByFilterRequest] = js.undefined
}
object ParamsResourceJobsDeletebyfilter {
  
  inline def apply(): ParamsResourceJobsDeletebyfilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsDeletebyfilter]
  }
  
  extension [Self <: ParamsResourceJobsDeletebyfilter](x: Self) {
    
    inline def setRequestBody(value: SchemaDeleteJobsByFilterRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
