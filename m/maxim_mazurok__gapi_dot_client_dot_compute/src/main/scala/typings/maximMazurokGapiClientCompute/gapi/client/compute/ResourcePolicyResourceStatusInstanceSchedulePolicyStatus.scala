package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyResourceStatusInstanceSchedulePolicyStatus extends StObject {
  
  /** [Output Only] The last time the schedule successfully ran. The timestamp is an RFC3339 string. */
  var lastRunStartTime: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string. */
  var nextRunStartTime: js.UndefOr[String] = js.undefined
}
object ResourcePolicyResourceStatusInstanceSchedulePolicyStatus {
  
  inline def apply(): ResourcePolicyResourceStatusInstanceSchedulePolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyResourceStatusInstanceSchedulePolicyStatus]
  }
  
  extension [Self <: ResourcePolicyResourceStatusInstanceSchedulePolicyStatus](x: Self) {
    
    inline def setLastRunStartTime(value: String): Self = StObject.set(x, "lastRunStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunStartTimeUndefined: Self = StObject.set(x, "lastRunStartTime", js.undefined)
    
    inline def setNextRunStartTime(value: String): Self = StObject.set(x, "nextRunStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextRunStartTimeUndefined: Self = StObject.set(x, "nextRunStartTime", js.undefined)
  }
}
