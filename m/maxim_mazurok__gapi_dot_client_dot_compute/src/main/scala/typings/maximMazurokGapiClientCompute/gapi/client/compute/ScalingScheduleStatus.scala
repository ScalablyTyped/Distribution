package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingScheduleStatus extends StObject {
  
  /**
    * [Output Only] The last time the scaling schedule became active. Note: this is a timestamp when a schedule actually became active, not when it was planned to do so. The timestamp is
    * in RFC3339 text format.
    */
  var lastStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The next time the scaling schedule is to become active. Note: this is a timestamp when a schedule is planned to run, but the actual time might be slightly different.
    * The timestamp is in RFC3339 text format.
    */
  var nextStartTime: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The current state of a scaling schedule. */
  var state: js.UndefOr[String] = js.undefined
}
object ScalingScheduleStatus {
  
  inline def apply(): ScalingScheduleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingScheduleStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingScheduleStatus] (val x: Self) extends AnyVal {
    
    inline def setLastStartTime(value: String): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setNextStartTime(value: String): Self = StObject.set(x, "nextStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextStartTimeUndefined: Self = StObject.set(x, "nextStartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
