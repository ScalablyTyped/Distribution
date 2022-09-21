package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesSetoperationstatus
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetOperationStatusRequest] = js.undefined
}
object ParamsResourcePipelinesSetoperationstatus {
  
  inline def apply(): ParamsResourcePipelinesSetoperationstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesSetoperationstatus]
  }
  
  extension [Self <: ParamsResourcePipelinesSetoperationstatus](x: Self) {
    
    inline def setRequestBody(value: SchemaSetOperationStatusRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
