package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceListChangedEvent extends StObject {
  
  var devices: DeviceMap
}
object DeviceListChangedEvent {
  
  inline def apply(devices: DeviceMap): DeviceListChangedEvent = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceListChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceListChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: DeviceMap): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
