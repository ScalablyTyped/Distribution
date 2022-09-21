package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeleteJobsRequest] = js.undefined
}
object ParamsResourceJobsBatchdelete {
  
  inline def apply(): ParamsResourceJobsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsBatchdelete]
  }
  
  extension [Self <: ParamsResourceJobsBatchdelete](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchDeleteJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
