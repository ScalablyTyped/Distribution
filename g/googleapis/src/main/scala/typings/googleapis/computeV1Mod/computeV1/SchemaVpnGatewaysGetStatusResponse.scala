package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewaysGetStatusResponse extends StObject {
  
  var result: js.UndefOr[SchemaVpnGatewayStatus] = js.undefined
}
object SchemaVpnGatewaysGetStatusResponse {
  
  inline def apply(): SchemaVpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysGetStatusResponse]
  }
  
  extension [Self <: SchemaVpnGatewaysGetStatusResponse](x: Self) {
    
    inline def setResult(value: SchemaVpnGatewayStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
