package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionalinventoryCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRegionalinventoryCustomBatchRequest] = js.undefined
}
object ParamsResourceRegionalinventoryCustombatch {
  
  inline def apply(): ParamsResourceRegionalinventoryCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionalinventoryCustombatch]
  }
  
  extension [Self <: ParamsResourceRegionalinventoryCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaRegionalinventoryCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
