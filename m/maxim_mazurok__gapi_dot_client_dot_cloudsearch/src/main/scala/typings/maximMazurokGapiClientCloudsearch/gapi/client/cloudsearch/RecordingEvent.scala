package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingEvent extends StObject {
  
  /** The initiator of the latest event of the recording. It will be set for all user events (`type` is 100-199) and unset for all server events (`type` is 200-299). */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** The type of event. */
  var `type`: js.UndefOr[String] = js.undefined
}
object RecordingEvent {
  
  inline def apply(): RecordingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingEvent]
  }
  
  extension [Self <: RecordingEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
