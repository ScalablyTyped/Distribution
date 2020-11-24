package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayListApiConfigsResponse extends js.Object {
  
  /** API Configs. */
  var apiConfigs: js.UndefOr[js.Array[ApigatewayApiConfig]] = js.native
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachableLocations: js.UndefOr[js.Array[String]] = js.native
}
object ApigatewayListApiConfigsResponse {
  
  @scala.inline
  def apply(): ApigatewayListApiConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListApiConfigsResponse]
  }
  
  @scala.inline
  implicit class ApigatewayListApiConfigsResponseOps[Self <: ApigatewayListApiConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setApiConfigsVarargs(value: ApigatewayApiConfig*): Self = this.set("apiConfigs", js.Array(value :_*))
    
    @scala.inline
    def setApiConfigs(value: js.Array[ApigatewayApiConfig]): Self = this.set("apiConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiConfigs: Self = this.set("apiConfigs", js.undefined)
    
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
