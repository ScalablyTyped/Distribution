package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePosCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPosCustomBatchRequest] = js.undefined
}
object ParamsResourcePosCustombatch {
  
  inline def apply(): ParamsResourcePosCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePosCustombatch]
  }
  
  extension [Self <: ParamsResourcePosCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaPosCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
