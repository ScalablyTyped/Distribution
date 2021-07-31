package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayListLocationsResponse extends StObject {
  
  /** A list of locations that matches the specified filter in the request. */
  var locations: js.UndefOr[js.Array[ApigatewayLocation]] = js.undefined
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ApigatewayListLocationsResponse {
  
  @scala.inline
  def apply(): ApigatewayListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListLocationsResponse]
  }
  
  @scala.inline
  implicit class ApigatewayListLocationsResponseMutableBuilder[Self <: ApigatewayListLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[ApigatewayLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: ApigatewayLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
