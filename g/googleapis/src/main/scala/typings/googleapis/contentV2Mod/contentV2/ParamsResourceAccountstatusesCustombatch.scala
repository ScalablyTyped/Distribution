package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountstatusesCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountstatusesCustomBatchRequest] = js.undefined
}
object ParamsResourceAccountstatusesCustombatch {
  
  inline def apply(): ParamsResourceAccountstatusesCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountstatusesCustombatch]
  }
  
  extension [Self <: ParamsResourceAccountstatusesCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaAccountstatusesCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
