package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUsageLogEvents extends StObject {
  
  /** The name of the device in the form ‘enterprises/{enterpriseId}/devices/{deviceId}’ */
  var device: js.UndefOr[String] = js.undefined
  
  /** The device timestamp when the batch of events were collected from the device. */
  var retrievalTime: js.UndefOr[String] = js.undefined
  
  /** The list of UsageLogEvent that were reported by the device, sorted chronologically by the event time. */
  var usageLogEvents: js.UndefOr[js.Array[UsageLogEvent]] = js.undefined
  
  /** The resource name of the user that owns this device in the form ‘enterprises/{enterpriseId}/users/{userId}’. */
  var user: js.UndefOr[String] = js.undefined
}
object BatchUsageLogEvents {
  
  inline def apply(): BatchUsageLogEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUsageLogEvents]
  }
  
  extension [Self <: BatchUsageLogEvents](x: Self) {
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setRetrievalTime(value: String): Self = StObject.set(x, "retrievalTime", value.asInstanceOf[js.Any])
    
    inline def setRetrievalTimeUndefined: Self = StObject.set(x, "retrievalTime", js.undefined)
    
    inline def setUsageLogEvents(value: js.Array[UsageLogEvent]): Self = StObject.set(x, "usageLogEvents", value.asInstanceOf[js.Any])
    
    inline def setUsageLogEventsUndefined: Self = StObject.set(x, "usageLogEvents", js.undefined)
    
    inline def setUsageLogEventsVarargs(value: UsageLogEvent*): Self = StObject.set(x, "usageLogEvents", js.Array(value*))
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
