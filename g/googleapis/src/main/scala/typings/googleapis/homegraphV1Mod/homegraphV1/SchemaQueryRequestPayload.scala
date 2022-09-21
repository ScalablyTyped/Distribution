package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryRequestPayload extends StObject {
  
  /**
    * Third-party device IDs for which to get the device states.
    */
  var devices: js.UndefOr[js.Array[SchemaAgentDeviceId]] = js.undefined
}
object SchemaQueryRequestPayload {
  
  inline def apply(): SchemaQueryRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRequestPayload]
  }
  
  extension [Self <: SchemaQueryRequestPayload](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaAgentDeviceId]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaAgentDeviceId*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
