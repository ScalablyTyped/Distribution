package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayGatewayConfig extends js.Object {
  
  /** Required. Backend settings that are applied to all backends of the Gateway. */
  var backendConfig: js.UndefOr[ApigatewayBackendConfig] = js.native
}
object ApigatewayGatewayConfig {
  
  @scala.inline
  def apply(): ApigatewayGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayGatewayConfig]
  }
  
  @scala.inline
  implicit class ApigatewayGatewayConfigOps[Self <: ApigatewayGatewayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackendConfig(value: ApigatewayBackendConfig): Self = this.set("backendConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendConfig: Self = this.set("backendConfig", js.undefined)
  }
}
