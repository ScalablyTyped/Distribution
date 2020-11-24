package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayListGatewaysResponse extends js.Object {
  
  /** Gateways. */
  var gateways: js.UndefOr[js.Array[ApigatewayGateway]] = js.native
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachableLocations: js.UndefOr[js.Array[String]] = js.native
}
object ApigatewayListGatewaysResponse {
  
  @scala.inline
  def apply(): ApigatewayListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListGatewaysResponse]
  }
  
  @scala.inline
  implicit class ApigatewayListGatewaysResponseOps[Self <: ApigatewayListGatewaysResponse] (val x: Self) extends AnyVal {
    
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
    def setGatewaysVarargs(value: ApigatewayGateway*): Self = this.set("gateways", js.Array(value :_*))
    
    @scala.inline
    def setGateways(value: js.Array[ApigatewayGateway]): Self = this.set("gateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateways: Self = this.set("gateways", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableLocationsVarargs(value: String*): Self = this.set("unreachableLocations", js.Array(value :_*))
    
    @scala.inline
    def setUnreachableLocations(value: js.Array[String]): Self = this.set("unreachableLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachableLocations: Self = this.set("unreachableLocations", js.undefined)
  }
}
