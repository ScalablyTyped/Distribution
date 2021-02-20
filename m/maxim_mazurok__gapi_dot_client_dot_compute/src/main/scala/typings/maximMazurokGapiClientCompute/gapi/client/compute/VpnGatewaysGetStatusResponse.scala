package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewaysGetStatusResponse extends StObject {
  
  var result: js.UndefOr[VpnGatewayStatus] = js.native
}
object VpnGatewaysGetStatusResponse {
  
  @scala.inline
  def apply(): VpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewaysGetStatusResponse]
  }
  
  @scala.inline
  implicit class VpnGatewaysGetStatusResponseMutableBuilder[Self <: VpnGatewaysGetStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: VpnGatewayStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
