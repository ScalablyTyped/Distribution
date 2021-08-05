package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayGatewayConfig extends StObject {
  
  /** Required. Backend settings that are applied to all backends of the Gateway. */
  var backendConfig: js.UndefOr[ApigatewayBackendConfig] = js.undefined
}
object ApigatewayGatewayConfig {
  
  inline def apply(): ApigatewayGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayGatewayConfig]
  }
  
  extension [Self <: ApigatewayGatewayConfig](x: Self) {
    
    inline def setBackendConfig(value: ApigatewayBackendConfig): Self = StObject.set(x, "backendConfig", value.asInstanceOf[js.Any])
    
    inline def setBackendConfigUndefined: Self = StObject.set(x, "backendConfig", js.undefined)
  }
}
