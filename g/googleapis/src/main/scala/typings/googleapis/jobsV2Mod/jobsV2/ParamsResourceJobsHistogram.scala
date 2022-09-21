package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsHistogram
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetHistogramRequest] = js.undefined
}
object ParamsResourceJobsHistogram {
  
  inline def apply(): ParamsResourceJobsHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsHistogram]
  }
  
  extension [Self <: ParamsResourceJobsHistogram](x: Self) {
    
    inline def setRequestBody(value: SchemaGetHistogramRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
