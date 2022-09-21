package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductstatusesCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Flag to include full product data in the results of this request. The default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
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
    
    inline def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    inline def setRequestBody(value: SchemaProductstatusesCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
