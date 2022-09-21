package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyInstanceSchedulePolicySchedule extends StObject {
  
  /** Specifies the frequency for the operation, using the unix-cron format. */
  var schedule: js.UndefOr[String] = js.undefined
}
object ResourcePolicyInstanceSchedulePolicySchedule {
  
  inline def apply(): ResourcePolicyInstanceSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyInstanceSchedulePolicySchedule]
  }
  
  extension [Self <: ResourcePolicyInstanceSchedulePolicySchedule](x: Self) {
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
