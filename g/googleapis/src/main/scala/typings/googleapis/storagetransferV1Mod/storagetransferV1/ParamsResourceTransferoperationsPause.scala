package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransferoperationsPause
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the transfer operation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPauseTransferOperationRequest] = js.undefined
}
object ParamsResourceTransferoperationsPause {
  
  inline def apply(): ParamsResourceTransferoperationsPause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransferoperationsPause]
  }
  
  extension [Self <: ParamsResourceTransferoperationsPause](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPauseTransferOperationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
