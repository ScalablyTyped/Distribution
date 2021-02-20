package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ListDevicesResponse extends StObject {
  
  /** Devices meeting the list restrictions. */
  var devices: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1Device]] = js.native
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1ListDevicesResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListDevicesResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ListDevicesResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ListDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[GoogleAppsCloudidentityDevicesV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: GoogleAppsCloudidentityDevicesV1Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
