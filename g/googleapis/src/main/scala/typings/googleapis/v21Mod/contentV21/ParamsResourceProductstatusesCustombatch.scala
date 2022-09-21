package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductstatusesCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductstatusesCustomBatchRequest] = js.undefined
}
object ParamsResourceProductstatusesCustombatch {
  
  inline def apply(): ParamsResourceProductstatusesCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductstatusesCustombatch]
  }
  
  extension [Self <: ParamsResourceProductstatusesCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaProductstatusesCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
