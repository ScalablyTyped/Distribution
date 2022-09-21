package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocalinventoryCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLocalinventoryCustomBatchRequest] = js.undefined
}
object ParamsResourceLocalinventoryCustombatch {
  
  inline def apply(): ParamsResourceLocalinventoryCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocalinventoryCustombatch]
  }
  
  extension [Self <: ParamsResourceLocalinventoryCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaLocalinventoryCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
