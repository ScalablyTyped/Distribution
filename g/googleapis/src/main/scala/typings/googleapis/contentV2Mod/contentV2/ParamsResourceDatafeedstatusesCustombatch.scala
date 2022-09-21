package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedstatusesCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDatafeedstatusesCustomBatchRequest] = js.undefined
}
object ParamsResourceDatafeedstatusesCustombatch {
  
  inline def apply(): ParamsResourceDatafeedstatusesCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedstatusesCustombatch]
  }
  
  extension [Self <: ParamsResourceDatafeedstatusesCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaDatafeedstatusesCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
