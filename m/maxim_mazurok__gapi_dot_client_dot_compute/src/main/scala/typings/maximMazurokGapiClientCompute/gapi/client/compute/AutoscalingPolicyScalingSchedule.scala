package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPolicyScalingSchedule extends StObject {
  
  /** A description of a scaling schedule. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean value that specifies whether a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect. This field is optional,
    * and its value is false by default.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** The duration of time intervals, in seconds, for which this scaling schedule is to run. The minimum allowed value is 300. This field is required. */
  var durationSec: js.UndefOr[Double] = js.undefined
  
  /** The minimum number of VM instances that the autoscaler will recommend in time intervals starting according to schedule. This field is required. */
  var minRequiredReplicas: js.UndefOr[Double] = js.undefined
  
  /**
    * The start timestamps of time intervals when this scaling schedule is to provide a scaling signal. This field uses the extended cron format (with an optional year field). The
    * expression can describe a single timestamp if the optional year is set, in which case the scaling schedule runs once. The schedule is interpreted with respect to time_zone. This
    * field is required. Note: These timestamps only describe when autoscaler starts providing the scaling signal. The VMs need additional time to become serving.
    */
  var schedule: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone to use when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database. This field is
    * assigned a default value of “UTC” if left empty.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object AutoscalingPolicyScalingSchedule {
  
  inline def apply(): AutoscalingPolicyScalingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyScalingSchedule]
  }
  
  extension [Self <: AutoscalingPolicyScalingSchedule](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDurationSec(value: Double): Self = StObject.set(x, "durationSec", value.asInstanceOf[js.Any])
    
    inline def setDurationSecUndefined: Self = StObject.set(x, "durationSec", js.undefined)
    
    inline def setMinRequiredReplicas(value: Double): Self = StObject.set(x, "minRequiredReplicas", value.asInstanceOf[js.Any])
    
    inline def setMinRequiredReplicasUndefined: Self = StObject.set(x, "minRequiredReplicas", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
