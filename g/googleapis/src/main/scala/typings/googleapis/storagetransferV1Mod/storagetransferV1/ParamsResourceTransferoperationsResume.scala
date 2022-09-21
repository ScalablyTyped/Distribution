package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransferoperationsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the transfer operation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResumeTransferOperationRequest] = js.undefined
}
object ParamsResourceTransferoperationsResume {
  
  inline def apply(): ParamsResourceTransferoperationsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransferoperationsResume]
  }
  
  extension [Self <: ParamsResourceTransferoperationsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResumeTransferOperationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
