package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceState extends StObject {
  
  /** The device state data. */
  var binaryData: js.UndefOr[String] = js.undefined
  
  /** [Output only] The time at which this state version was updated in Cloud IoT Core. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object DeviceState {
  
  inline def apply(): DeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceState]
  }
  
  extension [Self <: DeviceState](x: Self) {
    
    inline def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
