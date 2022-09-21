package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnaddressCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReturnaddressCustomBatchRequest] = js.undefined
}
object ParamsResourceReturnaddressCustombatch {
  
  inline def apply(): ParamsResourceReturnaddressCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnaddressCustombatch]
  }
  
  extension [Self <: ParamsResourceReturnaddressCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaReturnaddressCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
