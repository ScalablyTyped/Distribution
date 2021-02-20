package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceConfigVersionsResponse extends StObject {
  
  /** The device configuration for the last few versions. Versions are listed in decreasing order, starting from the most recent one. */
  var deviceConfigs: js.UndefOr[js.Array[DeviceConfig]] = js.native
}
object ListDeviceConfigVersionsResponse {
  
  @scala.inline
  def apply(): ListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceConfigVersionsResponse]
  }
  
  @scala.inline
  implicit class ListDeviceConfigVersionsResponseMutableBuilder[Self <: ListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceConfigs(value: js.Array[DeviceConfig]): Self = StObject.set(x, "deviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigsUndefined: Self = StObject.set(x, "deviceConfigs", js.undefined)
    
    @scala.inline
    def setDeviceConfigsVarargs(value: DeviceConfig*): Self = StObject.set(x, "deviceConfigs", js.Array(value :_*))
  }
}
