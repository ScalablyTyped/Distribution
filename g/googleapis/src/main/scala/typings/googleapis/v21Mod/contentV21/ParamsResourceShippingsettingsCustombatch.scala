package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceShippingsettingsCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaShippingsettingsCustomBatchRequest] = js.undefined
}
object ParamsResourceShippingsettingsCustombatch {
  
  inline def apply(): ParamsResourceShippingsettingsCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShippingsettingsCustombatch]
  }
  
  extension [Self <: ParamsResourceShippingsettingsCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaShippingsettingsCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
