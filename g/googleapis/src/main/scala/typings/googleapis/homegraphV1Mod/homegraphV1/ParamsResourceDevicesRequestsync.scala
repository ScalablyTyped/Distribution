package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesRequestsync
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRequestSyncDevicesRequest] = js.undefined
}
object ParamsResourceDevicesRequestsync {
  
  inline def apply(): ParamsResourceDevicesRequestsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesRequestsync]
  }
  
  extension [Self <: ParamsResourceDevicesRequestsync](x: Self) {
    
    inline def setRequestBody(value: SchemaRequestSyncDevicesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
