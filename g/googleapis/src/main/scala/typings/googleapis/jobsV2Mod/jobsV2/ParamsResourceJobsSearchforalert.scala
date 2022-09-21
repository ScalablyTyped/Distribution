package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsSearchforalert
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchJobsRequest] = js.undefined
}
object ParamsResourceJobsSearchforalert {
  
  inline def apply(): ParamsResourceJobsSearchforalert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsSearchforalert]
  }
  
  extension [Self <: ParamsResourceJobsSearchforalert](x: Self) {
    
    inline def setRequestBody(value: SchemaSearchJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
