package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayListGatewaysResponse extends StObject {
  
  /** Gateways. */
  var gateways: js.UndefOr[js.Array[ApigatewayGateway]] = js.undefined
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachableLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object ApigatewayListGatewaysResponse {
  
  inline def apply(): ApigatewayListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListGatewaysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApigatewayListGatewaysResponse] (val x: Self) extends AnyVal {
    
    inline def setGateways(value: js.Array[ApigatewayGateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: ApigatewayGateway*): Self = StObject.set(x, "gateways", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
