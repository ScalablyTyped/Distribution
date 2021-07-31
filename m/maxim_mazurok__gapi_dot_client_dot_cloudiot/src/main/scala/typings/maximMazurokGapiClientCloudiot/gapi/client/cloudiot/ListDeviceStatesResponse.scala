package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceStatesResponse extends StObject {
  
  /** The last few device states. States are listed in descending order of server update time, starting from the most recent one. */
  var deviceStates: js.UndefOr[js.Array[DeviceState]] = js.undefined
}
object ListDeviceStatesResponse {
  
  @scala.inline
  def apply(): ListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceStatesResponse]
  }
  
  @scala.inline
  implicit class ListDeviceStatesResponseMutableBuilder[Self <: ListDeviceStatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceStates(value: js.Array[DeviceState]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesVarargs(value: DeviceState*): Self = StObject.set(x, "deviceStates", js.Array(value :_*))
  }
}
