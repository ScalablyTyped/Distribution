package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse extends StObject {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
