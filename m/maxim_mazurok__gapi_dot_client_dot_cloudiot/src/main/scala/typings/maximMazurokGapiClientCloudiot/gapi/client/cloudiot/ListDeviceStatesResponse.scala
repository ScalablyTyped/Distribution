package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceStatesResponse extends StObject {
  
  /** The last few device states. States are listed in descending order of server update time, starting from the most recent one. */
  var deviceStates: js.UndefOr[js.Array[DeviceState]] = js.undefined
}
object ListDeviceStatesResponse {
  
  inline def apply(): ListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceStatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeviceStatesResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceStates(value: js.Array[DeviceState]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    inline def setDeviceStatesVarargs(value: DeviceState*): Self = StObject.set(x, "deviceStates", js.Array(value*))
  }
}
