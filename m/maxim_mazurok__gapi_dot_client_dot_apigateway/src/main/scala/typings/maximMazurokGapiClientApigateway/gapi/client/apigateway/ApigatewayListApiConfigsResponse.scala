package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayListApiConfigsResponse extends StObject {
  
  /** API Configs. */
  var apiConfigs: js.UndefOr[js.Array[ApigatewayApiConfig]] = js.undefined
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachableLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object ApigatewayListApiConfigsResponse {
  
  @scala.inline
  def apply(): ApigatewayListApiConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListApiConfigsResponse]
  }
  
  @scala.inline
  implicit class ApigatewayListApiConfigsResponseMutableBuilder[Self <: ApigatewayListApiConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiConfigs(value: js.Array[ApigatewayApiConfig]): Self = StObject.set(x, "apiConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiConfigsUndefined: Self = StObject.set(x, "apiConfigs", js.undefined)
    
    @scala.inline
    def setApiConfigsVarargs(value: ApigatewayApiConfig*): Self = StObject.set(x, "apiConfigs", js.Array(value :_*))
    
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
