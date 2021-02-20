package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayListApisResponse extends StObject {
  
  /** APIs. */
  var apis: js.UndefOr[js.Array[ApigatewayApi]] = js.native
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachableLocations: js.UndefOr[js.Array[String]] = js.native
}
object ApigatewayListApisResponse {
  
  @scala.inline
  def apply(): ApigatewayListApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListApisResponse]
  }
  
  @scala.inline
  implicit class ApigatewayListApisResponseMutableBuilder[Self <: ApigatewayListApisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApis(value: js.Array[ApigatewayApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    @scala.inline
    def setApisVarargs(value: ApigatewayApi*): Self = StObject.set(x, "apis", js.Array(value :_*))
    
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
