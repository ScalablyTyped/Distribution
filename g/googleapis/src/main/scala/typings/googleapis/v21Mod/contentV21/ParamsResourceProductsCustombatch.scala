package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductsCustomBatchRequest] = js.undefined
}
object ParamsResourceProductsCustombatch {
  
  inline def apply(): ParamsResourceProductsCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsCustombatch]
  }
  
  extension [Self <: ParamsResourceProductsCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaProductsCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
