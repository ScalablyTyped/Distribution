package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDiscoveryClientStatus
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClientStatusRequest] = js.undefined
}
object ParamsResourceDiscoveryClientStatus {
  
  inline def apply(): ParamsResourceDiscoveryClientStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDiscoveryClientStatus]
  }
  
  extension [Self <: ParamsResourceDiscoveryClientStatus](x: Self) {
    
    inline def setRequestBody(value: SchemaClientStatusRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
