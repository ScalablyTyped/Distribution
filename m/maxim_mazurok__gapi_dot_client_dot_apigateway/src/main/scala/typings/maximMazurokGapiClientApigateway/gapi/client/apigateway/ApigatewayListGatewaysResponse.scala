package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayListGatewaysResponse extends StObject {
  
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
  implicit class ApigatewayListGatewaysResponseMutableBuilder[Self <: ApigatewayListGatewaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateways(value: js.Array[ApigatewayGateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    @scala.inline
    def setGatewaysVarargs(value: ApigatewayGateway*): Self = StObject.set(x, "gateways", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    @scala.inline
    def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value :_*))
  }
}
